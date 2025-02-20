package Testing_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Handling_Loc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		 WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	        usernameField.sendKeys("Admin");
//		driver.findElement(By.xpath("//img[@alt='down arrow']")).click();
//		driver.findElement(By.id("APjFqb")).sendKeys("youtube");
		
//		driver.findElement(By.xpath("//span[normalize-space()='youtube']")).click();

//		driver.findElement(By.id("lastname")).sendKeys("Akki");

		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Select sel=new Select(driver.findElement(By.name("Country")));
//		sel.selectByVisibleText("India");
//		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
//		driver.findElement(By.xpath("//input[@id='Form_getForm_action_submitForm']")).click();
	}

}


