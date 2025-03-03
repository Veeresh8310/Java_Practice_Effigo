package Monday_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_Files {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	     
	     driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	     driver.manage().window().maximize();
	     
//	     //upload single file
	     driver.findElement(By.id("filesToUpload")).sendKeys("/Users/siddalingesh/Downloads/Agile Methodology-2.pdf");
	     if (driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Agile Methodology-2.pdf"))
	    		 {
	    	 			System.out.println("File uploaded succesfully");
	    		 }
	     else
	     {
	    	 System.out.println("Upload Failed");
	     }
	     
	     //upload Multiple files
	     String f1="/Users/siddalingesh/Downloads/Agile Methodology-2.pdf";
	     String f2="/Users/siddalingesh/Downloads/API Testing.pdf";
	     
	     driver.findElement(By.id("filesToUpload")).sendKeys(f1+"\n"+f2);
	     
	     
	     int tot=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	     if(tot==2)
	    		 {
	    	 			System.out.println("File uploaded succesfully");
	    		 }
	     else
	     {
	    	 System.out.println("Upload Failed");
	     }
	     
	     if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Agile Methodology-2.pdf") && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("API Testing.pdf"))
	    		 {
	    	 		System.out.println("File Names are succesfully Matched");	
	    		 }
	     else
	     {
	    	 System.out.println("File Names not Matched");
	     }

	}

}
