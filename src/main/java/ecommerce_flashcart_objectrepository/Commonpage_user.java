package ecommerce_flashcart_objectrepository;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Commonpage_user {
	WebDriver driver;
	String partialXpath="//a[text()='%s']";          //My Account ,Wishlist, My Cart,  Login
    @FindBy(xpath="//input[@name='product']") WebElement searchTextField;
    @FindBy(xpath="//button[@name='search']") WebElement searchbtn;
    
	public WebElement referance(String keywordToLoacteXpath,String replaceData)
	{
          String finalXpath = String.format(keywordToLoacteXpath,replaceData);
         return driver.findElement(By.xpath(finalXpath));
	}

	//foramt --- > replace data %s 
	//we can use replace ,replaceAll interms of format
	public Commonpage_user(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnCommonTabInUpperNvgbtn(String replaceData1)
	{
		referance(partialXpath,replaceData1).click();
	}
	public void searchAction(String map)
	{
		searchTextField.sendKeys(map);
		searchbtn.click();
	}
	public String pageVerification()
	{
	   return driver.getTitle();
	}

}
