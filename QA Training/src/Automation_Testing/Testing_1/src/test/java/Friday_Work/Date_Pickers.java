package Friday_Work;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Pickers {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     driver.get("https://jqueryui.com/datepicker/");
	     
	     driver.manage().window().maximize();
	     
	     driver.switchTo().frame(0);
	     
//	     driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/05/2025");//directly sending the values, if it takes
	     
	     String year="2025";
	     String month="August";
	     String date="27";
	     
	     driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	    
//	     driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	    
	     while(true)
	     {
	    	 String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	    	 String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	    	 
	    	 if (currentMonth.equals(month) && currentYear.equals(year))
	    	 {
	    		 break;
	    	 }

	    	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	     }
	
			List<WebElement> allDates=driver.findElements (By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

			for (WebElement dt:allDates)
			{
					if(dt.getText().equals(date))
				{
					dt.click();
					break;
				}
			}

			driver.close();
	     
	}

}
