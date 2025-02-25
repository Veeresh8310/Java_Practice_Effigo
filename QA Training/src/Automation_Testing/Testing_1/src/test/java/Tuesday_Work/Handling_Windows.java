package Tuesday_Work;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Windows {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"))).click();
		
		Set<String> set=driver.getWindowHandles();
		List<String> mylist=new ArrayList(set);
		String ID_1=mylist.get(0);
		String ID_2=mylist.get(1);
		
		driver.switchTo().window(ID_2);
		System.out.println("The title is:"+driver.getTitle());
		
		Set<String> set1=driver.getWindowHandles();
		List<String> mylist1=new ArrayList(set);
		for(String x:mylist1)

		{
			driver.switchTo().window(x);
			if(driver.getTitle().equals("Human Resources Management Software | OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
