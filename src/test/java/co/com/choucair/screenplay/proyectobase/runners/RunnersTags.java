package co.com.choucair.screenplay.proyectobase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/choucair_academy.feature",
        tags = "@stories",
        glue = "co/com/choucair/screenplay/proyectobase/stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnersTags {
}