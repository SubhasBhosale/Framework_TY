package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import Annotation.Report;
import ecomm_genericutility_webaction.selenium_utility;
import ecommerce_baseclass.configurationPracticepage;
import ecommerce_baseclass.configurationpage;


public class CrossBrowserParallelExecution1 extends configurationPracticepage{            
	
	@Report(author = "abc",category = "regression")
	@Test
	public void chrome()
	{
		su.launchApplicationGet("http://rmgtestingserver/domain/");
	}
	
	
	
}
