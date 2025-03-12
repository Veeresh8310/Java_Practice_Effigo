package Day_1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import javax.xml.crypto.Data;

public class HTTPRequests {
	int id;
	
	//@Test(priority=4)
		void deleteUser()
		{
			
			given()
				
			.when()
			    .delete("https://reqres.in/api/users/"+id)
			.then()
				.statusCode(204)
				.log().all();
		}
		
	
	@Test(priority=3, dependsOnMethods={"createUser"})
		void updateUser()
		{
			
			HashMap h=new HashMap();
			h.put("name","Veeresh");
			h.put("job","Teacher");
			
			given()
				.contentType("application/json")
				.body(h)
			
			.when()
			    .put("https://reqres.in/api/users/"+id)
			.then()
				.statusCode(200)
				.log().all();
		}
	
	//@Test(priority=1)
	void getUsers()
	{
		given()
		
		.when()
		    .get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
	}
	
	@Test(priority=2)
	void createUser()
	{
		
		HashMap h=new HashMap();
		h.put("name","Veeresh");
		h.put("job","Trainer");
		
		id=given()
			.contentType("application/json")
			.body(h)
			
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
		
//		.when()
//		    .post("https://reqres.in/api/users")
//		.then()
//			.statusCode(201)
//			.log().all();
	}

	
	
	
}
