package crudOperationsWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

public class UpdateUser 
{
	@Test
	public void putPatchUser()
	{
		baseURI= "https://reqres.in/";
		
//		JSONObject obj = new JSONObject();
//		obj.put("name", "morpheus");
//		obj.put("job", "zion resident");
		
//		Instead of JASINOject we can also use HashMap which follows key value pair
//		HashMap obj= new HashMap();
//		obj.put("name", "morpheus");
//		obj.put("job", "zion resident");

//		Also we can use JSON file, so create a file in src/test/resources
		File obj=new File(".\\src\\test\\resources\\Data.json");
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.patch("api/users/2")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
		
		
//		Step 1: create pre-requesites - body
		
		
//		Step 2: send request
		
		
//		Step 3: validate response
		
		
	}

}
