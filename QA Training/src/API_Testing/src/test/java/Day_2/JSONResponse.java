package Day_2;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JSONResponse {
	
	@Test(priority=1)
	void testJSONResponse()
	{
		
		//Approach-1 to validate JSON when there is small data returned
//	  given()
//			.contentType(ContentType.JSON)
//		.when()
//			.get("http://localhost:3000/countries")
//		
//		.then()
//			.statusCode(200)
//		    .body("[3].code",equalTo("AT"));
		
		//Approach-2 to validate JSON when there is large data returned

//		Response res=given()
//			.contentType(ContentType.JSON)
//		.when()
//			.get("http://localhost:3000/countries");
//		Assert.assertEquals(res.getStatusCode(), 200);
//		Assert.assertEquals(res.header("Content-Type"),"application/json");
//		
//		String country=res.jsonPath().get("[3].code").toString();
//		Assert.assertEquals(country, "AT");
		
		//when the order of the json object changed, then how to approach to validate 
		
		
		Response res=given()
				.contentType(ContentType.JSON)
			.when()
				.get("http://localhost:3000/countries");
		
		JSONObject j=new JSONObject(res.asString());
		boolean status =false;
		for(int i=0;i<j.getJSONArray("countries").length();i++)
		{
			String name=j.getJSONArray("countries").getJSONObject(i).get("name").toString();
			System.out.println(name);
			
			if(name.equals("Algeria"))
			{
				status=true;
				break;
			}
		}
		
		Assert.assertEquals(status, true);
		

		
	}
	
	
	
	

}
