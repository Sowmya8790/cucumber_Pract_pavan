package StepDefinitions;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;



import PageObjects.AddCustPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustPage;

public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public AddCustPage addcust;
	public SearchCustPage serachpage;
	public static Logger logger;
	public Properties configprop;
	//public  ExtentReports report;
	//public  ExtentTest test;
	
	public static String randomstring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
	}

	
}
