package Day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Authentications { 
	
	//@Test(priority=1)
		void testBasicAuthentication()
		{
			given()
				.auth().basic("postman", "password"	)		
				
				.when()
				.get("https://postman-echo.com/basic-auth")
			
			.then()
				.statusCode(200)
				.body("authenticated",equalTo(true))
				.log().all();
		}
		//@Test(priority=2)
		void testDigestAuthentication()
		{
			
			given()
				.auth().digest("postman", "password"	)		
				
				.when()
				.get("https://postman-echo.com/basic-auth")
			
			.then()
				.statusCode(200)
				.body("authenticated",equalTo(true))
				.log().all();
			
		}
		//@Test(priority=3)
		void testPreemptiveAuthentication()
		{
			
			given()
				.auth().preemptive().basic("postman", "password")		
				
				.when()
				.get("https://postman-echo.com/basic-auth")
			
			.then()
				.statusCode(200)
				.body("authenticated",equalTo(true))
				.log().all();
			
		}
		//@Test(priority=4)
		void testBearerTokenAuthentication()
		{
			String bearerToken="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";
			
			given()
				.headers("Authorization", "Bearer "+bearerToken)		
				
				.when()
				.get("https://api.github.com/user/repos")
			
			.then()
				.statusCode(200)
				.log().all();
			
		}
		//@Test(priority=5)
		void testOAuth1Authentication()
		{
			
			given()
				.auth().oauth("ConsumerKey","ConsumerSecrate","accessToken", "TokenSecrate")		
				
				.when()
				.get("URL")
			
			.then()
				.statusCode(200)
				.log().all();
			
		}
		//@Test(priority=5)
		void testOAuth2Authentication()
		{
			
			given()
				.auth().oauth2("ghp_24pH0Icz1PKHC1q0tLwj57AuDYmtSz2fuYKP")		
				
				.when()
				.get("https://api.github.com/user/repos")
			
			.then()
				.statusCode(200) 
				.log().all();
			
		}
		@Test(priority=5)
		void testApiKeyAuthentication()
		{
			//Method1
//			given()
//				.queryParam("appid","fe9c5cddb7e01d747b4611c3fc9eaf2c") //api id is APIKey		
//				
//				.when()
//				.get("https://api.openweathermap.org/data/2.5/forecast/daily?q=Delhi&units=metric&cnt=7")
//			
//			.then()
//				.statusCode(200) 
//				.log().all();
			
			//Method - 2
		given()
			.queryParam("appid","fe9c5cddb7e01d747b4611c3fc9eaf2c") //api id is APIKey		
			.pathParam("mypath","data/2.5/forecast/daily")
			.queryParam("q","Delhi")
			.queryParam("units","metric")
			.queryParam("cnt","7")
			
			.when()
				.get("https://api.openweathermap.org/{mypath}")
			
			.then()
				.statusCode(200) 
				.log().all();
				
			
		}

}
