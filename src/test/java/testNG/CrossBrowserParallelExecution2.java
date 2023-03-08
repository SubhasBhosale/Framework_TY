package testNG;

import org.testng.annotations.Test;

import Annotation.Report;
import ecommerce_baseclass.configurationPracticepage;
import ecommerce_baseclass.configurationpage;

public class CrossBrowserParallelExecution2 extends configurationPracticepage{
	
	@Report(author = "abc",category = "regression")
	@Test
	public void chrome()
	{
		su.launchApplicationGet("http://rmgtestingserver/domain/Online_Shopping_Application/admin/");
	}

}
