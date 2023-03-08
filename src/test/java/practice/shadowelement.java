package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shadowelement {
@Test(invocationCount = 1)
public void test()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("chrome://downloads/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
     Object o=js.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar').shadowRoot.querySelector('cr-toolbar').shadowRoot.querySelector('#search').shadowRoot.querySelector('#searchInput')");
    WebElement ele=(WebElement) o;
     ele.sendKeys("abc");

}
/*
@Test
public void test2()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> ele = driver.findElements(By.xpath("//a"));

	System.out.println(ele.size());
	
	List<String> al = new ArrayList<>();
	List<String> brokenurl = new ArrayList<>();
	
	for(WebElement a:ele)
	{
		String pdf = a.getAttribute("href");
		al.add(pdf);
	}
	
	
	
	for( String u:al)
	{
		try
		{
			URL url = new URL(u);
			URLConnection urlconn = url.openConnection();
			HttpURLConnection httpurlConnection = (HttpURLConnection)urlconn;
			int statusCode = httpurlConnection.getResponseCode();
		   if(statusCode!=200)
		   {
			   
		   }
		
		}
	}
	
}*/
}
