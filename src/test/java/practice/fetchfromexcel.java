package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice;

public class fetchfromexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");
		//open the excel
		Workbook wf =WorkbookFactory.create(fis);
		Sheet sheet = wf.getSheet("sheet");
		int row_count = sheet.getLastRowNum();
		for (int i = 0; i < row_count; i++) 
		{
		     String key = df.formatCellValue(sheet.getRow(i).getCell(0));	
		     if(key.equals("indurty"))
		     {
		    	 for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
		    	 {
		    	String value = df.formatCellValue(sheet.getRow(i).getCell(1));
		    	System.out.println(value);
		    	 }
		     }
		}
	}

}
