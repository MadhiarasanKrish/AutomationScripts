package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.AssgnBaseClass;

public class FilesPage extends AssgnBaseClass {
	
//	public FilesPage(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}

	public FilesPage DD() throws Exception {
		try {
	WebElement DD = getDriver().findElement(By.xpath("(//div[@class='slds-context-bar__icon-action']//button)[1]"));
	DD.click();
	System.out.println("Drop down clicked");
	reportStep("Files Selection is SuccessFull","Pass");
		}
		catch(Exception e) {
			e.printStackTrace();
			reportStep("Files Selection is not SuccessFull","Fail");
		}
	return this;
	}	
	
	public FilesPage FileDD() throws Exception {
		try {
	//JavascriptExecutor js = (JavascriptExecutor)driver ;
	//js.executeScript("windows.scrollby(0,250)");
	
	//Thread.sleep(2000);
	WebElement Filesdropdown = getDriver().findElement(By.xpath("//span[text()='Refunds']//following::li[2]//span[2]"));
	System.out.println("Filesdropdown is Selected");
	 
    Filesdropdown.click();
    reportStep("FilesPage Selection is successFull","Pass");
	
		}
		catch(Exception e) {
			e.printStackTrace();
			reportStep("FilesPage is not successFull","Fail");
		}
	return this;
	}
	

	public PublicLink LastModifiedDate() throws Exception {
	try {
	Thread.sleep(5000);
	WebElement LastModifiedDate = getDriver().findElement(By.xpath("//span[@title='Last Modified Date']"));
	LastModifiedDate.click();
	
	Thread.sleep(8000);
	reportStep("LastModifiedDate selection is successFull","Pass");
	}
	catch(Exception e) {
		e.printStackTrace();
		reportStep("LastModifiedDate selection is not successFull","Fail");
	}
	return new PublicLink();
	}


}
