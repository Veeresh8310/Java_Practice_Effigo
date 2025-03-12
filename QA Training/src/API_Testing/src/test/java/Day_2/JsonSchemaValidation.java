package Day_2;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaValidation {
	
	@Test
	void jsonSchemaValidation()
	{
		
		 given()
			
		.when()
			.get("http://localhost:3000/countries")
		
		.then()
			.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("JsonSchema.json"))
			.statusCode(200);
	}


}

