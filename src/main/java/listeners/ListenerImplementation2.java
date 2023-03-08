package listeners;

import org.testng.IClassListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Annotation.Report;
import ecomm_genericutility_webaction.ReportUtility;
import ecomm_genericutility_webaction.UtilityInstanceTransfer;
import ecommerce_baseclass.configurationPracticepage;
import ecommerce_baseclass.configurationpage;

public class ListenerImplementation2 implements ITestListener,IClassListener,ISuiteListener {
	private ReportUtility report;
	public static ReportUtility sreport;
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("onTestStart-->test");
		report.createTest(result.getMethod().getMethodName());
		Report reportAnnotation = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Report.class);
		System.out.println(reportAnnotation.author());
		System.out.println(reportAnnotation.category());
		report.addAuthor(UtilityInstanceTransfer.getExtentTest(),reportAnnotation.author());
		report.addCategory(UtilityInstanceTransfer.getExtentTest(), reportAnnotation.category());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("ontestSucess-->test");
		report.pass(UtilityInstanceTransfer.getExtentTest(),result.getMethod().getMethodName()+"is pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("ontestfailure-->test");
		report.fail(UtilityInstanceTransfer.getExtentTest(),result.getMethod().getMethodName()+"is fail");
		report.fail(UtilityInstanceTransfer.getExtentTest(),result.getThrowable());
		report.attachScreenshot(UtilityInstanceTransfer.getExtentTest(),configurationPracticepage.class.cast(result.getMethod().getInstance()).su.getScreenshot1(), result.getMethod().getMethodName()," base64");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("ontestskipped-->test");
		report.skip(UtilityInstanceTransfer.getExtentTest(),result.getMethod().getMethodName()+" is Skipped", result.getThrowable());
		report.attachScreenshot(UtilityInstanceTransfer.getExtentTest(),configurationPracticepage.class.cast(result.getMethod().getInstance()).su.getScreenshot1(), result.getMethod().getMethodName(),"base64");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("on test failed within succes percentage-->test");
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("on test failed with timeout-->test");
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("onstart-->test");
	
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("onFinish-->test");
		
	}

	@Override
	public void onBeforeClass(ITestClass testClass) 
	{
	
		System.out.println("on before class");
	}

	@Override
	public void onAfterClass(ITestClass testClass) 
	{
		System.out.println("on after Class");
	}
	@Override
	public void onStart(ISuite suite) 
	{
		report=new ReportUtility();
		sreport=report;
	}

	@Override
	public void onFinish(ISuite suite) 
	{
		report.saveReport();
	}


}
