package practice;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Random;

public class decode {

public static void main(String[] args) {
	String z="hello";
	byte[] encode = Base64.getEncoder().encode(z.getBytes());
	String a=new String(encode);
	System.out.println(a);
	
	
	String D="aGVsbG8=";
	byte[] decode = Base64.getDecoder().decode(D.getBytes());
	String s=new String(decode);
	System.out.println(s);
	
	String Q="aGVsbG8=";
	System.out.println(new String(Base64.getDecoder().decode(Q.getBytes())));
}
}
