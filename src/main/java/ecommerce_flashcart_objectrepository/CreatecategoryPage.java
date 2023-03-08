package ecommerce_flashcart_objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatecategoryPage {
	WebDriver driver;
	
	//declare the webelements 
	@FindBy(xpath="//input[@name='category']") public WebElement CategoryName;
	@FindBy(xpath="//textarea[@name='description']") public WebElement Description;
	@FindBy(xpath="//button[.='Create']") public WebElement submit;
	@FindBy(xpath="//h3[.='Category']") public WebElement CategoryTag;
	
	public CreatecategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void insertData(String Category,String description)
	{
		CategoryName.sendKeys(Category);
		Description.sendKeys(description);
		submit.click();
		
	}
	public String pageVerification()
	{
		return CategoryTag.getText();
	}
	
}
