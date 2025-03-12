package Day_1;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LogginDemo {
	
	@Test
	void testLogin()
	{
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
			.log().body();
//			.log().cookies();
//		    .log().all();
//		    .log().headers();
	}
	
}
