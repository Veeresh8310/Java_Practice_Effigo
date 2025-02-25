package Tuesday_Work;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Handling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		//Normal Alert message handled using switchTo() method
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Click for JS Alert']"))).click();
		driver.switchTo().alert().accept();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Click for JS Alert']"))).click();
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		//Confirmation Alert - OK and Cancel
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Click for JS Confirm']"))).click();
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();//dismiss()
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Click for JS Confirm']"))).click();
		Alert myalert1=driver.switchTo().alert();
		myalert.dismiss();
		
		//Prompt Alert - InputBox
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Click for JS Prompt']"))).click();
		Alert myalert2=driver.switchTo().alert();
		myalert.sendKeys("Veeresh");
		myalert.accept();
		
		//handling Alerts using Explicit Wait() method
		Alert myalert3=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert3.getText());
		myalert.accept();

		//Authenticate Pop - up Alert
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
