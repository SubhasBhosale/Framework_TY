package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.DateFormatter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

import Constants.FrameworkContants1;
import ecomm_genericutility_webaction.JavaUtility;
import ecomm_genericutility_webaction.selenium_utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class practice2 {
	public static void main(String[] args) throws IOException {
 		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Subhas%20bhosale/OneDrive/Desktop/selenium%20files/dropdown.html");
		 WebElement ele = driver.findElement(By.xpath("//select[@id='iyengar']"));  
		 ele.click();
		 List<String> al = new ArrayList<>();
		
		               Select sel = new Select(ele);
		               List<WebElement> option = sel.getOptions();
		               for(WebElement z:option)
		               {
		            	   System.out.println(al.add(z.getText()));
		            	   
		               }

	/*	String t="remote";
		String d="mnc";
		driver.findElement(By.xpath("//span[.='Remote']")).click();
		driver.findElement(By.xpath("//span[.='MNC']")).click();
		
		Set<String> result = driver.getWindowHandles();
		for(String z:result)
		{
			driver.switchTo().window(z);
			String title = driver.getCurrentUrl();
			System.out.println(title);
			if(title.contains(t))
			{
				driver.close();
			}
			if(title.contains(d))
			{
				driver.close();
			}*/
			
		}		
}
//TestCase
/*String exptc="TestCase";
		String expkey="hello1";
		FileInputStream fis = new FileInputStream("./src/test/resources/practice_excel/Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		DataFormatter df = new DataFormatter();
		Sheet sheet = wb.getSheet("sheet");
		int rowcount = sheet.getLastRowNum();
		for(int i=0;i<rowcount;i++)
		{
			 String tc =df.formatCellValue(sheet.getRow(i).getCell(0));
			 if(exptc.equals("TestCase"))
			 {
				int ceelcount = sheet.getRow(i).getLastCellNum();
				for(int j=1;j<ceelcount;j++)
				{
					String key = df.formatCellValue(sheet.getRow(i).getCell(j));
					if(expkey.equals(key))
					{
						System.out.print(df.formatCellValue(sheet.getRow(i+1).getCell(j)));
						break;
					}
				}
			 }
		}
		wb.close();
		fis.close();*/









/*
 * 
Object p = pr1.getporpertydata("browser");
System.out.println(p);*/