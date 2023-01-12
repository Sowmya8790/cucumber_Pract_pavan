package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustPage {
	
	WebDriver ldriver;
	
	public AddCustPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);		
	}
	
	//another approch to write page object model
	
	By dashboard = By.xpath("//div[@class='content-header']/h1");
	By threeselect = By.xpath("//a[@class='nav-link']/i");
	
	By Customer = By.xpath("//a[@href='#']//*[contains(text(),'Customers')]");
	By CustomerMenu = By.xpath("//a[@href='/Admin/Customer/List']//*[contains(text(),' Customers')]");
	
	By addnew = By.xpath("//a[@class='btn btn-primary']");
	
	By email = By.id("Email");
	By password = By.id("Password");
	By fullname = By.id("FirstName");
	By lastname = By.id("LastName");
	
	By gendermale = By.xpath("//div[@class='raw']//input[@id ='Gender_Male']");
	By genderfemale = By.xpath("//div[@class='raw']//input[@id ='Gender_Female']");
	
	By dateofbirth = By.xpath("//input[@id ='DateOfBirth']");
	By comapny = By.xpath("//input[@id ='Company']");
	
	By Newsletter = By.xpath("//div[@class ='k-multiselect-wrap k-floatwrap']");
	
	
	By Customerrole = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']/ul[@id='SelectedCustomerRoleIds_taglist']");
	By custadmin = By.xpath("//li[contains(text(),'Administrators')]");
	By forum = By.xpath("//li[text()='Forum Moderators']");
	By guest = By.xpath("//li[text()='Guests']");
	By register = By.xpath("//li[text()='Registered']");
	By robot = By.xpath("//li[text()='Robot']");
	By vender = By.xpath("//li[text()='Vendors']");
	
	By managerofvender = By.xpath("//select[@id='VendorId']");

	By comment = By.id("AdminComment");
	By save = By.xpath("//button[@name='save']");
	
	//Action Methods
	
	public String gettitles() {
		return ldriver.getTitle();
	}
/*	public void dthreeselect() {
		ldriver.findElement(threeselect).click();
	}*/
	public void custmen() throws InterruptedException {
		Thread.sleep(3000);
		ldriver.findElement(Customer).click();
	}
	public void custrole() {
		ldriver.findElement(CustomerMenu).click();
	}
	public void addnew() {
		ldriver.findElement(addnew).click();
	}
	public void email(String mail) {
		ldriver.findElement(email).sendKeys(mail);
	}
	public void password(String pass) {
		ldriver.findElement(password).sendKeys(pass);
	}
	public void fullname(String fname)
	{
		ldriver.findElement(fullname).sendKeys(fname);
	}
	public void lastname(String lname)
	{
		ldriver.findElement(lastname).sendKeys(lname);
	}
	
	public void gender(String gender) {
		
		if(gender.equals("male")) {
			ldriver.findElement(gendermale).click();
		} else
		{
			 ldriver.findElement(genderfemale).click();
		
		}			
	}
	public void dob(String birth) {
		
		ldriver.findElement(dateofbirth).sendKeys(birth);
	}
	public void comapny(String company) {
		ldriver.findElement(comapny).sendKeys(company);
	}
	
	public void Newsletter(String str) {
		ldriver.findElement(Newsletter).click();
	
	}
	public void Customerrole(String role) throws InterruptedException {
		
		if(!role.equals(vender)) {
			ldriver.findElement(By.xpath("//span[@title='delete']")).click();
		}
		
		ldriver.findElement(Customerrole).click();
		
		WebElement Listitem;
		
		Thread.sleep(2000);
		
		if(role.equals("Administration")) {
			Listitem = ldriver.findElement(custadmin);
		}
		else if(role.equals("forum")) {
			Listitem = ldriver.findElement(forum);
		}
		else if(role.equals("guests")) {
			Listitem = ldriver.findElement(guest);
		}
		else if(role.equals("register")) {
			Listitem = ldriver.findElement(register);
		}
		else{
			Listitem = ldriver.findElement(robot);
		}
		
		Listitem.click();
		Thread.sleep(3000);
			
	}
	
	public void vender(String vender) {
		
		
		Select se = new Select(ldriver.findElement(managerofvender));
		
		se.selectByVisibleText(vender);
	}
	
	public void comment(String quote) {
		ldriver.findElement(comment).sendKeys(quote);
	}
	
	public void save() {
		ldriver.findElement(save).click();
	}
	
	
}
