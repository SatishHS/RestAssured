package crudOperationsWithBDD;

import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;

public class DeleteUser 
{
	@Test
	public void deleteUser()
	{
		baseURI= "https://reqres.in/";
		when()
		.delete("api/users/2")
		.then()
		.assertThat().statusCode(204)
		.log().all();
		
//		Step 1: create pre-requesites - body
		
		
//		Step 2: send request
		
		
//		Step 3: validate response
		
		
	}

}
