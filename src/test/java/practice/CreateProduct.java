

package practice;

import java.util.Map;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import ecommerce_baseclass.configurationpage;

/**
 * This  test class will create The product
 * 
 * @author dunu2
 *
 */
public class CreateProduct extends configurationpage{

/*	@ReportAnnotation(author = "Aswini",categories = "Smoke")
	@Test(groups = "major")
	public void createProductTest()  {
		
		//TestData
		String testScriptName="CreateProduct";
		String sheetName=ExcelKey.ADMIN.getSheetName();
		Map<String, String> exceldata = excelUtility.getExcelData(sheetName, testScriptName);
		report.info(UtilityInstanceTransfer.getExtentTest(),"testscriptname="+testScriptName);
		report.info(UtilityInstanceTransfer.getExtentTest(),"testdata="+exceldata);
		String categoryName=exceldata.get("CategoryName")+randomNumber;
		String suBCategory=exceldata.get("SubcategoryName")+randomNumber;
		String desc=exceldata.get("Description")+randomNumber;
		String productName=excelUtility.getExcelData(sheetName,testScriptName,"ProductName")+randomNumber;
		String productAvailability=excelUtility.getExcelData(sheetName,testScriptName,"Availability");
		String adminUrl=propertyUtility.getPropertyData(PropertyKey.AURL);
		String username=javaUtility.decode(propertyUtility.getPropertyData(PropertyKey.AUSERNAME));
		String password=javaUtility.decode(propertyUtility.getPropertyData(PropertyKey.APASSWORD));
		report.info(UtilityInstanceTransfer.getExtentTest(), "categoryName="+categoryName);
		report.info(UtilityInstanceTransfer.getExtentTest(),"testScriptName="+ testScriptName);
		report.info(UtilityInstanceTransfer.getExtentTest(),"suBCategory="+ suBCategory);
		report.info(UtilityInstanceTransfer.getExtentTest(), "desc="+desc);
		report.info(UtilityInstanceTransfer.getExtentTest(), "productName="+productName);
		report.info(UtilityInstanceTransfer.getExtentTest(), "adminUrl="+adminUrl);
				
		
		AdminLoginPage loginPage=new AdminLoginPage(driver);
		CommonPage commonpage=new CommonPage(driver);
		CreateCategoryPage createCategoryPage=new CreateCategoryPage(driver);
		SubCategoryPage subCategoryPage=new SubCategoryPage(driver);
		InsertProductPage insertProductPage=new InsertProductPage(driver);
		ManageProductPage manageProductPage=new ManageProductPage(driver);
        SoftAssert soft=new SoftAssert();
        
		//Launching the application
		webdriverutility.enterUrl(driver, adminUrl);
		report.info(UtilityInstanceTransfer.getExtentTest(), "Application launched successfully");
		loginPage.setLogin(username, password);
		report.info(UtilityInstanceTransfer.getExtentTest(), "Admin Login successfull ");
		
		commonpage.clickTab(TabNames.CREATECATEGORY);
		report.info(UtilityInstanceTransfer.getExtentTest(), "Create category Clicked successfully");
		String actTitle=webdriverutility.getWindowtitle();
		String expTitle="Category";
		//verificationUtility.partialVerify(actTitle, expTitle,"page");
		soft.assertTrue(actTitle.contains(expTitle),expTitle+ "is not showing");
        
		//Creating Category with description
		createCategoryPage.createCategory(categoryName,desc);
		report.info(UtilityInstanceTransfer.getExtentTest(), "category created Successfully");
		wait.explicitWaitPresentOfElementLocated(driver, By.xpath("//strong[text()='Well done!']"));
		
		
		commonpage.clickTab(TabNames.SUBCATEGORY);
		report.info(UtilityInstanceTransfer.getExtentTest(), "Subcategory Tab clicked successfully");
		actTitle= webdriverutility.getWindowtitle();
		expTitle="SubCategory";
		//verificationUtility.partialVerify(actTitle, expTitle,"page");
		soft.assertTrue(actTitle.contains(expTitle),expTitle+ "is not showing");
		//Creating Subcategory
		subCategoryPage.createSubCategory(selectUtility,categoryName,suBCategory);
		wait.explicitWaitPresentOfElementLocated(driver, By.xpath("//strong[text()='Well done!']"));
		report.info(UtilityInstanceTransfer.getExtentTest(), "Subcategory created successfully");
		
		commonpage.clickTab(TabNames.INSERTPRODUCT);
		report.info(UtilityInstanceTransfer.getExtentTest(), "InsertProduct tab clicked successfully");
		actTitle=webdriverutility.getWindowtitle();
		expTitle="Insert Product";
		//verificationUtility.partialVerify(actTitle, expTitle, "Page");
		soft.assertTrue(actTitle.contains(expTitle),expTitle+ "is not showing");
		//Inserting the product
		Map<String, String> exceldata2 = excelUtility.getExcelData("Sheet1", testScriptName);
		insertProductPage.createProduct(selectUtility,categoryName,suBCategory,exceldata2,productAvailability,popup,randomNumber);
		wait.explicitWaitPresentOfElementLocated(driver, By.xpath("//strong[text()='Well done!']"));
		report.info(UtilityInstanceTransfer.getExtentTest(), "product Inserted successfully");
		
		commonpage.clickTab(TabNames.MANAGEPRODUCTS);
		actTitle=webdriverutility.getWindowtitle();
		expTitle="Manage Products";
		//verificationUtility.exactVerify(actTitle, expTitle, "page");
		soft.assertTrue(actTitle.contains(expTitle),expTitle+ "is not showing");
		
		//Verification of the created Product
		boolean result=manageProductPage.productCheck(javaUtility,"Product Name", productName);
		if(result) {
			javaUtility.consolePrint(productName+" is showing in the product list page");
			report.info(UtilityInstanceTransfer.getExtentTest(), productName+" is showing in the product list page");
		}	else {
			javaUtility.consolePrint(productName+" is not showing in the product list page");
			report.info(UtilityInstanceTransfer.getExtentTest(),productName+" is not showing in the product list page");
		}
		commonpage.logout();
		report.info(UtilityInstanceTransfer.getExtentTest(), "Admin logged out succesfully");
		//writing random number in the excel
		excelUtility.setExcelData("ManageProduct",ExcelKey.ADMIN.getSheetName(),"ProductName",productName);
		excelUtility.setExcelData("DeleteProduct",ExcelKey.ADMIN.getSheetName(),"ProductName",productName);
		excelUtility.setExcelData("WishList_MyCart",ExcelKey.USER.getSheetName(),"ProductName",productName);
		excelUtility.saveExcel();
		
	}*/
}
