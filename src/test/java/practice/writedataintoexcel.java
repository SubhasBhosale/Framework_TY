package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writedataintoexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");
		Workbook wf =WorkbookFactory.create(fis);
		Sheet sheet = wf.getSheet("write_data");
		Row row = sheet.getRow(1);
		Cell cell = row.createCell(1);     //delete the data from cell and write the data into cell
		cell.setCellValue("sdet");
		FileOutputStream fos = new FileOutputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");
		wf.write(fos);
		wf.close();
		fis.close();
//we can't write the into empty excel sheet it'll throw null pointer exception 
//so that's y we have to do something in excel sheet like making table ,or highlitgh border
	}

}
