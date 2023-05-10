package operationsCRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUsers 
{
	@Test
	public void getUsers()
	{
//		Step 1: create pre-requesites - body
		
		  
//		Step 2: send request
		Response resp = RestAssured.get("https://reqres.in/api/users");
		
		
//		Step 3: validate response
		ValidatableResponse val = resp.then();
		val.log().all();
	}

}

