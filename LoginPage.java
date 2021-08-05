package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.AssgnBaseClass;

public class LoginPage extends AssgnBaseClass {
	


//	public LoginPage(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver = driver;
//	}
	
	public LoginPage Username(String Usn) throws Exception {
		try {
	WebElement Username = getDriver().findElement(By.id("username"));
	Username.sendKeys(Usn);
	reportStep("Username is entered Successfully","Pass");
		}
		catch(Exception e) {
			e.printStackTrace();
			reportStep("Username is not entered Successfully","fail");
		}
	return this;
	}
	
	public LoginPage Password(String Pwd) throws Exception {
   try {
	WebElement Password = getDriver().findElement(By.id("password"));
	Password.sendKeys(Pwd);
	reportStep("Password is entered Successfully","Pass");
   }
   catch(Exception e) {
	   e.printStackTrace();
	   reportStep("Password is not entered Successfully","fail");
   }
	return this;
	}
	
	public Toggle Login() throws Exception {
		
try {
		WebElement Login = getDriver().findElement(By.id("Login"));
		
		Login.click();
		System.out.println("Login should be successful");		
		Thread.sleep(8000);
		reportStep("Login is Successfull","Pass");
		
}catch(Exception e) {
	e.printStackTrace();
	reportStep("Login is not Successfull","fail");
}
		return new Toggle();
	}


}
