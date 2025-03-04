package Grouping_Testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Regression {
	
	 @Test(priority=1,groups= {"Regression"})
	    public void SignupByEmail() {
		   System.out.println("Signup by email successful");
	 
	    }

	   @Test(priority=2,groups= {"Regression"})
	    public void SignupByFacebook() {
		   System.out.println("Signup by Facebook successful");
	    }

	    @Test(priority=3,groups= {"Regression"})
	    public void SignupByInstagram() {
	    	System.out.println("Signup by Instagram successful");
	    }

}
