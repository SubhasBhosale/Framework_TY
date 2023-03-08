package Retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplementation implements IRetryAnalyzer
{
int count;                                   // default value is '0'
public boolean retry(ITestResult result)
{
	int maxcount=2;
	if(count<maxcount)
	{
		count++;
		return true;                 //if true it will check for infinte loop thats why we are putting if condition 
	}								  //if false it will simply skip
	return false;
}
}

/*
 * if true it will check for infinit loop thats why we are putting if condition if false it will simply skip
 * we are trying for 2 times for failed test cases ,if it will pass (t.c will fail for synchronization issue ,seesion time out issue)
 * ITestResult - it will check for the result of t.c (it will always monitor the testcase result)
 * IRetryAnalyzer -it is a interface from which we can fetch ITestResult
 * IRetryAnalyzer - testNG interface
 * (V.V.V.Impo)drawback of this method is we have to mention each time while we apllying for particular test script thats why we created SetTestParameter listenere
 * */
