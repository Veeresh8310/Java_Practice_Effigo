package Monday_Work;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebD_GetMeth {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//Get Methods
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//get(url)
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		 WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	        usernameField.sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			System.out.println("The Url is"+driver.getCurrentUrl());//getCurrentUrl()
			System.out.println("The Title is "+driver.getTitle());//getTitle()
			System.out.println("The page resource is:"+driver.getPageSource());//getPageSource()
			System.out.println("The Window ID is:"+driver.getWindowHandle());//getWindowHandle()
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("OrangeHRM, Inc"))).click();
		
			Set<String> windowid=driver.getWindowHandles();//getWindowHandles()
			System.out.println("The Window ID is:"+windowid);
			
			
//			driver.close();//close()
			driver.quit();//quit()

	}

}
