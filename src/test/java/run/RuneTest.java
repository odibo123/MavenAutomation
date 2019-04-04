package run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(   
	  features = {"src/test/resource"},
	
	  format = {"pretty" ,"json:target/cucumber.json"},
	  
	  strict = false
	 
	 
	 
		 )
public class RuneTest {

}
