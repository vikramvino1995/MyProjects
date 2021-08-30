package org.reqres;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGet {
	
	public static void main(String[] args) {
	
		//to set the base URI
		
		RestAssured.baseURI="https://reqres.in";
		
		//given(),when()
		
		Response res = RestAssured.given().header("Content-Type","application/json").queryParam("page","2").when().get("api/users");
		
		//to get status code
		
		int statusCode = res.getStatusCode();
		
		System.out.println(statusCode);
		
		//to get Response Body
		
		String body = res.getBody().asString();
		
		System.out.println(body);
		
	}
}
