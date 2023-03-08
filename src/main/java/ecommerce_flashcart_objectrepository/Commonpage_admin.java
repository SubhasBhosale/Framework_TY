package ecommerce_flashcart_objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ecomm_flashcart_enum.TabNamesAdmin;

public class Commonpage_admin {
	WebDriver driver;
	
	//**********************declaration************************
	private String tabPartialXpath="//a[text()[normalize-space()='%s']]";	
	private WebElement convertToWebelement(String partialXpath,String replaceData)
	{
		String Xpath = String.format(partialXpath,replaceData);
		return driver.findElement(By.xpath(Xpath));
	}
	
	
	//********************initialization***************************
	public Commonpage_admin(WebDriver driver)
	{
		this.driver=driver;  //mainly this will use while we aregetting staleElement exception then testscriptdriver shift to pomdriver and fetch the elements which are already stored by pom driver                                          // change the testscript driver to pom driver
		PageFactory.initElements(driver,this); //then that changed driver will point out to pom object in that all elements are saved 
	}
	
	
	//*********************Business logic**********************
	public void clickTab(TabNamesAdmin tabName)
	{
		convertToWebelement(tabPartialXpath,tabName.getTab()).click();
	}
} 
