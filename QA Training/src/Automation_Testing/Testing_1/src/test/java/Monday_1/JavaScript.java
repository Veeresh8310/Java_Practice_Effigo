package Monday_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
	    WebElement n=driver.findElement(By.id("name"));
	    
	    JavascriptExecutor js=driver;
	    
	    js.executeScript("document.body.style.zoom='50%'");
//	    Thread.sleep(3000);
	    
	    js.executeScript("arguments[0].setAttribute('value','Veeresh')",n);
	    
	    WebElement c=driver.findElement(By.id("male"));
	    js.executeScript("arguments[0].click()", c);
	    
	    //scroll down by using the pixel numberv
	    js.executeScript("window.scrollBy(0,1500)", "");
	    
	    //scroll down untill the element is visible
	    WebElement visible=driver.findElement(By.xpath("//h2[normalize-space()='ShadowDOM']"));
	    js.executeScript("arguments[0].scrollIntoView();", visible);
	    
	    //scroll down untill the top of the page
	    js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	    
	    //scroll down untill the end of the page
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	   
	    driver.close();

	}

}
