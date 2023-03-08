package ecomm_genericutility_webaction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ecomm_flashcart_enum.Propertykey;

public class Propertyutility {
	private Properties prop;
	/**
	 * This constructor will initialize all the property file
	 * @param filepath
	 * @throws IOException
	 */
 public Propertyutility(String filepath) throws IOException
 {
	FileInputStream fis = new FileInputStream(filepath);
	 prop = new Properties();
	 prop.load(fis);
	 fis.close();
 }
 
 /**
  * this method is used to initialize property file
 * @throws IOException 
 * @deprecated new propertyUtility(String filePath)
  */
 @Deprecated
 public void initializePropertyFile(String filePath) throws IOException 
 {
	 FileInputStream fisProperty = new FileInputStream(filePath);
	 prop=new Properties();
	 prop.load(fisProperty);
	 fisProperty.close();
 }
 /**
  * This method is used to get the common data from property file
  * @param key
  * @return
  */
 public String getPropertyData(Propertykey key)
 {
	 String keystring = key.name().toLowerCase();
	 String value = prop.getProperty(keystring, "please give proper key'"+keystring+"'"); 
	 //it will display whichever the value inserted by the customer is wrong please add valid one
	 return value;
 }

public String getData(Propertykey overridereport) {
	// TODO Auto-generated method stub
	return null;
}
}
