package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondAssgn {

	String test;
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		
		
		driver.manage().window().maximize();
		
		driver.get("https://ap16.lightning.force.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("cypress@testleaf.com");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Selbootcamp@1234");

		WebElement Login = driver.findElement(By.id("Login"));
		Login.click();
		System.out.println("Login should be successful");
		
		
		Thread.sleep(8000);
		
		String Oldwindowdriver = driver.getWindowHandle();
		
		//WebElement Toggle = driver.findElement(By.className("slds-r5"));
		WebElement Toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		Toggle.click();
		
		WebElement Viewall = driver.findElement(By.xpath("//button[@class='slds-button']"));
		Viewall.click();
			
		
		WebElement ServiceCons = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Service Console']")));
		ServiceCons.click();
		
		Thread.sleep(5000);
		WebElement DD = driver.findElement(By.xpath("(//div[@class='slds-context-bar__icon-action']//button)[1]"));
		DD.click();
	
		
		WebElement Filesdropdown = driver.findElement(By.xpath("//span[text()='Refunds']//following::li[2]//span[2]"));
		System.out.println("Filesdropdown is Selected");
		 
	    Filesdropdown.click();
		
		
		WebElement LastModifiedDate = driver.findElement(By.xpath("//span[@title='Last Modified Date']"));
		LastModifiedDate.click();
		
		Thread.sleep(8000);
		
//		JavascriptExecutor je = (JavascriptExecutor)driver;
//		
//		WebElement DD1 = driver.findElement(By.xpath("((//div[@class='forceVirtualActionMarker forceVirtualAction'])[1]//span)[1]"));
//		je.executeScript("arguments[0],click();",DD1);
		
		WebElement DD1 = driver.findElement(By.xpath("((//div[@class='forceVirtualActionMarker forceVirtualAction'])[1]//span)[1]"));
		DD1.click();
		
		Thread.sleep(3000);
		
		WebElement PublicLink = driver.findElement(By.xpath("//a[@title='Public Link']"));
		PublicLink.click();
		
		Thread.sleep(3000);
		boolean NewLinkText = driver.findElement(By.xpath("//input[@name='publicLinkURL']")).isEnabled();
		
		if(NewLinkText) {
			System.out.println("New Link Text is enabled");
		}
		else{
			System.out.println("New Link Text is disabled");
		}
		Thread.sleep(2000);
		
		
		WebElement Privatelink = driver.findElement(By.xpath("//button[@title='Close this window']"));
		Privatelink.click();
		Thread.sleep(3000);
		
//		WebElement DD2 = driver.findElement(By.xpath("((//div[@class='forceVirtualActionMarker forceVirtualAction'])[1]//span)[1]"));
//		je.executeScript("arguments[0],click();",DD2);
		
		WebElement DD2 = driver.findElement(By.xpath("//a[@title='Show 7 more actions']"));
        DD2.click();
        
		Thread.sleep(2000);
		WebElement Download = driver.findElement(By.xpath("//a[@title='Download']"));
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
		
		WebElement DD3 = driver.findElement(By.xpath("//li[@class='oneActionsDropDown']//a"));
        DD3.click();
		
        Thread.sleep(2000);
        
        WebElement Sharelink = driver.findElement(By.xpath("//a[@title='Share']"));
        Sharelink.click();
        
        Thread.sleep(2000);
        
        WebElement SearchUser = driver.findElement(By.xpath("//input[@title='Search People']"));
        SearchUser.click();
        SearchUser.sendKeys("Derrick");
        
        Thread.sleep(2000);
        WebElement DerrickSelection = driver.findElement(By.xpath("//div[@title='Derrick Dsouza']"));
        DerrickSelection.click();
        
        Thread.sleep(3000);
        WebElement Errormsg = driver.findElement(By.xpath("//li[@class='form-element__help']"));
        String ErrMsg = Errormsg.getText();
        System.out.println("Message is " + ErrMsg);
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[@class='deleteIcon']")).click();
        
        Thread.sleep(2000);
        
        WebElement SearchUser1 = driver.findElement(By.xpath("//input[@title='Search People']"));
        SearchUser1.click();
        SearchUser1.sendKeys("Integration");
        
        
        WebElement SecondUser = driver.findElement(By.xpath("//div[@title='Integration User']"));
        SecondUser.click();
        
        
        WebElement Textarea = driver.findElement(By.xpath("//textarea[@class='textArea textarea']"));
        Textarea.sendKeys("Bootcamp_Madhi_K");
        
        WebElement Share = driver.findElement(By.xpath("//span[text()='Share']"));
        Share.click();
        
        Thread.sleep(4000);
        
        String SuccessMsg = driver.findElement(By.xpath("//div[@class='forceVisualMessageQueue']")).getText();
        System.out.println("Successmsg is " + SuccessMsg);
        
        Thread.sleep(3000);
        
        WebElement UploadFile = driver.findElement(By.xpath("//div[@title='Upload Files']"));
        UploadFile.click();
        
        Thread.sleep(3000);
        
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
        
        WebElement Done = driver.findElement(By.xpath("//span[text()='Done']"));
        Done.click();
        
        Thread.sleep(10000);
        
        WebElement DD4 = driver.findElement(By.xpath("((//div[@class='forceVirtualActionMarker forceVirtualAction'])[1]//span)[1]"));
        DD4.click();
        
        Thread.sleep(3000);
        
        
        WebElement ViewFileDetails = driver.findElement(By.xpath("//a[@title='View File Details']"));
        ViewFileDetails.click();
        
        Thread.sleep(5000);
        
        String FileName = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[1]")).getText();
        System.out.println("FileName is " + FileName);
        
        String Extension = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[2]")).getText();
        System.out.println("Extension name is " + Extension);
        
        
        WebElement CloseTab = driver.findElement(By.xpath("//button[contains(@title,'test') and contains(@title,'Close')]"));
		CloseTab.click();
		
		
		Thread.sleep(10000);
		
		//button[@title='Show Navigation Menu']
		
		WebElement DD5 = driver.findElement(By.xpath("//button[@title='Show Navigation Menu']"));
		DD5.click();
        
		WebElement FilesDD1 = driver.findElement(By.xpath("(//span[@class='slds-media__body'])[12]"));
		FilesDD1.click();
        
		Thread.sleep(5000);
		
		WebElement DD6 = driver.findElement(By.xpath("//ul[@class='oneActionsRibbon']//div//a"));
		DD6.click();
		
		Thread.sleep(3000);
		
		
		WebElement Delete = driver.findElement(By.xpath("//a[@title='Delete']"));
		Delete.click();
		
		WebElement DeleteBt = driver.findElement(By.xpath("//span[text()='Delete']"));
		DeleteBt.click();
		
		Thread.sleep(6000);
		
		String DelMsg = driver.findElement(By.xpath("//div[@class='forceVisualMessageQueue']")).getText();
		System.out.println("Delete Message is" + DelMsg);

         driver.close();
	}
	
}
