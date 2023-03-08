package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_simple_practice {
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BC");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BM");
	}
@Test
public void test1()
{
	System.out.println("test1");
}
@AfterMethod
public void AfterMethod()
{
	System.out.println("AM");
}
@AfterClass
public void AfterClass()
{
	System.out.println("AC");
}
@Test
public void test2()
{
	System.out.println("test2");
}
}
