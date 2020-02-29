package com.basic.getRequestBasicsSD;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Headers;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import junit.framework.Assert;

public class HeaderValidationSD
{
	Response res; 
	//get all headers
//	Headers heds = res.getHeaders();
//	String v1 = heds.getValue("Content-Type");
//	System.out.println(heds);

	@Then("^user checks headers \"([^\"]*)\" have \"([^\"]*)\"$")
	public void user_checks_headers_have(String headerName, String headerValue) throws Throwable {
	    res=RestAssured.given().relaxedHTTPSValidation().get("https://ergast.com/api/f1/2017/circuits.json");
	    String completeResponse=res.asString();
	    System.out.println("========="+completeResponse);
		
//		Headers heds=res.getHeaders();
//		String actualHeaderValue=heds.getValue(headerName);
//		Assert.assertTrue(actualHeaderValue.equals(headerValue));
		
//		String v1=heds.getValue("Content-Type");
//		System.out.println(heds);
	    throw new PendingException();
	}
}

