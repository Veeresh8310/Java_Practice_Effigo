package Thursday_work;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShot_Prog {
	
	public static void main(String[] args)
	{
		
		 
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     driver.get("https://www.google.com");
	     
	    driver.findElement(By.className("gLFyf")).sendKeys("java");
	    List<WebElement> suggestion=driver.findElements(By.xpath("//div[@class='OBMEnb']//li"));
	    System.out.println(suggestion.size());
	    for(WebElement s:suggestion)
	    {
	    	String su=s.getText();
	    	System.out.println(su);
	    }
	     
	
	     

	    
	     driver.close();
	     
	    
	     
	     
		
	}
	
	

}
