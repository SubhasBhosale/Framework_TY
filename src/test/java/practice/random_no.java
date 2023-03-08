package practice;

import com.github.javafaker.Faker;

public class random_no {


	public static void main(String[] args) {
	     long ran = new  Faker().number().randomNumber(3,false);
	     System.out.println(ran);

	}

}
