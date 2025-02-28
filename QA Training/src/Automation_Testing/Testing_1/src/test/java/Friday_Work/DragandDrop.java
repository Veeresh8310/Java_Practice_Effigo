package Friday_Work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	     driver.manage().window().maximize();

	     Actions act1=new Actions(driver);
	     
	     WebElement rome=driver.findElement(By.id("box6"));
	     WebElement Italy=driver.findElement(By.id("box106"));
	     
	     act1.dragAndDrop(rome,Italy).perform();
	     
	     WebElement wt=driver.findElement(By.id("box3"));
	     WebElement us=driver.findElement(By.id("box103"));
	     
	     act1.dragAndDrop(rome,Italy).perform();
	     
	     WebElement mad=driver.findElement(By.id("box7"));
	     WebElement spain=driver.findElement(By.id("box107"));
	     
	     act1.dragAndDrop(rome,Italy).perform();
	     
	     driver.close();
	     
	}

}
