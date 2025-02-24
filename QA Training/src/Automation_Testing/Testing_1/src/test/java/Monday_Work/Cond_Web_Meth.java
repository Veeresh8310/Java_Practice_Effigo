package Monday_Work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cond_Web_Meth {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
		
		//Conditional or WebElement Methods
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		 WebElement logo= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='nopCommerce demo store']")));
		 if(logo.isDisplayed())//isDisplayed()
		 {
			 System.out.println("Logo is Displayed");
		 }
		 else
		 {
			 System.out.println("Logo is not Displayed");
		 }
		 
		 boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		 System.out.println("The status is:"+status);
		 
		 WebElement male =driver.findElement(By.id("gender-male"));
		 WebElement female=driver.findElement(By.id("gender-female"));
		 
		 System.out.println("Before Selecting");
		 System.out.println("The status of male button is"+male.isSelected());
		 System.out.println("The status of female button is"+female.isSelected());
		 
		male.click();
		 
		 System.out.println("After Selecting");
		 System.out.println("The status of male button is"+male.isSelected());
		 System.out.println("The status of female button is"+female.isSelected());
	}

}
