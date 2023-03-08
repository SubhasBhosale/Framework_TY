package practice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yaml.snakeyaml.introspector.PropertyUtils;

import com.github.javafaker.Faker;
import com.mysql.cj.conf.PropertyKey;

import Constants.FrameworkContants1;
import ecomm_flashcart_enum.Excelsheet;
import ecomm_flashcart_enum.Propertykey;
import ecomm_genericutility_webaction.Propertyutility;
import ecomm_genericutility_webaction.selenium_utility;
import ecomm_genericutility_webaction.verification_utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class vtiger_create_contact_organization 
{

	public static void main(String[] args) throws IOException
	{

		selenium_utility su = new selenium_utility();
		 long random = new Faker().number().randomNumber(3,true);
		WebDriver driver = su.launchBrowser("chrome");    //this is the browser thats y we took webdriver for this one                                                //common data (propertykey)
		
		Propertyutility pu=new Propertyutility(FrameworkContants1.TEST_PROPERTY_FILE_PATH);
	
		String rmgURL = pu.getPropertyData(Propertykey.RMGURL);     
		su.maximizeBrowser();
		su.launchApplicationGet(rmgURL); 

		String ele = driver.findElement(By.xpath("//div[.='User Name']")).getText();
		verification_utility vfu = new verification_utility();

		vfu.exactverifiaction(ele, "User Name","page", "home page is displayed");

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(pu.getPropertyData(Propertykey.VTUNAME));          //"admin"
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pu.getPropertyData(Propertykey.VTUPWD));
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		String url = driver.getCurrentUrl();
		vfu.partialverification(url, "Home", "page","vtiger login " );

		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		WebElement Q2 = driver.findElement(By.xpath("//a[@class='hdrLink']"));
		String Q1 = Q2.getText();
		vfu.exactverifiaction(Q1, "Organizations", "page", "Organizations");

		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		//Creating New Organization

		String neworgName = driver.findElement(By.xpath("//span[.='Creating New Organization']")).getText();
		vfu.exactverifiaction(neworgName, "Creating New Organization","page","Creating New Organization ");
		String Z = "TYSS"+random;
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(Z);
		driver.findElement(By.xpath("//b[.='Organization Information']/../../preceding-sibling::tr//input[1]")).click();
		driver.findElement(By.linkText("Organizations")).click();
		List<WebElement> Q = driver.findElements(By.xpath("//a[@onclick='getListViewEntries_js(\"Accounts\",\"parenttab=Marketing&foldername=Default&order_by=account_no&start=&sorder=ASC\");']/../../following-sibling::tr[2]/td[2]"));
           for(WebElement P:Q)
           {
        	   System.out.println(P);       	   
           }
	}

}
