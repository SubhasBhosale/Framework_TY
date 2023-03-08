package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchingtheexacttablefromexcelsheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	DataFormatter df = new DataFormatter();
	FileInputStream fis = new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");
	Workbook wf =WorkbookFactory.create(fis);
	Sheet sheet = wf.getSheet("sheet");
	   int size = sheet.getLastRowNum();
	   for (int i = 0; i < size; i++) {
    	   //actually all second column values it will fetch
		  short lastcolumn = sheet.getRow(i).getLastCellNum();
    	  for (int j = 0; j < lastcolumn; j++)
    	  {
			String result = df.formatCellValue(sheet.getRow(i).getCell(j));
		     System.out.print(result+" ");
    	  }
    	  System.out.println();
          }
}
}
