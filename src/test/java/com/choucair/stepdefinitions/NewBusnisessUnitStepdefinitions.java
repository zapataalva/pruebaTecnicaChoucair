package com.choucair.stepdefinitions;

import com.choucair.taks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

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

    @When("Crea una unidad de negocio con el nombre {string} y parent unit {string}")
    public void creaUnaUnidadDeNegocioConElNombreYParentUnit(String string, String string2) {
    }

    @Then("Valida que la unidad exista en la lista")
    public void validaQueLaUnidadExistaEnLaLista() {
    }

}
