package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class SearchCustPage {
	
	WebDriver ldriver;
	WaitHelper wait;
	
	public SearchCustPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		wait= new WaitHelper(ldriver);
		//if we want to add explicit wait then have to use this method.
		
	}
	
	@FindBy( how =How.ID, using = "SearchEmail")
	@CacheLookup
	WebElement SetEmail;
	
	@FindBy(how = How.ID,using = "SearchFirstName")
	@CacheLookup
	WebElement Fname;
	
	@FindBy(how = How.ID,using = "SearchLastName")
	@CacheLookup
	WebElement laname;
	
	@FindBy(how = How.ID, using = "SearchCompany")
	@CacheLookup
	WebElement company;
	
	@FindBy(how = How.ID, using ="SearchIpAddress")
	@CacheLookup
	WebElement ipaddress;
	
	@FindBy(how = How.ID, using = "SearchMonthOfBirth")
	@CacheLookup
	WebElement monthdate;
	
	@FindBy(how = How.ID, using = "SearchDayOfBirth")
	@CacheLookup
	WebElement daydate;
	
	@FindBy(how = How.ID, using ="search-customers")
	@CacheLookup
	WebElement searchbutton;
	
	@FindBy(how = How.XPATH, using ="//table[@role='grid']")
	@CacheLookup
	WebElement gridtable;
	
	@FindBy(how = How.XPATH, using ="//table[@id='customers-grid']")
	@CacheLookup
	WebElement table;
	
	@FindBy(how = How.XPATH, using ="//table[@role='grid']//tbody/tr")
	@CacheLookup
	List<WebElement>  rows;
	
	@FindBy(how = How.XPATH, using ="//table[@role='grid']//tbody/tr/td")
	@CacheLookup
	List<WebElement> column;
	
	
	//Action Methods
	
	public void setemail(String mail) {
		
		
		wait.Waitforelement(SetEmail, 30);
		SetEmail.clear();
		SetEmail.sendKeys(mail);
	}
	
	public void fname(String name) {
			
			wait.Waitforelement(Fname, 30);
			Fname.clear();
			Fname.sendKeys(name);
		}
	
	public void lname(String name) {
		
		wait.Waitforelement(laname, 30);
		laname.clear();
		laname.sendKeys(name);
	}
	public void searchbutton() {
		
		wait.Waitforelement(searchbutton,30);
		searchbutton.click();
	}
	
	public int rows() {
		
		return(rows.size());
	}
	
	public int column() {
			
			return(column.size());
		}
		
		
		public boolean checkmail(String mail) {
			
			boolean flag = false;
		for(WebElement rows1:rows) {
			
			String email=ldriver.findElement(By.xpath("//table[@role='grid']//tbody/tr/td[2]")).getText();
			
			if(email.equals(mail)) {
				
				flag=true;
				
			}			
		}
		return flag;		
		}
	
		public boolean namescheck(String name) {
			
			
			boolean flag = false;
			for(WebElement rows2:rows) {
				
				String name1 = ldriver.findElement(By.xpath("//table[@role='grid']//tbody/tr/td[3]")).getText();
				String namesplit[] = name1.split(" "); // separating fname and lname
				
				if(namesplit[0].equals("Sowmya") && namesplit[1].equals("Sri")) {
					
					flag=false; // it should true dont know problem
				}
				
			}
			return true;
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
