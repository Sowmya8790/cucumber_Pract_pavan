package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//we have 3 elemmts in login page user pass and login 
	
	@FindBy(xpath ="//input[@id='Email']")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath = "//input[@class='password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//div[@class='buttons']/button")
	@CacheLookup
	WebElement login;
	
	@FindBy(xpath = "//li[@class='nav-item']/a[text()='Logout']")
	@CacheLookup
	WebElement logout;
	
	public void SetUsername(String uname) {
		username.clear();
		username.sendKeys(uname);

	}
	
	public void Setpassword(String upass) {
		password.clear();
		password.sendKeys(upass);
	}
	
	public void login() {
		login.click();
	}
	
	public void logout() {
		logout.click();
	}

}
