package Thursday_work;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        
        WebElement dropdown = driver.findElement(By.id("country"));

   
        Select select = new Select(dropdown);

        select.selectByVisibleText("Canada");

        System.out.println("Selected option: " + select.getFirstSelectedOption().getText());

        driver.quit();
    }
}
