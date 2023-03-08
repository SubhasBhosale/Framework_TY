package Retry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class SetTestParameter implements IAnnotationTransformer
{
	/**
	 * here we are setting RetryAnalyzer for class RetryImplementation
	 * IAnnotationTransformer -it is a listener annotation ,so we can mention through listeners also
	 * we can mention listeners in testNG.xml 
	 */
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,
			Class<?> occurringClazz)
	{                               //class name 
		annotation.setRetryAnalyzer(RetryImplementation.class);    //set to all test annotation method
		//		annotation.setInvocationCount(3);
	}

}

/*
 * we are giving extra annotation for @Test (testNG class)
 * Here we are using this, we'll retry to execute test case till it will get execute 
 * 
 * */
