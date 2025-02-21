package Testing_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormFilling {
	
	static void SearchEmployee(ChromeDriver driver, WebDriverWait wait)
	{

		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Employee Name']/following::input[1]"))).sendKeys("Veeresh");
         driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement employeeName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Veeresh')]")));

			
	 }
	
	static void AddEmployee(ChromeDriver driver,WebDriverWait wait) throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']"))).sendKeys("Veeresh");
		driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Akki");
//		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--focus']")).sendKeys("101");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Username']/following::input[1]"))).sendKeys("Veeresh12345");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Password']/following::input[1]"))).sendKeys("Veeresh@123");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Confirm Password']/following::input[1]"))).sendKeys("Veeresh@123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000); 
	}
	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		 WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	        usernameField.sendKeys("Admin");
	        driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']"))).click();
			AddEmployee(driver,wait);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Employee List']"))).click();
			SearchEmployee(driver,wait);
			

	}

}


