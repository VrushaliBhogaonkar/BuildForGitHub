package com.basic.MyFirstSelenium;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/MyFirstSelenium/FirstSeleniumScriptFF2.feature",
				"src/test/resources/com/basic/MyFirstSelenium/FirstSeleniumScriptFF.feature"},
		glue={"com/basic/MyFirstSelenium/"},
		monochrome=true
		


		
		)

public class RunnerFirstSeleniumScriptTest {

}
