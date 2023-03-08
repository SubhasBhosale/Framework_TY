package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class textfieldhandle {
 
	WebDriver driver;
	String partialxpath="//input[@id='%s']";
	public WebElement referance(String xpath,String replaceAbleData)
	{
		String finalxpath=String.format(xpath, replaceAbleData);
		return driver.findElement(By.xpath(finalxpath));
	}
		
	public textfieldhandle(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void textfied(String text,String datapass)
	{
		referance(partialxpath,text).sendKeys(datapass);
		
	}
	
}

