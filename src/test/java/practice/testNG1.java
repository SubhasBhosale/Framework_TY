package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG1 {
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass ====> 1");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod ====> 1");
	}

	@Test
	public void testNG3()
	{
        System.out.println("testNG - 1");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod ====> 1");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass ====> 1");
	}
	
}
