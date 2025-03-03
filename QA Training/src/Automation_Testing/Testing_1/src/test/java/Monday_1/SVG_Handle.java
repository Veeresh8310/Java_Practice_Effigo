package Monday_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG_Handle {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.name("username")).sendKeys("Admin");
	     driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
		 driver.findElement(By.xpath("//button[@title='Timesheets']//*[name()='svg']")).click();
		 
		 

	}

}
