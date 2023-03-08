package ecommerce_flashcart_objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAddressUserPage {

	WebDriver driver;
	@FindBy(xpath="//a[text()='Shipping / Billing Address']") private WebElement billingAddressTab;
	@FindBy(xpath="//input[@name='billingcity']") private WebElement billingcity;
	@FindBy(xpath="//button[@name='update']") private WebElement submitbutton;
	
	public BillingAddressUserPage(WebDriver driver)                        //contructor with no return type
	{
	    this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void checkoutprogress()
	{
		billingAddressTab.click();
	}
	
	public void loginAction(String billingCity)
	{
		billingcity.clear();
		billingcity.sendKeys(billingCity);
		submitbutton.click();
		driver.switchTo().alert().accept();
	}
}
