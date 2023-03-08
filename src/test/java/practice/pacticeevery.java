package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import Constants.FrameworkContants;
import ecomm_flashcart_enum.Propertykey;
import ecomm_genericutility_webaction.Propertyutility;

public class pacticeevery extends practiceMain
{
	@Test
	public void test() throws EncryptedDocumentException, IOException {
		practiceMain p=new practiceMain();
		String z = p.getdatamultikey("./src/test/resources/practice_excel/Book2.xlsx", "sheet", "TestCase1","p2");
		System.out.println(z);
	//	getdatamultikey mkv = new getdatamultikey("./src/test/resources/practice_excel/Book2.xlsx","sheet","TestCase");
	   
	
	
	}
		
		
		
		
	
}