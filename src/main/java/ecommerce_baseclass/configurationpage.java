package ecommerce_baseclass;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import Constants.FrameworkContants1;
import ecomm_flashcart_enum.Propertykey;
import ecomm_genericutility_webaction.ExcelUtility;
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
import ecommerce_flashcart_objectrepository.loginAdminPage;

public class configurationpage extends BaseClassDeclaration
{
	/**
	 * 
	 * @throws IOException
	 */
@BeforeClass
	public void beforeclass() throws IOException  
	{
		su = new selenium_utility();	
		vfu = new verification_utility();
		du = new dropDownUtility();
		xlu = new ExcelUtility(FrameworkContants1.TEST_EXCEL_FILE_PATH);
		pu = new Propertyutility(FrameworkContants1.TEST_PROPERTY_FILE_PATH);
		wu=new waitUtility();

		popu = new PopupUtiltity();
		 sa = new SoftAssert();                                                //remove from here add in script
    }
	/**
	 *This method is used to launch the browser and maximize the browser
	 */
	@BeforeMethod(alwaysRun = true)
	public void beforemethoduser()
	{
		driver = su.launchBrowser("chrome");
		wu.waitForElementLoad(driver, 10);
		cpa = new Commonpage_admin(driver);                     //add in script
		lup = new Loginuserpage(driver);						//add in script
		cpu = new Commonpage_user(driver);						//add in script
		lap = new loginAdminPage(driver);						//add in script
		su.maximizeBrowser();
		
		
	}
	/**
	 * This method is used to close the excel 
	 * @throws IOException
	 */
	@AfterClass
	public void afterclass() throws IOException {
		xlu.close();
		sa.assertAll();                                            //remove from here add in script
	}

}
