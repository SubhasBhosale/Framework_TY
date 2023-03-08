package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Constants.FrameworkContants1;
import ecomm_flashcart_enum.Propertykey;
import ecomm_genericutility_webaction.JavascriptExecutorUtility;
import ecomm_genericutility_webaction.Propertyutility;
import ecomm_genericutility_webaction.selenium_utility;
import ecommerce_flashcart_objectrepository.LoginPage_vtiger;

public class Launch_vtiger {

	public static void main(String[] args) throws IOException {
		selenium_utility su = new selenium_utility();
		WebDriver driver = su.launchBrowser("chrome");  
		Propertyutility pu=new Propertyutility(FrameworkContants1.TEST_PROPERTY_FILE_PATH);
		String rmgURL = pu.getPropertyData(Propertykey.RMGURL);
		su.launchApplicationGet(rmgURL);
	
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='submitButton']"));
		JavascriptExecutorUtility js = new JavascriptExecutorUtility(driver);
		js.highlight(ele);
	js.getUrlOfThePage();
	js.getInnerTextOfWebpage();
	js.getTitleOfWebPage();
	js.refreshPage();
		
		
	//	LoginPage lp = new LoginPage(driver);
		//lp.logicAction(pu.getPropertyData(Propertykey.VTUNAME), pu.getPropertyData(Propertykey.VTUPWD));

	}

}
