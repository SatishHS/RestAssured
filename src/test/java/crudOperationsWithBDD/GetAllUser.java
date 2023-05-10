package crudOperationsWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllUser 
{
	@Test
	public void getUser()
	{
		baseURI= "https://reqres.in/";
		
		when()
		.get("api/unknown/2")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
//		Step 1: create pre-requesites - body
		
		
//		Step 2: send request
		
		
//		Step 3: validate response
		
		
	}

}
