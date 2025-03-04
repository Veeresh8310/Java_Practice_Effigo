package Grouping_Testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SanandReg_Grouping {
	
	 @Test(priority=1,groups= {"Sanitary","Regression"})
	    public void Paymentinrupees() {
		   System.out.println("Signup by email successful");
	 
	    }

	   @Test(priority=2,groups= {"Sanitary","Regression"})
	    public void Paymentindollars() {
		   System.out.println("Signup by Facebook successful");
	    }

	    

}
