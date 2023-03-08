package ecommerce_flashcart_admin;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import ecomm_flashcart_enum.CommonTabNamesUser;
import ecomm_flashcart_enum.Excelsheet;
import ecomm_flashcart_enum.Propertykey;
import ecomm_flashcart_enum.TabNamesAdmin;
import ecommerce_baseclass.configurationpage;
import ecommerce_flashcart_objectrepository.BillingAddressUserPage;
import ecommerce_flashcart_objectrepository.ManageuseAdminmodulePage;


public class Flashcart_UserDeatilsTest extends configurationpage{
 
    @Test
    public void test()
    {
		BillingAddressUserPage baup = new BillingAddressUserPage(driver); 
		ManageuseAdminmodulePage muap = new ManageuseAdminmodulePage(driver);
	   su.launchApplicationGet(pu.getPropertyData(Propertykey.USERURL));
		    
        
		Assert.assertEquals(driver.getTitle(), "Shopping Portal Home Page");
		cpu.clickOnCommonTabInUpperNvgbtn(CommonTabNamesUser.LOGIN.getTabName());
		Assert.assertEquals(driver.findElement(By.xpath("//h4[.='sign in']")).getText(), "SIGN IN");
		
		lup.loginAction(pu.getPropertyData(Propertykey.UMAILID), pu.getPropertyData(Propertykey.UPWD));
	
		//	vfu.exactverifiaction(driver.findElement(By.xpath("//h4[.='sign in']")).getText(), "SIGN IN", "page", "SIGN IN ");
		cpu.clickOnCommonTabInUpperNvgbtn(CommonTabNamesUser.MYACCOUNT.getTabName());
	//	Map<String, String> map = xlu.getData(Excelsheet.CONTACTS.getSheetName(),"UserDeatils");
		
		Assert.assertTrue( driver.findElement(By.xpath("//a[@href='#collapseOne']")).getText() . contains("MY PROFILE"));
		baup.checkoutprogress();
		Map<String, String> map = xlu.getData(Excelsheet.CONTACTS.getSheetName(),"UserDeatils");
		//	vfu.partialverification(driver.findElement(By.xpath("//a[@href='#collapseOne']")).getText(),"MY PROFILE", "page", "MY PROFILE ");
		baup.loginAction(map.get("Billing City"));
		cpu.clickOnCommonTabInUpperNvgbtn(CommonTabNamesUser.LOGOUT.getTabName());
		su.launchApplicationGet(pu.getPropertyData(Propertykey.URLADMIN));   
		Assert.assertEquals(driver.findElement(By.xpath("//a[@class='brand']")).getText(), "Shopping Portal | Admin");
		//vfu.exactverifiaction(driver.findElement(By.xpath("//a[@class='brand']")).getText(), "Shopping Portal | Admin", "page", "Shopping Portal | Admin ");
		lap.loginAction(pu.getPropertyData(Propertykey.ADMINUN),pu.getPropertyData(Propertykey.ADMINPWD));
		cpa.clickTab(TabNamesAdmin.MANAGEUSERS);
		Assert.assertEquals(driver.findElement(By.xpath("//h3[.='Manage Users']")).getText(), "Manage Users");
		//vfu.exactverifiaction(driver.findElement(By.xpath("//h3[.='Manage Users']")).getText(),"Manage Users", "page", "Manage Users ");
		muap.manageuserSearchTextField(map.get("Search"));
	}

}
