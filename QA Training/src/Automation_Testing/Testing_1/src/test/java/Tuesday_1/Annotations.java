package Tuesday_1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
public class Annotations {

	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Executed before the entire test suite.");
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Executed before any methods in the class.");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Executed before each test method.");
	    }

	    @Test
	    public void testMethod1() {
	        System.out.println("Executing Test Method 1.");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("Executed after each test method.");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("Executed after all methods in the class.");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("Executed after the entire test suite.");
	    }
	}

