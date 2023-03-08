package practice;

import java.sql.DriverManager;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ecomm_genericutility_webaction.selenium_utility;

public class rmgservercalendar {
	public static void main(String[] args) throws InterruptedException {
		String reqMonth="April";    	String reqYear="2020";    String	reqDate="15";
		int reqMonthNum = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(reqMonth).get(ChronoField.MONTH_OF_YEAR);
		int reqYearNum = Integer.parseInt(reqYear);                //.......??????
		selenium_utility su = new selenium_utility();
		WebDriver driver = su.launchBrowser("chrome");
		WebDriverWait wt=new WebDriverWait(driver, 10);
		su.launchApplicationGet("http://rmgtestingserver:8888/index.php?action=index&module=Home");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//img[@title='Open Calendar...']")).click();
		WebElement ele1 = driver.findElement(By.xpath("//img[@title='Open Calendar...']"));
		wt.until(ExpectedConditions.visibilityOf(ele1));
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//b[.='February 2023']"));
		String curMonth_Year = ele.getText();                               System.out.println(curMonth_Year);
		String currentMonth = curMonth_Year.split(" ")[0];                  System.out.println(currentMonth);
		String currentYear = curMonth_Year.split(" ")[1];                   System.out.println(currentYear);
	    int CurrentMonthToNumber = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(currentMonth).get(ChronoField.MONTH_OF_YEAR);
		System.out.println(CurrentMonthToNumber);
		int curYearNum = Integer.parseInt(currentYear);
		while(reqMonthNum<CurrentMonthToNumber || reqYearNum<curYearNum)                                //comparison among no's 
		{
			driver.findElement(By.xpath("//img[@src='themes/images/small_left.gif']")).click();
			wt.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//td[@class='calHdr']/a/b"),curMonth_Year));
			curMonth_Year=driver.findElement(By.xpath("//td[@class='calHdr']/a/b")).getText();
			System.out.println(curMonth_Year);			
			currentMonth=curMonth_Year.split(" ")[0];
			currentYear=curMonth_Year.split(" ")[1];
			DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(currentMonth).get(ChronoField.MONTH_OF_YEAR);
			curYearNum=Integer.parseInt(currentYear);
		}//until this the the date in the calendar has been changed 
		driver.findElement(By.xpath("//a[.='"+reqDate+"']"));                                                      //click on date 
		driver.quit();
	}}
