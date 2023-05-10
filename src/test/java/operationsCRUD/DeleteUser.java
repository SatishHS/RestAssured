package operationsCRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteUser 
{
		@Test
		public void deleteUser()
		{
//			Step 1: create pre-requesites - body
			
			
//			Step 2: send request
			Response resp = RestAssured.delete("https://reqres.in/api/users/2");
			
			
//			Step 3: validate response
			ValidatableResponse val = resp.then();
			val.log().all();
		}

}
