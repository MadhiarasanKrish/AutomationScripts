package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.AssgnBaseClass;

public class UploadPage extends AssgnBaseClass {
	
	
//	public UploadPage(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}

	public UploadPage UploadFile() throws Exception {
		try {
	 WebElement UploadFile = getDriver().findElement(By.xpath("//div[@title='Upload Files']"));
     UploadFile.click();
     
     System.out.println("Upload button clicked");
     reportStep("Selection is Succesfull","Pass");
		}
		catch(Exception e){
			e.printStackTrace();
			reportStep("Selection is not Succesfull","fail");
		}
     return this;
	}
	
	public UploadPage fileSelection() throws Exception {
		try {
			String file= "C:\\Users\\SARA\\Downloads\\test.txt";
	        
	        StringSelection selection = new StringSelection(file);
	        
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	        
	        Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        
	        Thread.sleep(2000); 
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        
	        Thread.sleep(5000);
	        
	        WebElement donebutton = getDriver().findElement(By.xpath("//span[text()='Done']"));
			 donebutton.click();
     reportStep("Selection is Succesfull","Pass");
		}
		catch(Exception e) {
			e.printStackTrace();
			reportStep("Selection is not Succesfull","fail");
		}
  
     return this;
	}
	
	 public ViewFileDetails Done() throws Exception {
		 try {
		 Thread.sleep(5000);
		 System.out.println("Done Section");
		
		 
		 Thread.sleep(2000);
	 WebElement DD4 = getDriver().findElement(By.xpath("((//div[@class='forceVirtualActionMarker forceVirtualAction'])[1]//span)[1]"));
     DD4.click();
     reportStep("Selection is Succesfull","Pass");
		 }
		 catch(Exception e) {
			 e.printStackTrace();
			 reportStep("Selection is not Succesfull","fail");
		 }
     return new ViewFileDetails();
	 }


}
