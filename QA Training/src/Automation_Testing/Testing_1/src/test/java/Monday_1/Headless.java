package Monday_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless=new");
		
		 ChromeDriver driver=new ChromeDriver(opt);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.manage().window().maximize();
	     
			String act_tit=driver.getTitle();
			if(act_tit.equals("OrangeHRM"))
			{
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test Failed");
			}
			driver.close();

	}

}
