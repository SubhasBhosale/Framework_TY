package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchdatafromsinglecolumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		DataFormatter df = new DataFormatter(); // data provider is to fetch the value
		FileInputStream fis = new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");
		Workbook wf =WorkbookFactory.create(fis);
		Sheet sheet = wf.getSheet("sheet");
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i < lastrow; i++) 
		{
			System.out.println(df.formatCellValue(sheet.getRow(i).getCell(1)));
		}
	}

}
