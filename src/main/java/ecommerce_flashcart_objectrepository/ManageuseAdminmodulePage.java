package ecommerce_flashcart_objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageuseAdminmodulePage {

	@FindBy(xpath="//input['text']")public WebElement searchUser ;
	
	
	public ManageuseAdminmodulePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void manageuserSearchTextField(String userName)
	{
		searchUser.click();
		searchUser.sendKeys(userName);
	}
}
