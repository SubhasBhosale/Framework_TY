package practice;

import java.util.Map;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Constants.FrameworkContants1;
import ecomm_flashcart_enum.CommonTabNamesUser;
import ecomm_flashcart_enum.Excelsheet;
import ecomm_flashcart_enum.Propertykey;
import ecomm_genericutility_webaction.selenium_utility;
import ecommerce_flashcart_objectrepository.Commonpage_user;
import ecommerce_flashcart_objectrepository.Loginuserpage;
import ecommerce_flashcart_objectrepository.PaymentUserPage;
import ecommerce_flashcart_objectrepository.Searchresult;
import ecommerce_flashcart_objectrepository.ShoppingCartUserPage;
import ecommerce_flashcart_objectrepository.WishlistPageUserPage;

public class Testscript123  {
	
/*	@Test(invocationCount = 0)
	public void xyz1()
	{
		WishlistPageUserPage wlp = new WishlistPageUserPage(driver);
		Loginuserpage lup = new Loginuserpage(driver);
		ShoppingCartUserPage scup = new ShoppingCartUserPage(driver);                                    
		PaymentUserPage pup = new PaymentUserPage(driver);
		Searchresult sr = new Searchresult(driver); 

		vfu.exactverifiaction(driver.getTitle(), "Shopping Portal Home Page", "page", "Shopping Portal Home ");
		cpu.clickOnCommonTabInUpperNvgbtn(CommonTabNamesUser.LOGIN.getTabName());
		vfu.exactverifiaction(driver.findElement(By.xpath("//h4[.='sign in']")).getText(), "SIGN IN", "page", "SIGN IN ");
		lup.loginAction(pu.getPropertyData(Propertykey.UMAILID), pu.getPropertyData(Propertykey.UPWD));
		cpu.searchAction("The Wimpy Kid Do");
		sr.addToCartbtnclk();
		popu.acceptAlert(driver);
		scup.CartUserPage_ProceedToCheckout();
		vfu.exactverifiaction(driver.findElement(By.xpath("//li[@class='active']")).getText(), "Payment Method", "page", "Payment Method ");;
		pup.PaymentUserPage_cod_submit(); 
	}*/
		@Test
		public void xyz2() throws InterruptedException
		{
			/*Commonpage_user cpu = new Commonpage_user(driver);
			WishlistPageUserPage wlp = new WishlistPageUserPage(driver);
			Loginuserpage lup = new Loginuserpage(driver);
			ShoppingCartUserPage scup = new ShoppingCartUserPage(driver);                                    
			PaymentUserPage pup = new PaymentUserPage(driver);
			Searchresult sr = new Searchresult(driver);

			su.launchApplicationGet(pu.getPropertyData(Propertykey.USERURL));
			vfu.exactverifiaction(driver.findElement(By.xpath("//h2[.='Shopping Portal']")).getText(), "Shopping Portal", "page", "shopping login ");
			cpu.clickOnCommonTabInUpperNvgbtn(CommonTabNamesUser.LOGIN.getTabName());
			lup.loginAction(pu.getPropertyData(Propertykey.UMAILID),pu.getPropertyData(Propertykey.UPWD));    ////
			vfu.exactverifiaction(driver.findElement(By.xpath("//ul/li[1]")).getText(), "Welcome -Anuj Kumar", "page", "My profile ");
			Map<String, String> map = xlu.getData(Excelsheet.CONTACTS.getSheetName(), Excelsheet.WISHLISTMYCART.getSheetName());
			cpu.searchAction(map.get("Search"));
			System.out.println(map.get("Search"));
		//	cpu.searchAction(xlu.getData(Excelsheet.CONTACTS.getSheetName(), "wishlist_mycart", "Search"));
			driver.findElement(By.xpath("//a[@href='category.php?pid=15&&action=wishlist']")).click();
			vfu.exactverifiaction(driver.findElement(By.xpath("//th[.='my wishlist']")).getText(), "MY WISHLIST", "page", "MY WISHLIST ");
			wlp.addtoCartbtn();
			cpu.clickOnCommonTabInUpperNvgbtn(CommonTabNamesUser.MYCART.getTabName());
			vfu.exactverifiaction(driver.findElement(By.xpath("//li[.='Shopping Cart']")).getText(), "Shopping Cart", "page", "Shopping Cart ");
			scup.CartUserPage_ProceedToCheckout();
			pup.PaymentUserPage_cod_submit();*/
		}
}
