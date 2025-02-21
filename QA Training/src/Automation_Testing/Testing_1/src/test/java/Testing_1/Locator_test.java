package Testing_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator_test {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/en-gb?route=common/home");

		driver.findElement(By.xpath("//span[normalize-space()='Currency']")).click();//xpath()
//		sel.selectByVisibleText("€ Euro");
		
		driver.findElement(By.xpath("//a[contains(text(),'€ Euro')]")).click();
		
		Boolean status=driver.findElement(By.id("logo")).isDisplayed();//id()
		System.out.println(status);
		
		driver.findElement(By.linkText("Laptops & Notebooks")).click();//linkText()
		
		driver.findElement(By.xpath("//a[normalize-space()='Show All Laptops & Notebooks']")).click();//linkText()
		
		driver.findElement(By.id("compare-total")).click();
		
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
////		driver.findElement(By.partialLinkText("Laptops")).click();//partialLinktext
//		driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();
////		driver.findElement(By.className("btn btn-primary")).click();//className()
//		driver.findElement(By.className("quantity")).sendKeys("2");//className()
		driver.findElement(By.cssSelector(".img-fluid")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//button[@class='btn btn-light btn-lg']")).click();
//		
		System.out.println(driver.findElement(By.tagName("a")).getSize());//tagName()
		
		//cssSelector using tagname and classname
//		driver.findElement(By.name("Form_getForm_FullName")).sendKeys("Veeresh");
//		driver.findElement(By.id("Form_getForm_Email")).sendKeys("veeresh123@gmail.com");
		
	}
}
