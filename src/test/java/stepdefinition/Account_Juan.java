package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Account_Juan extends BaseClass {
	
	@Then("I click the Account Tab")
	public void i_click_the_account_tab() {
	   driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click(); 
	}
	
	@When("I Click the {string} button")
	public void i_click_the_button(String buttonName) {
	 //  driver.findElement(By.id(" New ")).click();
	   driver.findElement(By.xpath("//input[@title='" + buttonName + "']")).click();
	}
	
	@Then("I should see the account number field")
	public void i_should_see_the_account_number_field() {
		boolean accField = driver.findElement(By.id("acc5")).isDisplayed();
		Assert.assertTrue(accField);   
	}
	
	@Then("I enter {string} in the account name field")
	public void i_enter_in_the_account_name_field(String accName) {
	  driver.findElement(By.id("acc2")).sendKeys(accName);
	}

	@When("I enter {string} in the account number field")
	public void i_enter_in_the_account_number_field(String accNumber) {
		driver.findElement(By.id("acc5")).sendKeys(accNumber);
	}
	@When("I enter {string} in the account site field")
	public void i_enter_in_the_account_site_field(String accSite) {
	   driver.findElement(By.id("acc23")).sendKeys(accSite); 
	}

	@Then("I enter {string} in the annual revenue field")
	public void i_enter_in_the_annual_revenue_field(String revenue) {
	   driver.findElement(By.id("acc8")).sendKeys(revenue);
	}

	@Then("I enter {string} in the phone number field")
	public void i_enter_in_the_phone_number_field(String phone) {
	    driver.findElement(By.id("acc10")).sendKeys(phone);
	}

	@Then("I enter {string} in the fax number field")
	public void i_enter_in_the_fax_number_field(String fax) {
		driver.findElement(By.id("acc11")).sendKeys(fax);
	    
	}

	@Then("I enter {string} in the website field")
	public void i_enter_in_the_website_field(String website) {
	   driver.findElement(By.id("acc12")).sendKeys(website);
	}

	@Then("I enter {string} in the sic code")
	public void i_enter_in_the_sic_code(String code) {
		driver.findElement(By.id("acc16")).sendKeys(code);
	    
	}
	@When("I click the save button")
	public void i_click_the_save_button() {
		driver.findElement(By.xpath("//td[@class='pbButtonb' and contains (@id,'bottomButtonRow')]//input[@value=' Save ']")).click();
	}

	@Then("I should see the record is saved")
	public void i_should_see_the_record_is_saved() {
		boolean myAccount = driver.findElement(By.xpath("//*[@id=\"contactHeaderRow\"]/div[2]/h2")).isDisplayed();
		Assert.assertTrue(myAccount); 
	}

}
