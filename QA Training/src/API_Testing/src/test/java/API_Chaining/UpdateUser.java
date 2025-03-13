package API_Chaining;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
public class UpdateUser {
		
		@Test
		void updateUser(ITestContext context)
		{
			Faker faker=new Faker();
			
			JSONObject j=new JSONObject();
			j.put("name", faker.name().fullName());
			j.put("email", faker.internet().emailAddress());
			j.put("gender","Male");
			j.put("status", "active");
			
			String bearerToken="c35e10e748c6f113775527bcef204e9929b4c9f4b995a8ee253eec46aed57b06";
			
//			int id=(Integer)context.getAttribute("user_id");
			int id=(Integer)context.getSuite().getAttribute("user_id");
			given()
				.headers("Authorization","Bearer "+bearerToken)
				.contentType("application/json")
				.pathParam("id", id)
				.body(j.toString())
			
				 .when()
			   		.get("https://gorest.co.in/public/v2/users/{id}")
			   	
			   .then()
			   		.statusCode(200)
			   		.log().all();
			
			System.out.println("The Generated ID is: "+id);
			  	
		}

}
