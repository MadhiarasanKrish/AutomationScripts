package listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class testNGListener implements IAnnotationTransformer, IRetryAnalyzer{
	
	int maxcount = 3;
	int initialcount=0;
	
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(this.getClass());
	}
	
	
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(initialcount<maxcount) {
			initialcount++;
			return true;
		}
		return false;
	}

}
