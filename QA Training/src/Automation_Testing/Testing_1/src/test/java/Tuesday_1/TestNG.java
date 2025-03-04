package Tuesday_1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestNG {
	
	ChromeDriver driver;
	  
	@Test(priority=1)
	void openapp()
	{
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("App opened Successfully");
	}
	
	@Test(priority=2)
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
		
		System.out.println("Login Successfully");
	}
	
	@Test(priority=3)
	void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("Login Successfully");
	}
	
	@Test(priority=4)
	void close()
	{
		driver.close();
		System.out.println("Logout Successfully");
	}

}
