package poc_tdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", tags = "@BancoTeste", 
glue = "", monochrome = true, dryRun = false)
public class BancoTeste {

}
