package practice;

import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.WebDriver;

import Constants.FrameworkContants1;
import ecomm_flashcart_enum.Excelsheet;
import ecomm_genericutility_webaction.ExcelUtility;
import ecomm_genericutility_webaction.selenium_utility;

public class handlemultitextfield {

	public static void main(String[] args) {
       selenium_utility su = new selenium_utility();
       WebDriver driver = su.launchBrowser("chrome");
       su.launchApplicationGet("file:///C:/Users/Subhas%20bhosale/OneDrive/Desktop/textfield.html");
       textfieldhandle tfh = new textfieldhandle(driver);
       ExcelUtility xlu = new ExcelUtility(FrameworkContants1.TEST_EXCEL_FILE_PATH);
       System.out.println(Excelsheet.CONTACTS.getSheetName());
       System.out.println(Excelsheet.TEXTBOX.getSheetName());
    
       
       Map<String, String> map = xlu.getData(Excelsheet.CONTACTS.getSheetName(),Excelsheet.TEXTBOX.getSheetName());
    for(Entry<String, String> m:map.entrySet())
    {
    	tfh.textfied(m.getKey(), m.getValue());
    }
      
      
  /*   tfh.textfied("text1",map.get("textfiled1"));
       tfh.textfied("text2",map.get("textfiled2"));
       tfh.textfied("text3",map.get("textfiled3"));*/
	}

}
