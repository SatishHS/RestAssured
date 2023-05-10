package operationsCRUD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateUser 
{
	@Test
	public void putUser()
	{
//		Step 1: create pre-requesites - body
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "zion resident");
		
		  
//		Step 2: send request
		RequestSpecification request = RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		
		Response resp = request.put("https://reqres.in/api/users/2");
		
		
//		Step 3: validate response
		ValidatableResponse val = resp.then();
		val.log().all();
	}

}
