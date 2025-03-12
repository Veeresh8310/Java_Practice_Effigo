package Day_2;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
public class XML_Parsing {
	
	//@Test
	void testXML()
	{
		 given()
			.contentType(ContentType.JSON)
		.when()
			.get("https://mocktarget.apigee.net/xml")
		
		.then()
			.statusCode(200)
			.header("Content-Type","application/xml; charset=utf-8")
			.body("root.city", equalTo("San Jose"))
			.body("root.state", equalTo("CA"));
	}
	
	//@Test
	void testXML1()
	{
		Response res=
		 given()
		 
		.when()
			.get("https://mocktarget.apigee.net/xml");
		
	    Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"), "application/xml; charset=utf-8");
		
		String fname=res.xmlPath().get("root.firstName").toString();
		Assert.assertEquals(fname, "John");
		
		String lname=res.xmlPath().get("root.lastName").toString();
		Assert.assertEquals(lname, "Doe");
	}
	
	@Test
	void testXML2()
	{
		Response res=
		 given()
		 
		.when()
			.get("https://mocktarget.apigee.net/xml");
		
		XmlPath x=new XmlPath(res.asString());
		
	    Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"), "application/xml; charset=utf-8");
		
		String fname=res.xmlPath().get("root.firstName").toString();
		Assert.assertEquals(fname, "John");
		
		String lname=res.xmlPath().get("root.lastName").toString();
		Assert.assertEquals(lname, "Doe");
	}

}
