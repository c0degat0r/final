package stepdefinition;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Account_Nancy extends BaseClass{
	
	@Given("I click the Accounts Tab Tab button")
	public void i_click_the_accounts_tab_tab_button() {
		driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
	}

	@Then("I see the Accounts Home page title")
	public void i_should_see_the_accounts_home_page_title() {
		boolean acc_home = driver.findElement(By.xpath("//h2[@class='pageDescription']")).isDisplayed();
		 Assert.assertTrue(acc_home);
	}
	

	@When("I click the New button")
	public void i_click_the_new_button() {
		driver.findElement(By.xpath("//input[@title='New']")).click();
	}

	@Then("I see New Account page title")
	public void i_see_new_account_page_title() {
		boolean new_home = driver.findElement(By.xpath("//h2[@class='pageDescription']")).isDisplayed();
		 Assert.assertTrue(new_home);
	}
	
	@Then("I enter {string}  Account Name")
	public void i_enter_account_name(String AccountName) {
		driver.findElement(By.xpath("//input[@name ='acc2']")).sendKeys(AccountName);
	}

	@Then("I enter {string} Account Number")
	public void i_enter_account_number(String AccountNumber) {
		driver.findElement(By.xpath("//input[@name ='acc5']")).sendKeys(AccountNumber);
	}

	@Then("I enter {string} Account Site")
	public void i_enter_account_site(String AccountSite) {
		driver.findElement(By.xpath("//input[@name ='acc23']")).sendKeys(AccountSite);
	}

	@Then("I enter {string} Annual Revenue")
	public void i_enter_annual_revenue(String AnnualRevenue) {
		driver.findElement(By.xpath("//input[@name ='acc8']")).sendKeys(AnnualRevenue);
	}

	@Then("I enter {string} Phone")
	public void i_enter_phone(String Phone) {
		driver.findElement(By.xpath("//input[@name ='acc10']")).sendKeys(Phone);
	}

	@Then("I enter {string} Fax")
	public void i_enter_fax(String Fax) {
		driver.findElement(By.xpath("//input[@name ='acc11']")).sendKeys(Fax);
	}

	@Then("I enter {string} Website")
	public void i_enter_website(String Website) {
		driver.findElement(By.xpath("//input[@name ='acc12']")).sendKeys(Website);
	}

	@Then("I enter {string} SIC Code")
	public void i_enter_sic_code(String SICCode) {
		driver.findElement(By.xpath("//input[@name ='acc16']")).sendKeys(SICCode);
	}
	
	@Then ("I click the Save button")
	public void i_click_the_save_button () {
		driver.findElement(By.xpath("//input[@value=' Save ']")).click();
	}
	
	
	//this whole method is for verification of values only 
	@Then("I should see the below drop down values for {string} field")
	public void i_should_see_the_below_drop_down_values_for_field(String sla, io.cucumber.datatable.DataTable dataTable) {
	    List<String> slaData = dataTable.asList();
	   // System.out.println(slaData);just for me to see
	    WebElement slaDropDown = driver.findElement(By.id(sla));
	    Select sel = new Select(slaDropDown);
	    List<WebElement> options = sel.getOptions();
	    for (int i=0; i<options.size(); i++) {
	    	Assert.assertEquals(options.get(i).getText(), slaData.get(i));
	    }   
	} 

	@Then("I should be able to select {string} from a {string} field")
	public void i_should_be_able_to_select_from_a_field(String option, String field) {
		WebElement Options = driver.findElement(By.id(field));
		Select select = new Select (Options);
		List <WebElement> alloptions = select.getOptions();
		for (int i = 0; i < alloptions.size(); i++) {
			for (WebElement values : alloptions) {
				if (values.getText().equalsIgnoreCase(option)) {
				values.click();
					break;
				}
			}
		}
	} 
	



}
