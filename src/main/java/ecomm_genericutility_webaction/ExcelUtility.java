package ecomm_genericutility_webaction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	private DataFormatter df;
	private Workbook wb;
	/**
	 * here we initilize with filepath means when we create object for ExcelUtility during the test script
	 * at that time we have to give file path
	 * when the initialize method will run it will initiate fileinputstream and workbookfactory 
	 * even though fis is closed then also all the other methods will work like fetching data and all  
	 */
	public ExcelUtility(String filepath)   
	{
		try 
		{
			initialize(filepath);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 *  This method is used to fetch the data from the excelSheet in general 
	 *  This method is used to open the excel and closing of the excel sheet
	 * @param filepath
	 * @throws IOException
	 */
	private void initialize(String filepath) throws IOException 
	{
		df=new DataFormatter();
		FileInputStream fis = new FileInputStream(filepath);
		wb= WorkbookFactory.create(fis);
		fis.close();
		wb.close();
	}
	/**
	 * This method is used to fetch the data(value) based on the key from the excel sheet for an Expexcted Result
	 * @param sheetName
	 * @param exptestCaseName
	 * @return
	 */
	//*****************************SheetName****ExptestCaseName********************************
	public Map<String, String> getData(String sheetName,String exptestCaseName)
	{
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();                     //index(IMPORTANT)
		Map<String, String>map=new HashedMap<>();
		for(int i=0;i<=rowCount;i++)                              //iterate a row
		{
			String testScriptName = df.formatCellValue(sheet.getRow(i).getCell(0));
			if(testScriptName.equals(exptestCaseName))
			{
				for(int j=1;j<sheet.getRow(i).getLastCellNum();j++)  //iterate column.
				{
					String key=df.formatCellValue(sheet.getRow(i).getCell(j));
					String value=df.formatCellValue(sheet.getRow(i+1).getCell(j));
					map.put(key,value);
				}
				break;
			}
		}
		return map;
	}

	/**
	 *  This method is used to fetch the value from the excel sheet when we know the specific key,expectedCaseName,sheetName then we get a particular value
	 * @param sheetName
	 * @param exptestCaseName
	 * @param expectedkey
	 * @return
	 */
	//*****************************SheetName****ExptestCaseName****ExpectedKey*****************************
	public String getData(String sheetName,String exptestCaseName,String expectedkey)
	{
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();     //index(IMPORTANT)
		String value = "";
		int testScriptCounter = 0;
		int keyCounter = 0;
		for(int i=0;i<=rowCount;i++)       //iterate a row   //our row will start from 0 as we taken organization name
		{
			String testScriptName = df.formatCellValue(sheet.getRow(i).getCell(0));
			if(testScriptName.equals(exptestCaseName))
			{
				testScriptCounter++;
				for(int j=1;j<sheet.getRow(i).getLastCellNum();j++)  //iterate column //we starts checking key from 1st column
				{
					String key=df.formatCellValue(sheet.getRow(i).getCell(j));
					if(key.equalsIgnoreCase(expectedkey))
					{
						keyCounter++;
						value=df.formatCellValue(sheet.getRow(i+1).getCell(j));
						break;
					}
				}
				break;
			}
		}
		if(keyCounter==0)
		{
			if(testScriptCounter==0)
			{
				value="Please give proper testcaseName'"+exptestCaseName+"'";
			}
			else
			{
				value="Please give proper testScript key'"+expectedkey+"'";
			}
		}
		System.out.println("Value fetched from excel ==>"+value);
		return value;
	}

	/**
	 *  This method is used to fetch the data from the excel sheet for particular row and cell index
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 */
	//****************  GetData===>>>  SheetName****RowIndex****CellIndex    **************************
	public String getData(String sheetName,int rowIndex,int cellIndex)
	{
		return df.formatCellValue(wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex));
	}
	/**
	 *  This method is used to close the Workbook Factory
	 * @throws IOException
	 */
	//****************************Close DataBase Connection***********************
	public void close() throws IOException
	{
		wb.close();
	}
	/**
	 *  This method is used to insert in the excel sheet for particular row and cell index
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 */
	//****************InsertData===>>>  SheetName****RowIndex****CellIndex ***********************
	public void setData(String sheetName,int rowIndex,int cellIndex)
	{
		wb.getSheet(sheetName).getRow(rowIndex).createCell(cellIndex);
	}
	/**
	 * `This method is used to write the data in excelsheet
	 * @param FileOutputPath
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	//*************************Save Data**********************************
	public void saveData(String FileOutputPath) throws FileNotFoundException, IOException
	{
		wb.write(new FileOutputStream(FileOutputPath));
	}
	
	/**
	 * This method is used to store data in the two dimensional array format
	 * @param sheetName
	 * @return
	 */
    public String[][] getData(String sheetName)
    {
    	Sheet sheet = wb.getSheet(sheetName);
    	int rowCount = sheet.getLastRowNum();
    	String[][] arr=new String[rowCount][sheet.getRow(0).getLastCellNum()];
    	for(int i=1;i<=rowCount;i++)  //row(our real data will start from 2nd line,whose index is 1)
    	{
    		for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)       // it will give each row's last cell 
    		{
    			arr[i-1][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
    		}
    	}
    	return arr;
    }
}