package ecommerce_baseclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Constants.FrameworkContants1;
import ecomm_flashcart_enum.Propertykey;
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
/**
 * for practice purpose like google ,yahoo
 * @author Subhas bhosale
 *
 */
public class configurationPracticepage 
{
	public String browser;
	public selenium_utility su;
	public Propertyutility pu;
	public JavaUtility ju;
	public WebDriver driver;
	@BeforeTest
	public void testsetup()
	{
		System.out.println("before test");
		su=new selenium_utility();
		ju=new JavaUtility();
	}
	@Parameters("browser")
	@BeforeClass
	public void beforeclass(@Optional String browser) throws IOException 
	{
		su = new selenium_utility();
		pu = new Propertyutility(FrameworkContants1.TEST_PROPERTY_FILE_PATH);
		this.browser = browser;
		if (browser == null) 
		{
			this.browser = pu.getPropertyData(Propertykey.BROWSER);
		}
		driver = su.launchBrowser(this.browser);
	}
	@AfterClass
	public void afterclass() throws IOException {
	//	xlu.close();
	}

	@BeforeMethod
	public void beforemethoduser()
	{
		su.maximizeBrowser();
	}
}
