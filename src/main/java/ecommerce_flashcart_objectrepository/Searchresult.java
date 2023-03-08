package ecommerce_flashcart_objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchresult {

	@FindBy(xpath="//button[.='Add to cart']")private WebElement AddToCart;
	@FindBy(xpath="//a[@title='Wishlist']")private WebElement Wishlist;
	@FindBy(xpath="//a[@href='category.php?pid=15&&action=wishlist']") public WebElement wishlistbtn;
	
	public Searchresult(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addToCartbtnclk()
	{
		AddToCart.click();
	}
	public void addToWishlisttbtnclk()
	{
		Wishlist.click();
	//	wishlistbtn.click();
	}
	
	
	
}
