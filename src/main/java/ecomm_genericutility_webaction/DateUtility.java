package ecomm_genericutility_webaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility
{
/**
 * 	This method is used to fetch the current date 
 * @return
 */
public static String getcurrentDate()
{
	SimpleDateFormat sdf = new SimpleDateFormat("dd_MMM_yyyy_HH_mm_ss");
	String date = sdf.format(new Date());
	return date;
}
/**
 * This method is also used to fetch the current date 
 */
public static void getTodayDateByCalInstance()
{
	SimpleDateFormat sdf = new SimpleDateFormat("dd_MMM_yyyy");
	Calendar cal = Calendar.getInstance();
    String date = sdf.format(cal.getTime());
    System.out.println(date);
}
/**
 * This method is used to fetch required date from given date by adding or substarcting to it 
 * @param givendate
 * @param daysToBeSuborAdd
 * @throws ParseException
 */
public static void getPreviusDateByCalendarInstance(String givendate,int daysToBeSuborAdd) throws ParseException 
{
   SimpleDateFormat sdf = new SimpleDateFormat("dd_MMM_yyyy");
   Calendar cal = Calendar.getInstance();
    cal.setTime(sdf.parse(givendate));
   cal.add(Calendar.DAY_OF_MONTH,daysToBeSuborAdd );
   String date = sdf.format(cal.getTime());
   System.out.println(date);
}
/**
 * This method is used to fetch required date by adding or substarcting to it 
 * @param noofDaysAddorSubDate
 */
public void subOrAddinTodayDate(int noofDaysAddorSubDate)
{
	SimpleDateFormat sdf = new SimpleDateFormat("dd_MMM_yyyy");
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DAY_OF_MONTH,noofDaysAddorSubDate );
    String date1 = sdf.format(cal.getTime());
	System.out.println(date1);
}
}
