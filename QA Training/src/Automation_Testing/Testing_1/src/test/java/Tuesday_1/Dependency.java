package Tuesday_1;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Dependency {

	   @Test(priority=1)
	    public void openapp() {
		   Assert.assertTrue(true);
	 
	    }

	   @Test(priority=2,dependsOnMethods= {"openapp"})
	    public void login() {
		   Assert.assertTrue(false);
	    }

	    @Test(priority=3,dependsOnMethods= {"login"})
	    public void method1() {
	    	Assert.assertTrue(true);
	    }

	    @Test(priority=4,dependsOnMethods= {"login","method1"})
	    public void method2() {
	    	Assert.assertTrue(true);
	    }
	    
	    @Test(priority=5,dependsOnMethods= {"login"})
	    public void logout() {
	    	Assert.assertTrue(true);
	        
	    }
}
