		package StepDefinitions;
		
		import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login_page_pract;
import cucumber.api.java.en.And;
		import cucumber.api.java.en.Given;
		import cucumber.api.java.en.Then;
		import cucumber.api.java.en.When;

		
		public class LoginSteps_pract {
		WebDriver driver;
		Login_page_pract lpp;
		
		@Given("- Launch the Browser")
		public void launch_the_Browser() {
		    driver = new ChromeDriver();
		
		}
		
		@When("- Access the URL {string}")
		public void access_the_URL(String string) {
		  driver.get("https://admin-demo.nopcommerce.com/login");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		}
		
		@And("- Enter the Username {string}")
		public void enter_the_Username(String userr) {
			lpp = new Login_page_pract(driver);
			lpp.user_m(userr);
		}
		
		@And("- Enter the Password {string}")
		public void enter_the_Password(String pass) {
			lpp.user_m(pass);
		}
		
		@Then("- Click on the Login Button")
		public void click_on_the_Login_Button() {
		    lpp.login_m();
		}
		
		
		@And("- Check the title of the Page {string}")
		public void check_the_title_of_the_Page(String string) {
		    
			String Exp_tile =string;
			String Actual_titke = driver.getTitle();
			
			Assert.assertEquals(Exp_tile, Actual_titke);
			
			
		}
		
		
		}
