package wednesday_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class POM_Test {
	
	  WebDriver driver;
	  
	  @BeforeClass
	  void setup()
	  {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
	  
	  @Test
	  void testLogin()
	  {
		  
		  POM_page lp=new POM_page(driver);
		  lp.Username("Admin");
		  lp.Password("admin123");
		  lp.Click_Action();
		  Assert.assertEquals(driver.getTitle(), "OrangeHRM");  
		  
	  }
	  
	  @AfterClass
	  void closePage()
	  {
		  driver.close();
	  }
	  

}
