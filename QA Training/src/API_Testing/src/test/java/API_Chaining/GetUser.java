package API_Chaining;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class GetUser {
	
	@Test
	void getUser(ITestContext context)
	{
//		int id=(Integer)context.getAttribute("user_id");
		int id=(Integer)context.getSuite().getAttribute("user_id");
		String bearerToken="c35e10e748c6f113775527bcef204e9929b4c9f4b995a8ee253eec46aed57b06";
		
		given()
			.headers("Authorization","Bearer "+bearerToken)
			.pathParam("id", id)
		
	   .when()
	   		.get("https://gorest.co.in/public/v2/users/{id}")
	   	
	   .then()
	   		.statusCode(200)
	   		.log().all();
		  	
	}

}
