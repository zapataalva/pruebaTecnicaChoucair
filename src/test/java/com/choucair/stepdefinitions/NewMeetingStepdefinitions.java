package com.choucair.stepdefinitions;

import com.choucair.questions.ValidateText;
import com.choucair.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.choucair.userinterfaces.MeetingPage.NAME_MEETING;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class NewMeetingStepdefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @When("Crea una reunion con los datos")
    public void creaUnaReunionConLosDatos(DataTable datosBasicosReunion) {
        theActorInTheSpotlight().attemptsTo(CreateMeeting.with(datosBasicosReunion));
    }

    @When("Crea una location con los datos")
    public void creaUnaLocationConLosDatos(DataTable datosLocation) {
        theActorInTheSpotlight().attemptsTo(CreateLocation.with(datosLocation));
    }

    @When("Crea el usuario organizador con los datos")
    public void creaElUsuarioOrganizadorConLosDatos(DataTable datosOrganizador) {
        theActorInTheSpotlight().attemptsTo(CreateOrganized.with(datosOrganizador));
    }

    @When("Crea la lista de asistentes con los datos")
    public void creaLaListaDeAsistentesConLosDatos(DataTable datosAsistentes) {
        theActorInTheSpotlight().attemptsTo(CreateAttendee.with(datosAsistentes));
    }

    @When("Selecciona el reportero {string}")
    public void seleccionaElReportero(String reportero) {
        theActorInTheSpotlight().attemptsTo(SelectReporter.with(reportero));
    }

    @When("Selecciona la unidad {string}")
    public void seleccionaLaUnidad(String unit) {
        theActorInTheSpotlight().attemptsTo(SelectUnit.with(unit));
    }

    @Then("Valida que la reunión {string} se haya creado correctamente")
    public void validaQueLaReuniónSeHayaCreadoCorrectamente(String text) {
        theActorInTheSpotlight().should(seeThat(ValidateText.with(NAME_MEETING,text), equalTo(text)));
    }
}
