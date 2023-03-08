package ecommerce_baseclass;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import ecomm_genericutility_webaction.ExcelUtility;
import ecomm_genericutility_webaction.JavaUtility;
import ecomm_genericutility_webaction.PopupUtiltity;
import ecomm_genericutility_webaction.Propertyutility;
import ecomm_genericutility_webaction.dropDownUtility;
import ecomm_genericutility_webaction.selenium_utility;
import ecomm_genericutility_webaction.verification_utility;
import ecomm_genericutility_webaction.waitUtility;
import ecommerce_flashcart_objectrepository.Commonpage_admin;
import ecommerce_flashcart_objectrepository.Commonpage_user;
import ecommerce_flashcart_objectrepository.Loginuserpage;
import ecommerce_flashcart_objectrepository.ManageuseAdminmodulePage;
import ecommerce_flashcart_objectrepository.WishlistPageUserPage;
import ecommerce_flashcart_objectrepository.loginAdminPage;
/**
 * BaseClassDeclaration is the class where we stored all the object declaration
 * @author Subhas bhosale
 *
 */
public class BaseClassDeclaration {

	public waitUtility wu;  
	public selenium_utility su;   
	public verification_utility vfu;  
	public Propertyutility pu;  
	public ExcelUtility xlu;   
	public WebDriver driver ;
	public PopupUtiltity popu;       
	public Loginuserpage lup;
	public Commonpage_user  cpu;
	public JavaUtility ju;
	public dropDownUtility du;
	public Commonpage_admin cpa;
	public loginAdminPage lap;
	public String browser;
	public SoftAssert sa;
}
