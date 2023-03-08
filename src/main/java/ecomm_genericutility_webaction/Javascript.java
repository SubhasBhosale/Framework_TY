package ecomm_genericutility_webaction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='htt://localhost:8888'");
	}

}
