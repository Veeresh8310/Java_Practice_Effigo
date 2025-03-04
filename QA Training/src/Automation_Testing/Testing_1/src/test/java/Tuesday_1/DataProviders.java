package Tuesday_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class DataProviders {
	
	 ChromeDriver driver;
	 
	 @BeforeClass
	 void setup()
	 {
		 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
   
	 }
	
	    
	    @Test(dataProvider = "loginData")

	    public void testLogin(String username, String password) {	     
	    		    
	    	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    	  driver.manage().window().maximize();
	    	System.out.println("Testing login with username: " + username + " and password: " + password);
	        driver.findElement(By.name("username")).sendKeys(username);
	        driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			

			
			boolean status=driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
			if(status==true)
			{
				driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
				driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//li//a[normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
			}
			else
			{ 
				Assert.fail();
			}
	     

	    }
	    
	  @AfterClass
	    public void driverclose() {

	        driver.close();

	    }
	  
	  @DataProvider(name = "loginData")

	    public Object[][] loginDataProvider() {

	        Object data[][]= {

	            {"user1", "password1"},
	            
	            {"Admin", "admin123"},
	            
	            {"user3", "password3"}
	            

	            

	            

	        };
	        return data;

	    }
	    

	}


