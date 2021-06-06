package cucumber.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/zadanie-zalicz-1-chetni.feature",
        plugin = {"pretty","html:out"})

public class ZadanieZalicz_1_ChetniTest {
}
