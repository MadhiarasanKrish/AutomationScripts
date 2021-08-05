package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.AssgnBaseClass;

public class ViewFileDetails extends AssgnBaseClass {
	
	
//	public ViewFileDetails(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}

	public ViewFileDetails DD4() throws Exception {
		try {
    Thread.sleep(2000);
    WebElement showdropdown = getDriver().findElement(By.xpath("((//div[@class='forceVirtualActionMarker forceVirtualAction'])[1]//span)[1]"));
    Thread.sleep(2000);
   // showdropdown.click();
    reportStep("Selection is Succesfull","Pass");
		}
		catch(Exception  e) {
			reportStep("Selection is not Succesfull","fail");
		}
    return this;
    
	}
	
	public DeleteFunct ViewFieDetails() throws Exception {
		try {
	Thread.sleep(3000);
    WebElement ViewFileDetails = getDriver().findElement(By.xpath("//a[@title='View File Details']"));
    ViewFileDetails.click();
    
    Thread.sleep(5000);
    
    String FileName = getDriver().findElement(By.xpath("(//span[@class='uiOutputText'])[1]")).getText();
    System.out.println("FileName is " + FileName);
    
    String Extension = getDriver().findElement(By.xpath("(//span[@class='uiOutputText'])[2]")).getText();
    System.out.println("Extension name is " + Extension);
    
    
    WebElement CloseTab = getDriver().findElement(By.xpath("//button[contains(@title,'test') and contains(@title,'Close')]"));
	CloseTab.click();
	
	
	Thread.sleep(10000);
	reportStep("Selection is Succesfull","Pass");
		}
		catch(Exception e) {
			reportStep("Selection is not Succesfull","fail");
		}
	return new DeleteFunct();
	}

}
