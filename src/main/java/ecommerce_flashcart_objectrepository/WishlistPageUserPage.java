package ecommerce_flashcart_objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPageUserPage {
	WebDriver driver;
	@FindBy(xpath="//a[.='Add to cart']") public WebElement addToCart;
	@FindBy(xpath="//th[.='my wishlist']") public WebElement wishlisttxt;
 	
	public WishlistPageUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addtoCartbtn()
	{
			addToCart.click();
	}
	
	public String pageVerification()
	{
		return wishlisttxt.getText();
	}
	
}
