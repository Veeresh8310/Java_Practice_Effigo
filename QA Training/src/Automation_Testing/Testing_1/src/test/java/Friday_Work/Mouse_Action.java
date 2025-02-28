package Friday_Work;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	     driver.manage().window().maximize();
	     
	     //hovering mouse action
//	     WebElement a=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
//	     WebElement s=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
//	     
//	     Actions act=new Actions(driver);
//	     act.moveToElement(a).moveToElement(s).click().build().perform();
	     
//	     //right click action - contextClick()
//	     WebElement r=driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
//	     
//	     Actions act=new Actions(driver);
//	     act.contextClick(r).click().perform();
//	     
//	     driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
//	     driver.switchTo().alert().accept();
	     
	     //doubleclick- doubleclick();
	     driver.switchTo().frame("iframeResult");
	     WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
	     WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));
	     WebElement button= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	     
	     f1.clear();
	     f1.sendKeys("Hi");
	     
	     Actions act1=new Actions(driver);
	     act1.doubleClick(button).perform();
	     driver.close();
	     
	     
	 
	   

	}

}
