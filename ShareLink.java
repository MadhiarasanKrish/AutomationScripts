package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.AssgnBaseClass;

public class ShareLink extends AssgnBaseClass{
	
//	public ShareLink(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}

	public ShareLink DD3() throws Exception {
		try {
	WebElement DD3 = getDriver().findElement(By.xpath("//li[@class='oneActionsDropDown']//a"));
    DD3.click();
	
    Thread.sleep(2000);
    reportStep("Sharelink is Successfull","Pass");
		}
		catch(Exception e) {
			reportStep("Sharelink is not Successfull","fail");
		}
    return this;
	}
	
	public ShareLink Sharelink() throws Exception {
		try {
    WebElement Sharelink = getDriver().findElement(By.xpath("//a[@title='Share']"));
    Sharelink.click();
    
    Thread.sleep(2000);
    reportStep("Selection is Successfull","Pass");
		}
		catch(Exception e ) {
			reportStep("Selection is not Successfull","fail");
		}
    return this;
	}
	
	public UploadPage SearchUser(String Data1, String Data2, String Data3) throws Exception {
		try {
    WebElement SearchUser = getDriver().findElement(By.xpath("//input[@title='Search People']"));
    SearchUser.click();
    SearchUser.sendKeys(Data1);
    Thread.sleep(2000);
    WebElement DerrickSelection = getDriver().findElement(By.xpath("//div[@title='Derrick Dsouza']"));
    DerrickSelection.click();
    
    Thread.sleep(2000);
    WebElement Errormsg = getDriver().findElement(By.xpath("//li[@class='form-element__help']"));
    String ErrMsg = Errormsg.getText();
    System.out.println("Message is " + ErrMsg);
    
    Thread.sleep(2000);
    
    getDriver().findElement(By.xpath("//span[@class='deleteIcon']")).click();
    
    Thread.sleep(2000);
    
    WebElement SearchUser1 = getDriver().findElement(By.xpath("//input[@title='Search People']"));
    SearchUser1.click();
    SearchUser1.sendKeys(Data2);
    
    
    WebElement SecondUser = getDriver().findElement(By.xpath("//div[@title='Integration User']"));
    SecondUser.click();
    
    
    WebElement Textarea = getDriver().findElement(By.xpath("//textarea[@class='textArea textarea']"));
    Textarea.sendKeys(Data3);
    
    WebElement Share = getDriver().findElement(By.xpath("//span[text()='Share']"));
    Share.click();
    
    Thread.sleep(4000);
    
    String SuccessMsg = getDriver().findElement(By.xpath("//div[@class='forceVisualMessageQueue']")).getText();
    System.out.println("Successmsg is " + SuccessMsg);
    
    Thread.sleep(3000);
    reportStep("Selection is Successfull","Pass");
		}
		catch(Exception e) {
			e.printStackTrace();
			reportStep("Selection is not Successfull","fail");
		}
    return new UploadPage();
	}
	

}
