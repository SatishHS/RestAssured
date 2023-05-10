package responseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import POJOClass.UserPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ResponseValidationTest 
{
	@Test
	public void responsevalidation()
	{
		String expData = "Satish"; 
		String expData2 = "Professor";
		
		UserPojo obj=new UserPojo("Satish", "Professor");
		baseURI="https://reqres.in/";
		
		Response resp = given()
						.body(obj)
						.contentType(ContentType.JSON)
						.when()
						.post("api/users");
		
//		To check for the body validation, chain has to be broken
//		and validated by using jsonPath()
		
		String actData = resp.jsonPath().get("name");
		String actData2 = resp.jsonPath().get("job");
		
		System.out.println(actData);
		System.out.println(actData2);
		
		resp.then().assertThat().contentType(ContentType.JSON).statusCode(201);
		resp.then().log().all();
		
		Assert.assertEquals(expData, actData);	//have kept at last to makesure
		Assert.assertEquals(expData2, actData2); //other lines have executed
		
	}

}
