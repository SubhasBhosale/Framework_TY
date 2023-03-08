package ecommerce_flashcart_objectrepository;

import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Constants.FrameworkContants1;
import ecomm_flashcart_enum.Excelsheet;
import ecomm_flashcart_enum.Propertykey;
import ecomm_genericutility_webaction.ExcelUtility;
import ecomm_genericutility_webaction.Propertyutility;

public class InsertproductPage1 {
	WebDriver driver;
	String partialcommonXpath="//*[@name='%s']";    	
	@FindBy(xpath="//*[@name='submit']") public WebElement submit;
	@FindBy(xpath="//h3['Insert Product']") public WebElement test;
	
	public WebElement referance(String partialXpath,String replaceData)
	{
		String finalXpath = String.format(partialXpath,replaceData);
		return driver.findElement(By.xpath(finalXpath));
	}
	
	//***********constructor*****************
	public InsertproductPage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//******************* DropDown In Insert Product ************************
	public void dropdownhandle(String toLocateXpath,String visibleText)
	{ 
		WebElement ele = referance(partialcommonXpath, toLocateXpath);
		Select sel=new Select(ele);
		sel.selectByVisibleText(visibleText);
	}
	
	//******************* TextFields In Insert Product ************************
	public void insertProduct(Map<String, String> map1, Propertyutility pu)
	{
		for(Entry<String, String> m:map1.entrySet())
    {
			referance(partialcommonXpath,m.getKey()).sendKeys(m.getValue()); 
    }

		InsertproductPage1 ip = new InsertproductPage1(driver);
		ExcelUtility xlu = new ExcelUtility(FrameworkContants1.TEST_EXCEL_FILE_PATH);
		Map<String, String> map = xlu.getData(Excelsheet.CONTACTS.getSheetName(),Excelsheet.CREATEPRODUCT.getSheetName());
		ip.dropdownhandle("category", map.get("category"));
		ip.dropdownhandle("subcategory",map.get("subcategory"));
		ip.dropdownhandle("productAvailability", map.get("productAvailability"));
		uploadFile("productimage1", pu.getPropertyData(Propertykey.FILE));
		uploadFile("productimage2", pu.getPropertyData(Propertykey.FILE));
		uploadFile("productimage3", pu.getPropertyData(Propertykey.FILE));
		submit.click();
	}
	
	//********************* Upload File *****************************
	private void uploadFile(String toLocateXpath,String fileToPass)
	{
		referance(partialcommonXpath,toLocateXpath).sendKeys(fileToPass);
	}
    
	public String pageVerification()
	{
		return test.getText();
	}

}

