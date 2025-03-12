package Day_1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Headers_Testing {
	
	@Test
	void testHeaders()
	{
		given()
		
		.when()
			.get("https://www.google.com/")
		
		.then()
			.header("Content-Type","text/html; charset=ISO-8859-1")
			.header("content-Encoding","gzip")
			.header("Server","gws")
			.log().headers();
	}

	//@Test
	void getHeaders()
	{
		Response res=given()
		
						.when()
							.get("https://www.google.com/");
		//single header
//		String header=res.getHeader("Content-Type");
//		System.out.println("The value of content-Type is: " +header);
		
		//get all headers information
		Headers headers=res.getHeaders();
		
		for(Header h:headers)
		{
			System.out.println(h.getName()+" "+h.getValue());
		}
		
							
	}
}
