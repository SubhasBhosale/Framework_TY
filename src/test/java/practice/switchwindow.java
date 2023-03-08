package practice;

import java.sql.DriverManager;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mysql.cj.jdbc.Driver;

import ecomm_genericutility_webaction.selenium_utility;

public class switchwindow {

	public static void main(String[] args) {
		selenium_utility su=new selenium_utility();
		WebDriver driver = su.launchBrowser("chrome");
		su.launchApplicationGet("https://www.naukri.com/");
		driver.findElement(By.xpath("//span[.='Remote']")).click();
		driver.findElement(By.xpath("//span[.='MNC']")).click();
	driver.findElement(By.xpath("//span[.='Data Science']")).click();
	

	String id = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		ids.remove(id);
		Iterator<String> pdf = ids.iterator();
		while(pdf.hasNext())
		{
			String pid = pdf.next();
			driver.switchTo().window(pid);
			String curl = driver.getCurrentUrl();
			if(curl.equalsIgnoreCase("MNC"))
			{
				driver.close();
			}
			
		}
	}

}
