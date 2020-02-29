package com.basic.getRequestBasicSD;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestBasicSD {
	
	Response res;
	
	@Given("^race circuit application is running$")
	public void race_circuit_application_is_runninge()
	{
		System.out.println("Application ready to use");
	}
	
	@When("^I hit get request to get response$")
	public void I_hit_get_request_to_get_response()
	{
		res = RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		String actualData=res.getBody().asString();
		
	}
	
//	@Then("^I validate circuit \"([^\"]*)\" value as \"([^\"]*)\" present$")
//	{
//	public void i_validate_circuite_value_as_present(String jPath,String valueTobevalidated);	
//	String attrValue=res.body().jsonPath().getString(jPath);
////	Assert.assertTrue
//	}
//	
	
	@Then("^I validate circuite limit value$")
	public void I_validate_circuite_limit_value()
	{
//		String limitValue=res.body().jsonPath().getString("MRData.limit");
//		Assert.assertTrue(limitValue.equals("30"));
		
		String totalValue=res.body().jsonPath().getString("MRData.total");
		int totalIntV=Integer.parseInt(totalValue);
		
		for(int i=0;i<=totalIntV;i++)
		{
			String idValue=res.body().jsonPath().getString("MRData.circuitTable.");
					if(idValue.equals("americas"))
					{
						Assert.assertTrue(idValue.equals("americas"));
						break;
					}
					else {
						if(i==totalIntV-1)
							Assert.assertTrue(false);
					}
		}
		
	}

}
