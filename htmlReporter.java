package listeners;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

public abstract class htmlReporter {
	private static final ThreadLocal<EventFiringWebDriver> localDriver = new ThreadLocal<EventFiringWebDriver>();
	private static final ThreadLocal<ExtentTest> localNode = new ThreadLocal<ExtentTest>();

	public void setNode(ExtentTest node) {
		localNode.set(node);
	}
	public ExtentTest getNode() {
		return localNode.get();
	}
	
	public void setDriver(EventFiringWebDriver driver) {
		localDriver.set(driver);
	}
	
	public EventFiringWebDriver getDriver() {
		return localDriver.get();
	}

}
