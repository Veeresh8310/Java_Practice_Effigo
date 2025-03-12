package Day_2;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;
public class XmlSchemaValidation {

		@Test
		void XmlSchemaValidation()
		{
			
			 given()
				
			.when()
				.get("https://mocktarget.apigee.net/xml")
			
			.then()
				.assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("xmlschema.xsd"));
		}

	}



