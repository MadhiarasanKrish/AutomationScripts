package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseClass.AssgnBaseClass;

public class Toggle extends AssgnBaseClass {
	
	
//	public Toggle(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}

	public Toggle Togglebt() throws Exception {
		try {
	WebElement Toggle = getDriver().findElement(By.className("slds-r5"));
	Toggle.click();
	reportStep("Togglebutton selection is successFull","Pass");
		}catch(Exception e) {
			e.printStackTrace();
			reportStep("Togglebutton selection is not successFull","Fail");
		}
	return this;
	}
	
	public Toggle Viewall() throws Exception {
	try {
	WebElement Viewall = getDriver().findElement(By.xpath("//button[@class='slds-button']"));
	Viewall.click();
	reportStep("Toggle selection is successFull","Pass");
	}catch(Exception e) {
		e.printStackTrace();
		reportStep("Toggle selection is not successFull","Fail");
	}
	return this;
		
	}
	
	public FilesPage ServiceCons() throws Exception {
	try {
		Thread.sleep(3000);
	WebElement ServiceCons = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Service Console']")));
	ServiceCons.click();
	Thread.sleep(2000);
	reportStep("ServiceConsole selection is successFull","Pass");
	}catch(Exception e) {
		e.printStackTrace();
		reportStep("ServiceConsole selection is not successFull","Fail");
	}
	return new FilesPage();
	}
	

}
