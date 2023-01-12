package StepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import PageObjects.AddCustPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps extends BaseClass
{
	@Before
	public void Setup() throws IOException {
		
		//Reading the property file
		configprop=new Properties();
		FileInputStream configpropfile = new FileInputStream("config.properties"); //give location of file
		configprop.load(configpropfile);
		
		
		logger = Logger.getLogger("nopComemrce"); // added logger
		PropertyConfigurator.configure("C:\\Users\\vsowmyasri\\eclipse-workspace\\cucumber\\Log4j.properties");//Have to give the location of Log4j property file // added logger
		
		String br = configprop.getProperty("browser");
		
		if(br.equals("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", configprop.getProperty("chromepath"));
		driver = new ChromeDriver();
		}
		
		else if(br.equals("firefox")) {
			
			System.setProperty("webdriver.chrome.driver", configprop.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
			
		}
		
		else {
			System.setProperty("webdriver.chrome.driver", configprop.getProperty("iepath"));
			driver = new InternetExplorerDriver();
			
			
		}
		
		logger.info("********Launching Browser **********");
		
	}

	@Given("- Launch the browser")
	public void launch_the_browser() {
		
		lp = new LoginPage(driver);
	}

	@When("- User launch the URL -{string}")
	public void user_launch_the_URL(String string) {
	    
		logger.info("********Launching url **********");
		driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@And("- user should give email as {string} and password as {string}")
	public void user_should_give_email_as_and_password_as(String string, String string2) {
		logger.info("********Set Credentials**********");
	  lp.SetUsername(string);
	  lp.Setpassword(string2);
	}

	@And("- user should click on login")
	public void user_should_click_on_login() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("********Login**********");
	   lp.login();
	}

	@Then("- Page Title should be {string}")
	public void page_Title_should_be(String title) throws InterruptedException {
	    Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			logger.info("********Login Success**********");
			driver.close();
			Assert.assertTrue(false);
		}else {
			logger.info("********Login failure**********");
			Assert.assertEquals(title, driver.getTitle());
		}
		
	}

	@When("- User click on logout link")
	public void user_click_on_logout_link() {
		logger.info("********Logout**********");
	    lp.logout();
	}

	@And("Page title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
	   
		logger.info("********the title of the page should dispplay**********");
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, driver.getTitle());
		Thread.sleep(3000);
	}

	@And("- I close the the browser")
	public void i_close_the_the_browser() {
		logger.info("********closing the browser**********");
	    driver.close();
	}
	
	//___________________Add steps definition dfor addcustpage

	@Then("User can view Dashboard")
	public void user_can_view_Dashboard() {
	    
		logger.info("********User can view dash board**********");
		addcust= new AddCustPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addcust.gettitles());
	}

	@When("User click on customers men")
	public void user_click_on_customers_men() throws InterruptedException {
		logger.info("********click on customers**********");
		Thread.sleep(3000);
	//	addcust.dthreeselect();
		addcust = new AddCustPage(driver);
		addcust.custmen();
	}

	@And("click on customers meny iteam")
	public void click_on_customers_meny_iteam() throws InterruptedException {
		
		logger.info("********click on cust role**********");
		Thread.sleep(3000);
	   addcust.custrole();
	 
	}

	@And("click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException {
		
		logger.info("********click on add new button**********");
		  Thread.sleep(3000);
	   addcust.addnew();
	   Thread.sleep(3000);
	}

	@Then("User can view add new customer page")
	public void user_can_view_add_new_customer_page() {
	    Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.gettitles());
	}

	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		logger.info("********Register**********");
		
	    String mail = randomstring() + "@gmail.com";
	    addcust.email(mail);
	    addcust.password("Test@123");
	    addcust.fullname("Sowmya");
	    addcust.lastname("Sri");
	    addcust.gender("male");
	    addcust.dob("10/14/2000");
	    addcust.comapny("technology");
	  //  addcust.Newsletter("breaking news");
	  //  addcust.Customerrole("Administration");
	    Thread.sleep(3000);
	    addcust.vender("Vendor 1");
	    addcust.comment("good Day");
	}

	@And("click on save button")
	public void click_on_save_button() throws InterruptedException {
		
		logger.info("********save the credentials**********");
	   addcust.save();
	   Thread.sleep(2000);
	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		
		logger.info("********Page title should display**********");
	    Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
	    				.contains("The new customer has been added successfully."));
	}
 // steps for searching a customer using page objet.



	@And("Enter customer Email")
	public void enter_customer_Email() {
		
		logger.info("********enter cust email**********");
		serachpage= new SearchCustPage(driver);
		serachpage.setemail("abcdaaw@gmail.com");
	}

	@And("click on search button")
	public void click_on_search_button() throws InterruptedException {
		logger.info("********click on search**********");
		serachpage.searchbutton();
		Thread.sleep(3000);
	}

	@Then("User should found email in search table")
	public void user_should_found_email_in_search_table() {
		logger.info("********check wheather the email displaying or not**********");
		boolean status=serachpage.checkmail("abcdaaw@gmail.com");
		Assert.assertTrue(status);
	}
	
	@When("Enter customer First name")
	public void enter_customer_First_name() {
		
		logger.info("********give first name**********");
		serachpage = new SearchCustPage(driver);
		serachpage.fname("Sowmya");
	}
	
	@When("Enter customer Last name")
	public void enter_customer_Last_name() {
		logger.info("********given lasts anem**********");
		serachpage.lname("Sri");
	    
	}

	@Then("User should found Name in the Search Table")
	public void user_should_found_Name_in_the_Search_Table() throws InterruptedException {
		
		logger.info("********search with user name**********");
		Thread.sleep(3000);
		boolean status=serachpage.namescheck("Sowmya Sri");
		Assert.assertEquals(true, status);
		
	}

}
