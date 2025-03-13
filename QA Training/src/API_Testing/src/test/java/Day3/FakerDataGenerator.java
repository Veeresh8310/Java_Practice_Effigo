package Day3;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGenerator {
	
	@Test
	void testFakeDataGenerator()
	{
		
		Faker faker=new Faker();
		
		String fullname=faker.name().fullName();
		String fname=faker.name().firstName();
		String lname=faker.name().lastName();
		
		String username=faker.name().username();
		String password=faker.internet().password();
		
		String phoneno=faker.phoneNumber().cellPhone();
		String email=faker.internet().safeEmailAddress();
		
		System.out.println("Full Name:"+fullname);
		System.out.println("First Name:"+fname);
		System.out.println("Last Name:"+lname);
		System.out.println("User Name:"+username);
		System.out.println("Password:"+password);
		System.out.println("Phone Number:"+phoneno);
		System.out.println("Email:"+email);
		
	}

}
