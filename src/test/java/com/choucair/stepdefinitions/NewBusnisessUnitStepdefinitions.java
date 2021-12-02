package com.choucair.stepdefinitions;

import com.choucair.questions.ValidateText;
import com.choucair.taks.CreateNewBusinessUnit;
import com.choucair.taks.Login;
import com.choucair.userinterfaces.BusinessUnitPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class NewBusnisessUnitStepdefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @Given("{string} Desea navegar a la pagina {string}")
    public void deseaNavegarALaPagina(String actor, String url) {
        theActorCalled(actor).attemptsTo(Open.url(url));
    }

    @Given("Se logea con usuario {string} y password {string}")
    public void seLogeaConUsuarioYPassword(String user, String password) {
        theActorInTheSpotlight().attemptsTo(Login.with(user,password));
    }

    @When("Crea una unidad de negocio con el nombre {string}")
    public void creaUnaUnidadDeNegocioConElNombreYParentUnit(String name) {
        theActorInTheSpotlight().attemptsTo(CreateNewBusinessUnit.with(name));
    }

    @Then("Valida que la unidad {string} exista en la lista")
    public void validaQueLaUnidadExistaEnLaLista(String text) {
        theActorInTheSpotlight().should(seeThat(ValidateText.with(BusinessUnitPage.NAME_BUSINESS,text), equalTo(text)));
    }

}
