package practice;

import java.util.Base64;

import ecomm_genericutility_webaction.JavaUtility;

public class EncrypeandDycript {
 public static void main(String[] args) {
	/*String encryptData = "YWRtaW4=";
	byte[] byteA = encryptData.getBytes();
	
byte[] byteB = Base64.getDecoder().decode(byteA);
	String s=new String(byteA);
	System.out.println(s);*/
	 
	// String a="[B@53bd815b";
  //System.out.println(Base64.getEncoder().encode(a.getBytes()));
//	System.out.println(Base64.getDecoder().decode(a.getBytes()));
    //System.out.println(S);
	JavaUtility ju = new JavaUtility();
	System.out.println(ju.getCurrentDateTime());
}
}
