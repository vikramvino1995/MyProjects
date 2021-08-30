package org.reqres;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGet {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://reqres.in";

		Response res = RestAssured.given().header("Content-Type", "application/json").queryParam("page", "2").when()
				.get("api/users");

		// to get status code

		int statusCode = res.getStatusCode();

		System.out.println(statusCode);

		// to get Response Body

		String body = res.getBody().asString();

		System.out.println(body);

	}
}
