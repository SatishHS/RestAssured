package operationsCRUD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateUser 
{
	@Test
	public void createUser()
	{
//		Step 1: create pre-requesites - body
		JSONObject obj = new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
		
//		Step 2: send request
		RequestSpecification request = RestAssured.given();		//given is used when we have pre-requesit
		request.body(obj);
		request.contentType(ContentType.JSON);
		
		Response resp = request.post("https://reqres.in/api/users");
		
//		Step 3: validate response
		System.out.println(resp.getStatusCode());
		
		resp.getStatusCode();			//get only status code
		resp.asString();				//get the body as string in one line
		resp.prettyPrint();				//gets the body in jason format
		resp.prettyPeek();				//gets header body everything, so it s used compares to others
		
		ValidatableResponse val = resp.then();
		val.log().all();				//with this all the details are obtained, so in real time this s used more
		
	}

}
