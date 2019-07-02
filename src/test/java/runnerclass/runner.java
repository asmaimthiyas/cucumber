package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/cucum2.feature"},
		glue="stepdef",
		//plugin="html:target/html-reports",
		//plugin="junit:target/xmlreport.xml")
		 plugin="json:target/json-report.json")
		
//tags={"@smoke"})
		
public class runner {
	

}
