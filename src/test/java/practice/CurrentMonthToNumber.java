package practice;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class CurrentMonthToNumber {
public static void main(String[] args) {
	int curMonthNum = DateTimeFormatter.ofPattern("MMMM")
	.withLocale(Locale.ENGLISH)
	.parse("March")
	.get(ChronoField.MONTH_OF_YEAR);
	//Object curYearNum = Integer.parseInt(2023);
	
	System.out.println(curMonthNum);
	
}
}
