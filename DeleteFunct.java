package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.AssgnBaseClass;

public class DeleteFunct  extends AssgnBaseClass{
	
//	public DeleteFunct(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}

	public DeleteFunct DD5() throws Exception {
		try {
	WebElement DD5 = getDriver().findElement(By.xpath("//button[@title='Show Navigation Menu']"));
	DD5.click();
    
	WebElement FilesDD1 = getDriver().findElement(By.xpath("(//span[@class='slds-media__body'])[12]"));
	FilesDD1.click();
    
	Thread.sleep(5000);
	reportStep("Selection is Succesfull","Pass");
		}
		catch(Exception e) {
			reportStep("Selection is not Succesfull","fail");
		}
	
	return this;
	}
	
	public DeleteFunct Delete() throws Exception {
		try {
	WebElement DD6 = getDriver().findElement(By.xpath("//ul[@class='oneActionsRibbon']//div//a"));
	DD6.click();
	
	Thread.sleep(3000);

	WebElement Delete = getDriver().findElement(By.xpath("//a[@title='Delete']"));
	Delete.click();
	
	WebElement DeleteBt = getDriver().findElement(By.xpath("//span[text()='Delete']"));
	DeleteBt.click();
	
	Thread.sleep(6000);
	
	String DelMsg = getDriver().findElement(By.xpath("//div[@class='forceVisualMessageQueue']")).getText();
	System.out.println("Delete Message is" + DelMsg);
	reportStep("Selection is Succesfull","Pass");
		}
		catch(Exception e) {
			reportStep("Selection is not Succesfull","fail");
		}
	return this;
	}

	
	
	
}
