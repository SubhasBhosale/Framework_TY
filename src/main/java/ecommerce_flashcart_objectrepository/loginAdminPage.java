package ecommerce_flashcart_objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class loginAdminPage {
	//WebDriver driver;
	//declaration
	@FindBy(xpath="//input[@name='username']") private WebElement userName;
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(xpath="//button[.='Login']") private WebElement lgnbutton;

	//initialization
	public loginAdminPage(WebDriver driver)                        //contructor with no return type
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//utilization
	public void loginAction(String usn,String pwd)
	{
		userName.sendKeys(usn);
		password.sendKeys(pwd);
		lgnbutton.click();
	}

}

