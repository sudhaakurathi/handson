package Stepdefintion;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/handson.feature",
			      glue="Stepdefintion") 
// plugin="html:target/htmlreport"
public class RunnerClass {
	
}



