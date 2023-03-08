package ecomm_genericutility_webaction;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class PopupUtiltity
{
	/**
	 * This method is used to accept the alert popup
	 * @param driver
	 */
public void acceptAlert(WebDriver driver)
{
    Alert alert = driver.switchTo().alert();
    alert.accept();
}
/**
 * This method is used to dismiss the alert popup
 * @param driver
 */
public void dismissAlert(WebDriver driver)
{
	 driver.switchTo().alert().dismiss();
}
/**
 * This method is used to get the text from the alert popup
 * @param driver
 * @return
 */
public String getDatatoAlert(WebDriver driver)
{
	return driver.switchTo().alert().getText();
}
/**
 * This method is used to pass the data into alert
 * @param driver
 * @param data
 */
public void setDataToAlert(WebDriver driver,String data)
{
 driver.switchTo().alert().sendKeys(data);
}
/**
 * This method is used to switch control from one window to another window
 * @param driver
 * @param strategy
 * @param verificationvalue
 */
public void switchWindow(WebDriver driver,String strategy,String verificationvalue)
{
	Set<String> windows = driver.getWindowHandles();
	for(String id:windows)
	{
		if(strategy.equalsIgnoreCase("exact_url"))
		{
			if(driver.getCurrentUrl().equalsIgnoreCase(verificationvalue))
			{
				break;
			}
		}
		else if(strategy.equalsIgnoreCase("partial_url"))
		{
			if(driver.getCurrentUrl().contains(verificationvalue))
			{
				break;
			}
		}
		else if(strategy.equalsIgnoreCase("exact_title"))
		{
			if(driver.getTitle().equalsIgnoreCase(verificationvalue));
			break;
		}
		else if(strategy.equalsIgnoreCase("partial_title"))
		{
			if(driver.getTitle().contains(verificationvalue))
			{
				break;
			}
		}
	}
}


}

