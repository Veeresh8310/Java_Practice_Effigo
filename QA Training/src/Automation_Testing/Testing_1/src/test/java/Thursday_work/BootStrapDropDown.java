package Thursday_work;


	import java.time.Duration;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


public class BootStrapDropDown {
	    public static void main(String[] args) {
	      
	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	   
	        driver.get("https://testautomationpractice.blogspot.com/");

	        
	        WebElement dropdownButton = driver.findElement(By.id("comboBox"));
	        dropdownButton.click();

	        List<WebElement> options = driver.findElements(By.xpath("//div[@id='dropdown']//div"));

	        for (WebElement option : options) {
	            System.out.println(option.getText());
	        }

	    
	        for (WebElement option : options) {
	            if (option.getText().equals("Item 1")) {
	                option.click();
	                break;
	            }
	        }


	        driver.quit();
	    }
	}

