package Tuesday_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property_File {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     
	  FileInputStream file=new  FileInputStream(System.getProperty("user.dir")+"//Test//Properties.properties");
	    
	    Properties prop=new Properties();
	    prop.load(file);
	    
	    String url= prop.getProperty("url");
	    String uname= prop.getProperty("Username");
	    String pass= prop.getProperty("Password");
	    
	    driver.get(url);
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    driver.close();

	}

}
