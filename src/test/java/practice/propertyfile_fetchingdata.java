package practice;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyfile_fetchingdata
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/common_data/proprtyfile.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String user = prop.getProperty("user");
		String pwd = prop.getProperty("password");
		System.out.println(user+" "+pwd);
		prop.clear();
		fis.close();
	}
}
