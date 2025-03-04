package Grouping_Testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sanitary_Group {
	
	 @Test(priority=1,groups= {"sanitary"})
	    public void LoginByEmail() {
		   System.out.println("Login by email successful");
	 
	    }

	   @Test(priority=2,groups= {"sanitary"})
	    public void LoginByFacebook() {
		   System.out.println("Login by Facebook successful");
	    }

	    @Test(priority=3,groups= {"sanitary"})
	    public void LoginByInstagram() {
	    	System.out.println("Login by Instagram successful");
	    }


}
