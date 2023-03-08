package ecommerce_flashcart_admin;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Constants.FrameworkContants1;
import ecomm_flashcart_enum.Excelsheet;
import ecomm_flashcart_enum.Propertykey;
import ecomm_flashcart_enum.TabNamesAdmin;
import ecomm_genericutility_webaction.ExcelUtility;
import ecomm_genericutility_webaction.Propertyutility;
import ecomm_genericutility_webaction.dropDownUtility;
import ecomm_genericutility_webaction.selenium_utility;
import ecomm_genericutility_webaction.verification_utility;
import ecommerce_baseclass.configurationpage;
import ecommerce_flashcart_objectrepository.Commonpage_admin;
import ecommerce_flashcart_objectrepository.CreatecategoryPage;
import ecommerce_flashcart_objectrepository.InsertproductPage1;
import ecommerce_flashcart_objectrepository.SubcategoryPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import practice.insert_data_into_database;

public class Flashcart_Create_productTest extends configurationpage        //	PASS
{
	@Test
	public void maintest() throws InterruptedException, IOException
	{
		CreatecategoryPage ccp = new CreatecategoryPage(driver);
		SubcategoryPage	 scp = new SubcategoryPage(driver);
		InsertproductPage1 ip = new InsertproductPage1(driver);	
		su.launchApplicationGet(pu.getPropertyData(Propertykey.URLADMIN));
		lap.loginAction(pu.getPropertyData(Propertykey.ADMINUN), pu.getPropertyData(Propertykey.ADMINPWD));
		cpa.clickTab(TabNamesAdmin.CREATECATEGORY);
		sa.assertEquals(ccp.pageVerification(), "Category");
		Map<String, String> map = xlu.getData(Excelsheet.CONTACTS.getSheetName(),Excelsheet.CREATEPRODUCT.getSheetName());
		String category_name = map.get("category");
		ccp.insertData(category_name, map.get("description"));
		sa.assertEquals(scp.pageVerification(), "Well done!");
		cpa.clickTab(TabNamesAdmin.SUBCATEGORY);
		String subcategory_name = map.get("subcategory");
		scp.createsubcategory(category_name, subcategory_name);
		cpa.clickTab(TabNamesAdmin.INSERTPRODUCT);
		Map<String, String> map1 = xlu.getData(Excelsheet.CONTACTS.getSheetName(),"insert product");
		sa.assertEquals(ip.pageVerification(),"Insert Product");
		ip.insertProduct(map1,pu);  
	}}
