package Testing_1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String act_tit=driver.getTitle();
		if(act_tit.equals("Google"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.close();

		//		SafariDriver driver=new SafariDriver();
//		driver.get("https://demo.opencart.com");
//		String act_tit=driver.getTitle();
//		if(act_tit.equals("Google"))
//		{
//			System.out.println("Test Passed");
//		}
//		else
//		{
//			System.out.println("Test Failed");
//		}
//		driver.close();
		

	}

}
