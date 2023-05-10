package crudOperationsWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import POJOClass.UserPojo;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUser 
{
	@Test
	public void postUser()
	{
		baseURI= "https://reqres.in/";
		
//		Step 1: create pre-requesites - body
//		JSONObject obj = new JSONObject();
//		obj.put("name", "morpheus");
//		obj.put("job", "leader");
//		instead of JSONObject, Hashmap, File.jason, we can use 
//		POJO class to create the body by calling an
//		object using constructor here
		
		UserPojo obj=new UserPojo("morpheus", "leader");
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("api/users")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
//		Step 2: send request
//		Step 3: validate response
		
		
	}

}
