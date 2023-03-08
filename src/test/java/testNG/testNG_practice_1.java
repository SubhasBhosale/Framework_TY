package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_practice_1 {
	public class testNgPracticeClassTest {
		@BeforeSuite
		public void bsSetup() {	
			System.out.println("BeforeSuite - 1");		
		}
		@BeforeClass
		public void bcSetup() {

			System.out.println("BeforeClass -1");
		}
		@BeforeTest
		public void btSetup() {
			System.out.println("BeforeTest -1");
		}
		@BeforeMethod
		public void bmSetup() {
			System.out.println("BeforeMethod -1");
		}	
		}
		@Test
		public void test() {
			System.out.println("Test -1");	
		}
		@AfterClass
		public void acTearDown() {
			System.out.println("AfterClass-1");
		}
		@BeforeClass
		public void acTearUp() {
			System.out.println("BeforeClass-1");
		}
		@AfterMethod 
		public void amTearDown() {
			System.out.println("AfterMethod -1");
		}
		@BeforeMethod 
		public void bmTearUp() {
			System.out.println("BeforeMethod -1");
		}
		@AfterTest
		public void atTearDown() {
			System.out.println("AfterTest -1");
		}
		@AfterSuite
		public void asTearDown() {
			System.out.println("AfterSuit -1");     	}}
