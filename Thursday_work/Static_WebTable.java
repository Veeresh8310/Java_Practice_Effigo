package Thursday_work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_WebTable {
	public static void main(String[] args)
	{
	
    ChromeDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
    driver.get("https://testautomationpractice.blogspot.com/");
    
    WebElement table=driver.findElement(By.name("BookTable"));
    int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//total number of rows for multiple web tables
    System.out.println(rows);
    
//    int rows=driver.findElements(By.tagName("tr")).size();//total number of rows for one web table
    
    int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();//total number of rows for multiple web tables
    System.out.println(cols);//total number of cols
    
//  int cols=driver.findElements(By.tagName("th")).size();//total number of rows for one web table
    
    
    //to print all data
    for(int i=2;i<rows;i++)
    {
    	for(int j=0;j<cols;j++)
    	{
    		String val=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
    		System.out.print(val+"\t");
    	}
    }
	
    
    //to print specific data
    String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
    		System.out.println();
  
    		
    		//applying conditions
    		for(int j=2;j<rows;j++)
        	{
    			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+j+"]//td[2]")).getText();
        		
        		if(value.equals("Mukesh"))
        		{
        			String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+j+"]//td[1]")).getText();
        			System.out.print(value1);
        		}
        		
        	}
        
    
	}
	
}
