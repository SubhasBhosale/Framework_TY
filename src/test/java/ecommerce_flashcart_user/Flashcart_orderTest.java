package ecommerce_flashcart_user;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ecomm_flashcart_enum.CommonTabNamesUser;
import ecomm_flashcart_enum.Excelsheet;
import ecomm_flashcart_enum.Propertykey;
import ecomm_genericutility_webaction.PopupUtiltity;
import ecomm_genericutility_webaction.Propertyutility;
import ecomm_genericutility_webaction.selenium_utility;
import ecomm_genericutility_webaction.verification_utility;
import ecomm_genericutility_webaction.waitUtility;
import ecommerce_baseclass.configurationpage;
import ecommerce_flashcart_objectrepository.Commonpage_user;
import ecommerce_flashcart_objectrepository.Loginuserpage;
import ecommerce_flashcart_objectrepository.PaymentUserPage;
import ecommerce_flashcart_objectrepository.Searchresult;
import ecommerce_flashcart_objectrepository.ShoppingCartUserPage;
import ecommerce_flashcart_objectrepository.WishlistPageUserPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Flashcart_orderTest extends configurationpage{
	@Test
	public void xyz()
	{
		WishlistPageUserPage wlp = new WishlistPageUserPage(driver);
		Loginuserpage lup = new Loginuserpage(driver);
		ShoppingCartUserPage scup = new ShoppingCartUserPage(driver);                                    
		PaymentUserPage pup = new PaymentUserPage(driver);
		Searchresult sr = new Searchresult(driver); 

		su.launchApplicationGet(pu.getPropertyData(Propertykey.USERURL));
		Assert.assertEquals(cpu.pageVerification(), "Shopping Portal Home Page");
		cpu.clickOnCommonTabInUpperNvgbtn(CommonTabNamesUser.LOGIN.getTabName());
		Assert.assertEquals(lup.pageVerification(), "SIGN IN");
		lup.loginAction(pu.getPropertyData(Propertykey.UMAILID), pu.getPropertyData(Propertykey.UPWD));
		cpu.searchAction(xlu.getData(Excelsheet.CONTACTS.getSheetName(),Excelsheet.WISHLISTMYCART.getSheetName(),Excelsheet.SEARCH.getSheetName()));
		sr.addToCartbtnclk();
		popu.acceptAlert(driver);
		scup.CartUserPage_ProceedToCheckout();
		Assert.assertEquals(pup.pageVerification(), "Payment Method");
		pup.PaymentUserPage_cod_submit(); 
	}
}
