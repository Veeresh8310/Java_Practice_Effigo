package wednesday_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_page {
	
	WebDriver driver;

	//constructor
	public POM_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//Locators
//	By uname= By.name("username");
//	By pass=  By.name("password");
//	By click= By.xpath("//button[@type='submit']");
	
	//POM Using PageFactory
	@FindBy (xpath="//input[@placeholder 'Username']")
	WebElement uname;
		
	@FindBy(xpath="//input[@placeholder-Password']")
	WebElement pass;
	
	@FindBy(xpath="//button [normalize-space()='Login']") 
	WebElement btn_login;

//Actions	
	public void Username(String username)
	{
		uname.sendKeys("username");
	}
	
	public void Password(String password)
	{
		pass.sendKeys("password");
	}
	
	public void Click_Action()
	{
		btn_login.click();
	}
	
}
