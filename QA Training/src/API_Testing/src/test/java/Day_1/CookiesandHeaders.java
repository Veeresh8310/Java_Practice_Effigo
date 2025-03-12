package Day_1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesandHeaders {
	
	//@Test(priority=1)
	void testCookies()
	{
		
		given()
		
		.when()
			.get("https://www.google.com/")
		
		.then()
			.cookie("AEC","ncjkwbiecbwiu489394843094802 cmnn")
			.log().all();
		
	}
	
	@Test(priority=2)
	void getCookiesInfo()
	{
		Response res=given()
				
			.when()
				.get("https://www.google.com/");
	
		//to get single cookie value
		   String cookie=res.getCookie("AEC");
		   System.out.println("The Cookie value is---->"+cookie);
		   
		 //to get all cookies
		   
		  Map<String, String> cookies= res.getCookies();
		  System.out.println(cookies.keySet());
		  
		  for(String cookie1:cookies.keySet())
		  {
			  String cookie2=res.getCookie(cookie1);
			  System.out.println(cookie2);
		  }
	
		
	}

}
