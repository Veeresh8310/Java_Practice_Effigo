package Tuesday_Work;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing_Example {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		 driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		wait.until(ExpectedConditions.elementToBeClickable(By.className("wikipedia-search-button"))).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='wikipedia-search-results']//div//a")));
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='wikipedia-search-results']//div//a"));
		
		System.out.println(list.size());
		for(WebElement x:list)
		{
			
			System.out.println(x.getText());
			x.click();
			
			
		}
		
		Set<String> set1=driver.getWindowHandles();
		List<String> mylist1=new ArrayList(set1);
		
		for(String s:mylist1 )

		{
			driver.switchTo().window(s);
			if(driver.getTitle().equals("Selenium in biology - Wikipedia"))
			{
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
	}

}
