package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.AssgnBaseClass;

public class PublicLink extends AssgnBaseClass {
	
//	public PublicLink(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}

	public PublicLink DD1() throws Exception {
		try {
	WebElement DD1 = getDriver().findElement(By.xpath("((//div[@class='forceVirtualActionMarker forceVirtualAction'])[1]//span)[1]"));
	DD1.click();	
	Thread.sleep(3000);
	reportStep("Public link selection is successfull","Pass");	
		}catch(Exception e) {
		reportStep("Public link selection is not successfull","fail");	
		}
	return this;
	}
	
	public PublicLink PublicLink() throws Exception {
	try {
	WebElement PublicLink = getDriver().findElement(By.xpath("//a[@title='Public Link']"));
	PublicLink.click();
	
	Thread.sleep(3000);
	
	boolean NewLinkText = getDriver().findElement(By.xpath("//input[@name='publicLinkURL']")).isEnabled();
	
	if(NewLinkText) {
		System.out.println("New Link Text is enabled");
	}
	else{
		System.out.println("New Link Text is disabled");
	}
	Thread.sleep(2000);
	reportStep("Public link is successfull","Pass");	
	}
	catch(Exception e) {
		e.printStackTrace();
		reportStep("Public link is not successfull","fail");	
	}
	return this;
	}
	
	public Download Privatelink() throws Exception {
		try {
	WebElement Privatelink = getDriver().findElement(By.xpath("//button[@title='Close this window']"));
	Privatelink.click();
	Thread.sleep(3000);
	reportStep("Download is successfull","Pass");	
		}
		catch(Exception e) {
			e.printStackTrace();
			reportStep("Download is not successfull","fail");	
		}
	return new Download();
	}

}
