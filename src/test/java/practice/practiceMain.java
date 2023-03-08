package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import ecomm_flashcart_enum.Propertykey;
import ecommerce_baseclass.configurationpage;
import ecommerce_flashcart_objectrepository.CreatecategoryPage;
import ecommerce_flashcart_objectrepository.InsertproductPage1;
import ecommerce_flashcart_objectrepository.SubcategoryPage;

public class practiceMain {
	public String getporpertydata(String datatodetch) throws IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/common_data/runner/demo.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String testdata = prop.getProperty(datatodetch);
		return testdata;
	}
	/**
	 * excelfilepath  ,  sheetname    ,    datatopass
	 * @param excelfilepath
	 * @param sheetname
	 * @param datatopass
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeIntoExcel(String excelfilepath,String sheetname,String datatopass,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelfilepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		FileOutputStream fos = new FileOutputStream(excelfilepath);
		Cell cel = row.createCell(cellnum);
		cel.setCellValue(datatopass);
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();
	}
	/**
	 * String excelfilepath,String sheetname,String exptc,String expkey
	 * @param excelfilepath
	 * @param sheetname
	 * @param exptc
	 * @param expkey
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getdatafromexcelbasedonkey(String excelfilepath,String sheetname,String exptc,String expkey) throws EncryptedDocumentException, IOException
	{
		String value="";
		FileInputStream fis = new FileInputStream(excelfilepath);
		Workbook wb = WorkbookFactory.create(fis);
		DataFormatter df = new DataFormatter();
		Sheet sheet = wb.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		for(int i=0;i<rowcount;i++)
		{
			 String tc =df.formatCellValue(sheet.getRow(i).getCell(0));
			 if(tc.equals(exptc))
			 {
				int ceelcount = sheet.getRow(i).getLastCellNum();
				for(int j=1;j<ceelcount;j++)
				{
					String key = df.formatCellValue(sheet.getRow(i).getCell(j));
					if(expkey.equals(key))
					{
						 value=df.formatCellValue(sheet.getRow(i+1).getCell(j));
						break;
					}
				}
			 }
		}
		wb.close();
		fis.close();
	    return value;
	}
	public String getdatamultikey(String excelfilepath,String sheetname,String exptc,String expkey) throws EncryptedDocumentException, IOException
	{
		String value="";
		Map<String,String> map = new HashedMap< >();
		FileInputStream fis = new FileInputStream(excelfilepath);
		Workbook wb = WorkbookFactory.create(fis);
		DataFormatter df = new DataFormatter();
		Sheet sheet = wb.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		for(int i=0;i<rowcount;i++)
		{
			 String tc =df.formatCellValue(sheet.getRow(i).getCell(0));
			 if(tc.equals(exptc))
			 {
				int ceelcount = sheet.getRow(i).getLastCellNum();
				for(int j=1;j<ceelcount;j++)
				{
					String key = df.formatCellValue(sheet.getRow(i).getCell(j));
					if(expkey.equals(key))
					{
					 value=df.formatCellValue(sheet.getRow(i+1).getCell(j));
					 break;
				    }
				}
				break;
			 }
		}
		wb.close();
		fis.close();
	    return value;
	}
}
