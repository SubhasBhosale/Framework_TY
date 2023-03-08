package practice;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class parsecalendar {

	public static void main(String[] args)
	{
		/*String cur_mon = "Mar";
		int cur_mon_num = DateTimeFormatter.ofPattern("MMM")  //jan-1,feb-2,mar-3(as i mentioned only 3 letter Mar so we have to add MMM as a condition )
				.withLocale(Locale.ENGLISH)
				.parse(cur_mon)
				.get(ChronoField.MONTH_OF_YEAR);   // it will convert month into no
		System.out.println(cur_mon_num);*/
		
	    String cur_mon = "March";
		int cur_mon_num = DateTimeFormatter.ofPattern("MMMM")  
				.withLocale(Locale.ENGLISH)
				.parse(cur_mon)
				.get(ChronoField.MONTH_OF_YEAR);   
		System.out.println(cur_mon_num);
	}

}
