package Friday_Work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     driver.get("https://demo.opencart.com/admin/index.php");
	     
	     WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
	     uname.clear();
	     uname.sendKeys("demo");
	     
	     WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	     pass.clear();
	     pass.sendKeys("demo");
	     
	     driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	     
	     driver.findElement(By.xpath("//i[@class='fas fa-user']")).click(); 
	     driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click(); 
	     
	     String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
	     int tot=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
	     
	     for(int i=1;i<5;i++)
	     {
	    	 if(i>1)
	    	 {
	    		 WebElement page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+i+"]"));
	    		 page.click();
	    	 }
	     }
	     
	     driver.close();
	}

}
