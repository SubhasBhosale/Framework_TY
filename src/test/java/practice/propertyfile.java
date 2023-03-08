package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/common_data/demo.properties");
		//fetch the data from property file
		Properties prop = new Properties();
		//load onto prop from fis
		prop.load(fis);
		String pwd = prop.getProperty("username");
		System.out.println(pwd);
		// step5 ==>> close the stream
		fis.close();
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		prop.clear();
		String timeout = prop.getProperty("timeout");
		System.out.println(timeout);
	}

}
