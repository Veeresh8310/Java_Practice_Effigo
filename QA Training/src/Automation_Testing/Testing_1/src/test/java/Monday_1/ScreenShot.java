package Monday_1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     
	     driver.get("https://demo.nopcommerce.com/");
	     driver.manage().window().maximize();
	     
	     TakesScreenshot screen=driver;
	     
	     //Full page screenshot
	     File src=screen.getScreenshotAs(OutputType.FILE);
	     File tar=new File(System.getProperty("user.dir")+"//ScreenShots//Fullpage.png");
	     src.renameTo(tar);
	     
	     //required area screenshot
	     WebElement products=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	     File srcfile=products.getScreenshotAs(OutputType.FILE);
	     File tarfile=new File(System.getProperty("user.dir")+"//ScreenShots//Requiredpage.png");
	     srcfile.renameTo(tarfile);
	     
	     //screenshot of element
	     WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	     File srcfile1=logo.getScreenshotAs(OutputType.FILE);
	     File tarfile1=new File(System.getProperty("user.dir")+"//ScreenShots//Elementpage.png");
	     srcfile1.renameTo(tarfile1);
	     
	     driver.close();
	     

	}

}
