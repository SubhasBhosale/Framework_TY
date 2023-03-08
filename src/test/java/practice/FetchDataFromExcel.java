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

public class FetchDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		//dataformater will give all string,number,null as it is as result
		DataFormatter df = new DataFormatter();
		//convert excel into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");
		//open the workbook 
		Workbook wb = WorkbookFactory.create(fis);
		//get into particular sheet
		Sheet sheet = wb.getSheet("sheet");
		//get into particular row
		Row row = sheet.getRow(1);
		//get into particular cell
		Cell cell = row.getCell(1);
		//get the cell value
		String result = cell.getStringCellValue();
		System.out.println(result);
	int rowcount = sheet.getLastRowNum();          //index
		short cellcount = sheet.getRow(1).getLastCellNum();      //count //actual data not index v.v.v impo
		System.out.println(cellcount);

		for (int i = 1; i <= rowcount; i++) {
			short last_cell_count = sheet.getRow(i).getLastCellNum();
			for (int j = 0; j < cellcount; j++) {
				String value = df.formatCellValue(sheet.getRow(i).getCell(j));//whenever we are fetching multiple data we have to use dataformater	
				System.out.println(value);
			}  
		}
	}
}//data fromatter only for cell not for row
