package Monday_Work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScript_Exe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://demo.opencart.com/");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='My Account']"))).click();
		 wait.until(ExpectedConditions.elementToBeClickable (By.xpath("//a[normalize-space()='Login']"))).click();
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).sendKeys("veeresh123@gmail.com");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password"))).sendKeys("veeresh@123");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary']"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-firstname"))).sendKeys("veeresh");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-lastname"))).sendKeys("Akki");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).sendKeys("veeresh123@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password"))).sendKeys("veeresh@123");
		  WebElement newsletter = wait.until(ExpectedConditions.elementToBeClickable(By.id("input-newsletter")));
	        js.executeScript("arguments[0].click();", newsletter);

	        // Click agreement checkbox
	        WebElement agreeCheck = wait.until(ExpectedConditions.elementToBeClickable(By.name("agree")));
	        js.executeScript("arguments[0].click();", agreeCheck);

	        // Click submit button
	        WebElement finalSubmit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	        js.executeScript("arguments[0].click();", finalSubmit);
		 
		 

	}

}
