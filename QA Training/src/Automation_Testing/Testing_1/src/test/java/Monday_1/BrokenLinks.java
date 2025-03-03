package Monday_1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     
	     driver.get("http://www.deadlinkcity.com/");
	     driver.manage().window().maximize();
	     
	     List<WebElement> links=driver.findElements(By.tagName("a"));
	     System.out.println("Total links:"+links.size());
	     
	     int totbrokenlinks=0;
	     int totnotbrokenlinks=0;
	     
	     for(WebElement link:links)
	     {
	    	 String li=link.getAttribute("href");
	    	 
	    	 if(li.isEmpty() || li==null)
	    	 {
	    		 System.out.println("There is no link");
	    		 continue;
	    	 }
	    	 
	    try
	    {
	    	 URL liurl=new URL(li);
	    	 HttpURLConnection conurl= (HttpURLConnection) liurl.openConnection();
	    	 conurl.connect();
	    	 
	    	 if(conurl.getResponseCode()>=400)
	    	 {
	    		 System.out.println(li+"=====>  The link is broken");
	    		 totbrokenlinks++;
	    	 }
	    	 else
	    	 {
	    		 System.out.println(li+ "======>  The link is not broken");
	    		 totnotbrokenlinks++;
	    	 }
	    }
	    catch(Exception e)

	     {
	     }
	     
	     }
	     
	     System.out.println("The number of broken lnks:"+totbrokenlinks);
	     System.out.println("The number of unbroken lnks:"+totnotbrokenlinks);
	
	     driver.close();
	}
	
	

}
