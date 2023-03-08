package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

public class propertyfile_insertingdata
{

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("./src/test/resources/common_data/data.properties");
		
         Properties prop = new Properties();
          
          prop.setProperty("url", "https://wwww.google.com");  //to write the data into file
          
          prop.store(fos,"");   //to give comment 
          
          fos.close();
              		
	}
	}
