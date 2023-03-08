package ecommerce_flashcart_objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_vtiger
{                      
	
	//declaration
	@FindBy(xpath="//input[@name='user_name']") private WebElement userNameTxtField;
	@FindBy(xpath="//input[@name='user_password']") private WebElement userNamePasswordTxtField;
	@FindBy(xpath="//input[@id='submitButton']") private WebElement loginBtn;

	
	//initialization
	public LoginPage_vtiger(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //this will pointing to the current objrct              
	}

	
	//utilization --->>> bussiness actions  (as a getter)               
	public void logicAction(String username,String password)
	{
		userNameTxtField.sendKeys(username);
		userNamePasswordTxtField.sendKeys(password);
		loginBtn.click();
	}
	
}
/*
 * example for encapsulation (v.v.v.v.v.Imp)
 */