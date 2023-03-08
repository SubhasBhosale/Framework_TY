package ecomm_genericutility_webaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitUtility 
{
	/**
	 * 
	 * This method will be executed until particular period of time even though required action has been done 
	 * @param millisecond
	 */
	WebDriver driver=null;
public void pause(long millisecond)
{
	try
	{
		Thread.sleep(millisecond);
	} 
	catch (InterruptedException e)
	{
		e.printStackTrace();
	}
}
/**
 * This method is used to check for element for every 0.5 sec until the required element found and at last thows exception
 * @param driver
 * @param timeout
 */
public void waitForElementLoad(WebDriver driver,long timeout)
{
	driver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS);
}
/**
 * This method is used to check condition as title contains required value
 * @param driver
 * @param Z
 */
public void waitforElementwithcontainsCond(WebDriver driver,String Z)
{
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.titleContains(Z));
}
/**
 * This method is used to check condition as title contains required 
 * @param driver
 * @param Z
 */
public void waitforElementwithvisibilitycond(WebDriver driver,By Z)
{
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(Z));
}
/**
 * This method will act like custom wait so we can mention polling time and duration 
 * @param pollingTime
 * @param duration
 * @param element
 * @throws InterruptedException
 */
public void waitTillClick(long pollingTime,int duration,WebElement element) throws InterruptedException
{
	int count=0;
	while(count<duration)
	{
		try
		{
			element.click();
			break;
		}
		catch(Exception e)
		{
			Thread.sleep(pollingTime);
		    count=count+((int)pollingTime/1000);
		}
	}
}
	
		

}
