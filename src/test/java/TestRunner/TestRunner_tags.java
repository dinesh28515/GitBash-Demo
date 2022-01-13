package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\DD\\IdeaProjects\\MyMaven\\Feature"},
        glue = {"StepDefinitions"}
)

public class TestRunner_tags {
}
