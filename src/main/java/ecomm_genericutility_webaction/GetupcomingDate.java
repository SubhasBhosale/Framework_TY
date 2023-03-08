package ecomm_genericutility_webaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetupcomingDate {
public static void main(String[] args) throws ParseException {
	String dateString = "13_Mar_2023";
	SimpleDateFormat sdf = new SimpleDateFormat("dd_MMM_yyyy");
      Calendar cal = Calendar.getInstance();
      cal.setTime(sdf.parse(dateString));
      cal.add(Calendar.DAY_OF_MONTH, 10);
     String date = sdf.format(cal.getTime());
     System.out.println(date);
}
}
