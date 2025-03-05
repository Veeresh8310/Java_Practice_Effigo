package wednesday_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Orange_Test {
	
	ChromeDriver driver;
	  
	@BeforeClass
	void openapp() throws InterruptedException
	{
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(3000);
	}
	
	@Test(priority=1)
	void TitleCheck()
	{
		String act_tit=driver.getTitle();
		if(act_tit.equals("OrangeHRM"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		AssertJUnit.assertTrue(true);
	}
	
	@Test(priority=2)
	void UrlCheck()
	{
		AssertJUnit.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/weess");
	
	}
	
	@Test(priority=3,dependsOnMethods= {"UrlCheck"})
	void logoCheck()
	{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		AssertJUnit.assertEquals(status,true);
		
	}
	
	@AfterClass
	void closeapp()
	{
		  driver.close();
		
		System.out.println("App closed Successfully");
	}
	

}
