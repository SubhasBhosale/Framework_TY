package ecommerce_flashcart_objectrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomm_genericutility_webaction.dropDownUtility;

public class SubcategoryPage {
	WebDriver driver;
	@FindBy(xpath="//select[@name='category']") WebElement dropdown;
	@FindBy(xpath="//input[@name='subcategory']") WebElement subcategory;
	@FindBy(xpath="//button[@name='submit']") WebElement submit;
	@FindBy(xpath = "//strong[.='Well done!']")public WebElement text;

	public SubcategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
/**
 * catgory ---- add previous category 
 * sbCategory ----- insert new subcategory value
 * @param catgory
 * @param sbCategory
 * @throws InterruptedException 
 */
	public void createsubcategory(String catgory,String sbCategory) throws InterruptedException
	{
		dropDownUtility dd = new dropDownUtility();
		dd.handleDropDown(dropdown, catgory);
		subcategory.sendKeys(sbCategory);
		submit.click();
	}
	public String pageVerification()
	{
		return text.getText();
	}
}
