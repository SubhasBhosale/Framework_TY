package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Constants.FrameworkContants1;
import ecomm_genericutility_webaction.ExcelUtility;

public class TestNG_FetchDataFromExcel {

	@Test(dataProvider = "dataFromExcel")
	public void test1(String a5)         // if we mentioned 1 column
	{                                   //we mention only 1 string in the method 
		System.out.println(a5);
		System.out.println("test1");
	}
	@DataProvider
	public String[][] dataFromExcel()
	{
		
		ExcelUtility xlu = new ExcelUtility(FrameworkContants1.TEST_EXCEL_FILE_PATH);
	    return xlu.getData("Sheet1");
	}
}
