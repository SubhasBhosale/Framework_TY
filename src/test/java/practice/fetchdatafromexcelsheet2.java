package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchdatafromexcelsheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");
		Workbook wf =WorkbookFactory.create(fis);
		Sheet sheet = wf.getSheet("sheet");
		Row row = sheet.getRow(2);
              Cell cell = row.getCell(1); 
           int size = sheet.getLastRowNum();
           
           for (int i = 0; i < size; i++) {
        	   //actually all second column values it will fetch
        	   String output = df.formatCellValue(sheet.getRow(i).getCell(1));
        	   System.out.println(output);
               }
           
	}

}
