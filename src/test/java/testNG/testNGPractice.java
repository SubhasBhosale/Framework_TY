package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNGPractice {
	
@Test(dataProvider = "data")
public void test2(String a)      //this method will run and 
                                 //take String parameter from dataprovider in the form of string
{
	System.out.println(a);
}


@DataProvider
public String[] data()      //we create a array      
{
	String[] arr=new String[3];
	arr[0]="Banglore";
	arr[1]="Mumbai";
	arr[2]="Delhi";
	return arr;
}
}
