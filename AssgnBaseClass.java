package BaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import MultipleDataHandle.MultipleDataHandle;
import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.htmlReporter;

public class AssgnBaseClass extends htmlReporter implements WebDriverEventListener{

	
	public  RemoteWebDriver WebDriver;
	public EventFiringWebDriver driver;
	
	public ExtentHtmlReporter reporter;

	public ExtentReports extent;

	public  ExtentTest test;
	public static ExtentTest node;
	
	public ChromeOptions Options;
	
	public static WebDriverWait wait;

	public String testName, testDescriptionadded, testername, testcategory, ExcelFileName;
	
	
	@BeforeSuite
	public void starReport() {
		reporter = new ExtentHtmlReporter("./Reports/SecondAssignment.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);

	}

	@BeforeClass
	public void testDetails() {
		test = extent.createTest(testName, testDescriptionadded);
		//setTest(test);
		test.assignAuthor(testername);
		test.assignCategory(testcategory);
		

	}

	public void reportStep(String msg, String status) throws Exception {
		if (status.equalsIgnoreCase("Pass")) {
			getNode().pass(msg, MediaEntityBuilder.createScreenCaptureFromPath(".././Screenshot/img" + takeSnap() + ".png").build());

		} else if (status.equalsIgnoreCase("Fail")) {
			getNode().fail(msg, MediaEntityBuilder.createScreenCaptureFromPath(".././Screenshot/img" + takeSnap() + ".png").build());
			throw new RuntimeException();
		}
	}

	public long takeSnap() throws IOException {
		// TODO Auto-generated method stub
	    long random = (long) (Math.random() * 999999999L);
		
		//String random = new SimpleDateFormat("yyyy/MM/dd hh,mm,ss").format(new Date(0));
		File Source = getDriver().getScreenshotAs(OutputType.FILE);
		File Target = new File("./Screenshot/img" + random + ".png");
		FileUtils.copyFile(Source, Target);
		return random;
	}

	
	@BeforeMethod
	 public void BaseMethod() { 		
		    WebDriverManager.chromedriver().setup();
		    Options = new ChromeOptions();
		    Options.addArguments("--Disable-notifications");
			
		   WebDriver = new ChromeDriver(Options);
		   
		    driver = new EventFiringWebDriver(WebDriver);
			driver.register(this);
			setDriver(driver);
			getDriver().get("https://ap16.lightning.force.com");
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
			node = test.createNode(testName);
			setNode(node);
			
		   }

	 @AfterMethod
	 public void CloseMethod() {
		// driver.close();
		 System.out.println("Close Method Executed SuccessFully");
	 }
	 
	 @DataProvider(name="Assignment")
	 public String[][] Dataprov() throws IOException {
		 return MultipleDataHandle.TestData(ExcelFileName);
		 
	 }

	 
		@AfterSuite
		public void stopReport() {
			extent.flush();
		}
	 
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}
	 
	 
	 
}
