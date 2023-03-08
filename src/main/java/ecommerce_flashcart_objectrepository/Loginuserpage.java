package ecommerce_flashcart_objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginuserpage {
     
	@FindBy(xpath="//input[@name='email']") private WebElement userMailid;
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(xpath="//button[.='Login']") private WebElement lgnbutton;
	@FindBy(xpath="//h4[.='sign in']") public WebElement signintxt;

	public Loginuserpage(WebDriver driver)                        //contructor with no return type
	{
	
		PageFactory.initElements(driver, this);
	}

	
	public void loginAction(String usn,String pwd)
	{
		userMailid.sendKeys(usn);
		password.sendKeys(pwd);
		lgnbutton.click();
	}
	
	public String pageVerification()
	{
		return signintxt.getText();
	}

}
