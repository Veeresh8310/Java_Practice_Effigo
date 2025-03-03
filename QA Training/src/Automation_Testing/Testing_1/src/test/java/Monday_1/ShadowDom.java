package Monday_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     
	     driver.get("https://books-pwakit.appspot.com/");
	     driver.manage().window().maximize();
	     
//	     shadow-root
//	     SearchContext shadow=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
//	     shadow.findElement(By.cssSelector("#shadow-element"));
//	     
//	     //Nested shadow-roots
//	     SearchContext shadow0=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
//	     SearchContext shadow1=driver.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
//	     shadow1.findElement(By.cssSelector("#nested-shadow-element"));
	     
	     SearchContext shadow0=driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
	     shadow0.findElement(By.cssSelector("#input")).sendKeys("WELCOME");
	
	     
	     driver.close();
	     

	}

}
