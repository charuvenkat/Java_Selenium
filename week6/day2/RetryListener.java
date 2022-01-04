package week6.day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConsturctor, Method testMethod) {
		annotation.setRetryAnalyzer(week6.day2.RetryFailedTests.class);
		
		System.out.println(" RetryListener started");
	}
			
			

}
