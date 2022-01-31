package co.com.choucair.screenplay.proyectobase.stepdefinitions;



import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.screenplay.proyectobase.tasks.OpenUp;

public class UTestAccountStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than BUGH wants to learn automation at the Choucair Academy$")
    public void thanBUGHWantsToLearnAutomationAtTheChoucairAcademy() {
        OnStage.theActorCalled("Bugh").wasAbleTo(OpenUp.thePage());

    }

    @When("^he searches for the course Recursos Automatizacion Bancolombia on the Choucair Academy$")
    public void heSearchesForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademy() {

    }

    @Then("^he finds the course called Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledRecursosAutomatizacionBancolombia() {

    }

}
