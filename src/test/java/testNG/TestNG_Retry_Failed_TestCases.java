package testNG;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import Retry.RetryImplementation;
import ecommerce_baseclass.configurationPracticepage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Retry_Failed_TestCases extends configurationPracticepage {

	@Test(groups="Sanity")
	public void gmail()
	{
		Assert.fail();
		driver.get("https://www.gmail.com/");	
	}

	@Test(groups={"SmokeTesting","minor"})
	public void google()
	{
		driver.get("https:www.google.com");
	}
	@Test(groups={"SmokeTesting","major"})
	public void facebook()
	{
		driver.get("https://www.facebook.com/");
	}
}
/*
 *	WebDriver driver;															//if we use method seperate browsers will launch for each t.s
	@BeforeMethod                                        //if we launch the browser in class all t.s execute in one browser
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	} 
 * */
