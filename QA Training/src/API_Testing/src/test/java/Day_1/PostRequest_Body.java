package Day_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class PostRequest_Body {
	
	
	//post request body using External JSON file
	@Test
	void testPostusingExternalJsonFile() throws FileNotFoundException  
	{
		File f=new File(".//Body.json");
		FileReader fr=new FileReader(f);
		
		JSONTokener jt=new JSONTokener(fr);
		JSONObject jo=new JSONObject(jt);
		
		
		given()
			.contentType("application/json")
			.body(jo.toString())
		
		.when()
			.post("http://localhost:3000/countries")
			
		
		.then()
			.statusCode(201)
//			.header("Content-Type", "application/json; charset-utf-8")
			.body("name",equalTo("Ve"))
			.body("code",equalTo("211"))
			.log().all();
		
	}
	
	//post request body using POJO class
		//@Test
		void testPostusingPOJO()
		{
			POJO_PostRequest p=new POJO_PostRequest();
			p.setName("Veeresh1234");
			p.setCode("1234");
			
			given()
				.contentType("application/json")
				.body(p)
			
			.when()
				.post("http://localhost:3000/countries")
				
			
			.then()
				.statusCode(201)
//				.header("Content-Type", "application/json; charset-utf-8")
				.body("name",equalTo("Veeresh1234"))
				.body("code",equalTo("1234"))
				.log().all();
			
		}
	
	//post request body using org.json library
	//@Test
	void testPostusingjsonlibrary()
	{
		JSONObject j=new JSONObject();
		j.put("name", "Veeresh123");
		j.put("code","201");
		
		given()
			.contentType("application/json")
			.body(j.toString())
		
		.when()
			.post("http://localhost:3000/countries")
			
		
		.then()
			.statusCode(201)
//			.header("Content-Type", "application/json; charset-utf-8")
			.body("name",equalTo("Veeresh123"))
			.body("code",equalTo("201"))
			.log().all();
		
	}
	
	//post request body using HashMap
	
	@Test
	void testPostusingHashMap()
	{
		HashMap h=new HashMap();
		h.put("name", "Ve");
		h.put("code","211");
		
		given()
			.contentType("application/json")
			.body(h)
		
		.when()
			.post("http://localhost:3000/countries")
			
		
		.then()
			.statusCode(201)
//			.header("Content-Type", "application/json; charset-utf-8")
			.body("name",equalTo("Ve"))
			.body("code",equalTo("211"))
			.log().all();
		
	}
	
	//@Test
	void deleteUser()
	{
		
		given()
			
		.when()
		    .delete("https://reqres.in/api/users/e496")
		.then()
			.statusCode(204)
			.log().all();
	}
	
	

	
	



	

}
