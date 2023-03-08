package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class fileinputdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fos=new FileOutputStream("./src/test/resources/common_data/demo.properyfile",true);
Properties prop=new Properties();
prop.setProperty("url","http://loaclhost:8888");
prop.store(fos,"url added");
fos.close();
	prop.clear();


	}

}
