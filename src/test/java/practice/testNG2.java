package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG2 {
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass ====> 2");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod ====> 2");
	}

	@Test
	public void testNG1()
	{
        System.out.println("testNG - 2");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod ====> 2");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass ====> 2");
	}
	
}
