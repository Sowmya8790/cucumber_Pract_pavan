package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_pract {

	WebDriver driver;
	
	public Login_page_pract(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='Email']")
	@CacheLookup
	WebElement user;
	
	@FindBy(css= "input#Password")
	@CacheLookup
	WebElement pass;
	
	@FindBy(id = "Login")
	WebElement loginbutton;
	
	//Action metods
	
	public void user_m(String username) {
		user.clear();
		user.sendKeys(username);
	}
	
	public void pass_m(String password) {
		pass.clear();
		pass.sendKeys(password);
	}
	
	public void login_m() {
		
		loginbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
