package practice;
import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class craete_projectin_testyantra {

	public static void main(String[] args) throws InterruptedException
	{
		String P4="selenium3941";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("http://rmgtestingserver:8084/");	
	   driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
	   driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
	 //button[text()='Sign in']
	   driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	   driver.findElement(By.xpath("//a[.='Projects']")).click();
	   driver.findElement(By.xpath("//span[.='Create Project']")).click();
	   driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("selenium3941");
	   driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("shubham");
	   WebElement Q1 = driver.findElement(By.xpath("//input[@name='createdBy']/../following-sibling::div/select[@name='status']"));
	   Select sel=new Select(Q1);
	   sel.selectByVisibleText("Completed");
	   driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
       List<WebElement> P1 = driver.findElements(By.xpath("//table[@class='table table-striped table-hover']//td[2]"));
          for(WebElement P2:P1)
          {
        	  String P3 = P2.getText();
        	  if(P4.equals(P3))
        	  {
        		  System.out.println("project name is created in UI");
        	  }
          }
	}
	}
	


