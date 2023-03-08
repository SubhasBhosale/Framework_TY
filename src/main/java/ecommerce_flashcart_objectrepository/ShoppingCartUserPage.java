package ecommerce_flashcart_objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomm_genericutility_webaction.verification_utility;

public class ShoppingCartUserPage {
	WebDriver driver;

	@FindBy(xpath="//button[.='PROCCED TO CHEKOUT']")private  WebElement proccedToCheckOut;
	@FindBy(xpath="//li[.='Shopping Cart']") public WebElement shoppingcarttxt;

	public ShoppingCartUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void CartUserPage_ProceedToCheckout()
	{
		proccedToCheckOut.click();
	}
	public String pageVerification()
	{
		return shoppingcarttxt.getText();
	}
	

}
