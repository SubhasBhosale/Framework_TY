package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchdatafromexcelsheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");
		Workbook wf =WorkbookFactory.create(fis);
		Sheet sheet = wf.getSheet("sheet");
		Row row = sheet.getRow(2);
              Cell cell = row.getCell(1);
             
              //1st method 
              String result = cell.getStringCellValue();
             System.out.println(result);
           
             //2nd method
             String output = df.formatCellValue(cell);
            System.out.println(output);
            wf.close();
            fis.close();
	}

}
