package Pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.AssgnBaseClass;

public class Download extends AssgnBaseClass{
	
//	public Download(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}

	public Download DD2() throws Exception {
		try {

	WebElement DD2 = getDriver().findElement(By.xpath("//a[@title='Show 7 more actions']"));
    DD2.click();
	Thread.sleep(2000);
	reportStep("Download Selection is Successfull","Pass");
		}
		catch(Exception e) {
			reportStep("Download Selection is not Successfull","fail");
		}
	return this;
	}
	
	public ShareLink Download() throws Exception {
		try {
	WebElement Download = getDriver().findElement(By.xpath("//a[@title='Download']"));
	Download.click();
	
	Thread.sleep(3000);
	
	File fileLocation = new File("C:\\Users\\SARA\\Downloads");
	
	File[] totalfiles = fileLocation.listFiles();
	
	for (File file : totalfiles) {
		
		if(file.getName().equals("test.txt")) {
			
		System.out.println("File is Downloaded");
		break;
			
		}
		
	}
	reportStep("Download file is Successfull","Pass");
		}	
		catch(Exception e) {
			e.printStackTrace();
			reportStep("Download file is not Successfull","fail");
		}
		
		
     return new ShareLink();
	}
}
