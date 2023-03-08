package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_GroupExecution {

		@Test(groups="SmokeTest")
		public void test1()
		{
			System.out.println("SmokeTest");
		}
		//********************************************************
		@Test(groups={"RegressionTest","Minor"})
		public void test2()
		{
			System.out.println("Regression & Minor");
		}
		//********************************************************		
		@Test(groups={"RegressionTest","Major"})
		public void test3()
		{
			System.out.println("Regression & Major");
		}
		//********************************************************		
		@Test(groups={"RegressionTest","Minor"})
		public void test4()
		{
			System.out.println("Regression & Minor");
		}	
		//********************************************************	
		@Test(groups={"RegressionTest","Major"})
		public void test5()
		{
			System.out.println("Regression & Major");
		}	
		
		@Test(groups={"RegressionTest","Minor"})
		public void test6()
		{
			System.out.println("Regression & Minor");
		}	
}
