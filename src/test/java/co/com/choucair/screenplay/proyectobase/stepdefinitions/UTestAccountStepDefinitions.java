package co.com.choucair.screenplay.proyectobase.stepdefinitions;



import co.com.choucair.screenplay.proyectobase.tasks.Login;
import co.com.choucair.screenplay.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Performable;
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
        OnStage.theActorCalled("Bugh").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }

    @When("^he searches for the course (.*) on the Choucair Academy$")
    public void heSearchesForTheCoursePatronesDeAutomatizacionOnTheChoucairAcademy(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }

    @Then("^he finds the course called (.*)$")
    public void heFindsTheCourseCalledPatronesDeAutomatizacion(String question) {

    }

}
