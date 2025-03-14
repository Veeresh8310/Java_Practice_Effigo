package API_Chaining;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class CreateUser {
	
	@Test
	void createUser(ITestContext context)
	{
		Faker faker=new Faker();
		
		JSONObject j=new JSONObject();
		j.put("name", faker.name().fullName());
		j.put("email", faker.internet().emailAddress());
		j.put("gender","Male");
		j.put("status", "inactive");
		
		String bearerToken="c35e10e748c6f113775527bcef204e9929b4c9f4b995a8ee253eec46aed57b06";
		
		int id=given()
			.headers("Authorization","Bearer "+bearerToken)
			.contentType("application/json")
			.body(j.toString())
		
		.when()
			.post("https://gorest.co.in/public/v2/users")
			.jsonPath().getInt("id");
		System.out.println("The Generated ID is: "+id);
		
//		context.setAttribute("user_id", id);
		context.getSuite().setAttribute("user_id", id);
	}

}
