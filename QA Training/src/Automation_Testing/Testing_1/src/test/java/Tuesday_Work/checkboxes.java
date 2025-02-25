package Tuesday_Work;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkboxes {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='sunday']")));
		//to select only one checkbox
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='sunday']"))).click();
				
		// to select all checkboxes
		
		 List<WebElement> set= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));  
				 for(WebElement c:set) 
				 { 
				 	c.click(); 
				 } 
		//to select last three checkboxes
				
				 for(int i=4;i<set.size();i++) 
				 { 
				 	set.get(i).click(); 
				 } 
				 
		//to unselect if they are selected
			
				 for(int i=0;i<set.size();i++) 
				 { 
					 if(set.get(i).isSelected())
						  set.get(i).click(); 
				 } 
				 
				 driver.close();
	}

}
