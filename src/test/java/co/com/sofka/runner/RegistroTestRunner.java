package co.com.sofka.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        features = {"src/test/resources/features/Registro.feature"},
        glue = "co.com.sofka.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"}

)
public class RegistroTestRunner {
}
