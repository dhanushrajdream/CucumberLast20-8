package com.Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Data_Validation {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("/api/users?page=2");
		
		//System.out.println(response);
		String str = response.asString();
		
		System.out.println("Response Body:"+str);
		
		int statusCode = response.getStatusCode();
		
		System.out.println("Response status :"+statusCode);
		
	    
	
		
	}

}
