package ecommerce_flashcart_objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentUserPage {
	
		WebDriver driver;

		 @FindBy(xpath="//input[@value='COD']") private WebElement codButton;
		 @FindBy(xpath="//input[@name='submit']")private WebElement submitButton;
		 @FindBy(xpath="//li[@class='active']") public WebElement payementtxt;
		public PaymentUserPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

		public void PaymentUserPage_cod_submit()
		{
			codButton.click();
			submitButton.click();
		}
		
		public String pageVerification()
		{
			return payementtxt.getText();
		}
	}

