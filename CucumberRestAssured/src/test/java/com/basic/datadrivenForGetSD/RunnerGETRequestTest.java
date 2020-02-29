package com.basic.datadrivenForGetSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/datadrivenForGetFF/"},
		glue={"com/basic/datadrivenForGetSD/"},
		monochrome=true

		
		)

public class RunnerGETRequestTest
{
	
}
