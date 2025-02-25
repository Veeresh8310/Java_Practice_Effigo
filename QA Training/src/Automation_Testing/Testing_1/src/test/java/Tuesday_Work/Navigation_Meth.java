package Tuesday_Work;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigation_Meth {

	public static void main(String[] args) throws MalformedURLException {
		 ChromeDriver driver=new ChromeDriver();
			
			//Navigation Methods
		    driver.navigate().to("https://demo.nopcommerce.com/register");//to(String)
			
		    URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.navigate().to(myurl);//to(object)
			
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			 
			driver.navigate().refresh();
			
			driver.navigate().back();
			System.out.println("The title of page is"+driver.getTitle());
			
			driver.navigate().forward();
			System.out.println("The title of page is"+driver.getTitle());
			


			 
	}

}
