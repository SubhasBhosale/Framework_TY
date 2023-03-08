package ecomm_genericutility_webaction;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium_utility {
	private WebDriver driver;        //bcz user can access
	/**
	 * This method is used to launch the different browsers 
	 * @param browser
	 * @return
	 */
	
	public WebDriver launchBrowser(String browser)
	{ 
		switch(browser)
		{
		case "chrome":	                            //Ex of Polymorphism in our framework
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("Enter proper key '" + browser + "'");
			break;

		}
		return driver;
	}
	/**
	 * This method is used to maximize the browser
	 */
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to resize the browser
	 * @param width
	 * @param height
	 */
	public void reSizeBrowser(int width,int height)
	{
		driver.manage().window().setSize(new Dimension(width, height));
	}
	/**
	 * This method is used to launch the application
	 * @param userurl
	 */
	public void launchApplicationGet(String url)
	{
		driver.get(url);

	}
	/**
	 * It is an another method to open the application in the browser
	 * @param url
	 */
	public void launchApplnNavigate(String url)
	{
		driver.navigate().to(url);
	}
	/**
	 * This method is used to close the browser
	 */
	public void closeBrowser()
	{
		driver.quit();
	}
	/**
	 * This method is used to close a particular tab
	 */
	public void closetab()
	{
		driver.close();
	}
	/**
	 * This method is used to open thebrowser in fullscreen
	 */
	public void openfullsizebrowser()
	{
		driver.manage().window().fullscreen();
	} 
	/**
	 * This method is used to get the position of the method
	 */
	public void browserposition()
	{
		driver.manage().window().getPosition();
	}
	/**
	 *  This method is used to get the size of the browser
	 */
	public void sizeofBrowser()
	{
		driver.manage().window().getSize();
	}
	/**
	 * This method is used to set the size of the browser
	 * @param x
	 * @param y
	 */
	public void sizeofBrowser(int x,int y)
	{
		driver.manage().window().setPosition(new Point(x,y));
	}
	/**
	 * This method is used to fetch title of the current page
	 */
	public String fetchTitleOfPage()
	{
		return driver.getTitle();
	}
	/**
	 * This method is used to fetch source code of the current page
	 */
	public void fetchSourceCode()
	{
		driver.getPageSource();
	}
	/**
	 * This method is used to fetch ID of the current window 
	 */
	public void fetchcurrentid()
	{
		driver.getWindowHandle();
	}
	/**
	 * This method is used to fetch IDs of the windows which are opened at that moment 
	 */
	public void fetchidsofbrowsers()
	{
		driver.getWindowHandles();
	}
	/**
	 * This method is used to navigate to previous page
	 */
	public void goBackwordInBrowser()
	{
		driver.navigate().back();
	}
	/**
	 * This method is used to navigate to forward page
	 */
	public void goForwordInBrowser()
	{
		driver.navigate().forward();
	}
	/**
	 * This method is used to refresh the current page
	 */
	public void refreshBrowser()
	{
		driver.navigate().refresh();
	}
	/**
	 * This method is used to get the url of the current page
	 * @return 
	 */
	public String getcurrentPageUrl()
	{
		return	driver.getCurrentUrl();
	}
	/**
	 * This method is used to navigate to the main page
	 */
	public void mainframe()
	{
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is used to navigate to the previous page
	 */
	public void previousframe()
	{
		driver.switchTo().parentFrame();
	}
	/**
	 * This method is used to take screenshot
	 * @throws IOException
	 */
	public void getScreenshot(String filepath) throws IOException
	{
		TakesScreenshot tss=(TakesScreenshot) driver;
		File dsr = tss.getScreenshotAs(OutputType.FILE);
		File tst=new File(filepath);
		FileUtils.copyFile(dsr,tst);
	}
	/**
	 *  * This method is used to take screenshot of the webEelement
	 * @param ele
	 * @param elementName
	 * @return
	 * @throws IOException
	 */
	public String getScreenshot(WebElement ele,String elementName) throws IOException 
	{
		File scr = ele.getScreenshotAs(OutputType.FILE);
		File tst=new File("./screenshot/elements/"+elementName+"_"+new JavaUtility().getCurrentDateTime());
		FileUtils.copyFile(scr, tst);
		return tst.getAbsolutePath();	
	}	
	public  String getScreenshot(String testCaseName,JavaUtility javaUtility) throws IOException	
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst = new File("./screenshot"+testCaseName+"_"+javaUtility.getCurrentDateTime()+".png");
		FileUtils.copyFile(src, dst);
		return dst.getAbsolutePath();   //bcz at the 230line we are mentioning relative path
	}
	/**
	 * 
	 * @param testCaseName
	 * @param javaUtility
	 * @return
	 * @throws IOException
	 */
	public  String getScreenshot(WebElement ele,String testCaseName,JavaUtility javaUtility) throws IOException	
	{	
	File src=ele.getScreenshotAs(OutputType.FILE);
	File dst = new File("./screenshot"+testCaseName+"_"+javaUtility.getCurrentDateTime()+".png");
		FileUtils.copyFile(src, dst);
		return dst.getAbsolutePath();   //bcz at the 230line we are mentioning relative path
	}
	public  String getScreenshot1()
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
	    String path=ts.getScreenshotAs(OutputType.BASE64);
	    return path;
	
	}
	/**
	 * This method is used to scroll down the webPage
	 */
	public void scrollDown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
		}

		for(int j=0;j<3;j++)
		{
			js.executeScript("window.scrollBy(0,-500)");
		}
	}
	
	public boolean switchWindow(WebDriver driver, String expPageTitle) {

		Set<String> windows = driver.getWindowHandles();
		boolean found = false;
		for (String window : windows) {
			driver.switchTo().window(window);

			if (driver.getTitle().contains(expPageTitle)) {
				found = true;
				break;
			}
		}
		return found;
	}

	/**
	 * This method will switch the window based on given page url
	 * 
	 * @param expPageTitle
	 * @return
	 */
	public boolean switchWindow(String expPageUrl, WebDriver driver) {

		Set<String> windows = driver.getWindowHandles();
		boolean found = false;
		for (String window : windows) {
			driver.switchTo().window(window);

			if (driver.getTitle().contains(expPageUrl)) {
				found = true;
				break;
			}
		}
		return found;
	}
/**
 * 
 * @param driver
 * @param strategy
 * @param verificationvalue
 */
	public void switchWindow(WebDriver driver, String strategy, String verificationvalue) {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
			if (strategy.equalsIgnoreCase("exact_url")) {
				if (driver.getCurrentUrl().equalsIgnoreCase(verificationvalue)) {
					break;
				}
			} else if (strategy.equalsIgnoreCase("partial_url")) {
				if (driver.getCurrentUrl().contains(verificationvalue)) {
					break;
				}
			} else if (strategy.equalsIgnoreCase("exact_title")) {
				if (driver.getTitle().equalsIgnoreCase(verificationvalue))
					;
				break;
			} else if (strategy.equalsIgnoreCase("partial_title")) {
				if (driver.getTitle().contains(verificationvalue)) {
					break;
				}
			}
		}
	}
}
