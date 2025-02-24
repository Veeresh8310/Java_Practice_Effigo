package Monday_Work;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath_Axes {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Username']/following::input[1]")));//using following
        username.sendKeys("Admin");
        driver.findElement(By.xpath("//label[text()='Password']/following::input[1]")).sendKeys("admin123");;
        driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/child::button")).click();//using child

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']"))).click();

        WebElement employeeName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Employee Name']/following::input[1]")));
        employeeName.sendKeys("Amelia");

        driver.findElement(By.xpath("//button[@type='submit']")).click();


        driver.quit();
    }
}
