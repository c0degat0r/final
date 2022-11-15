package stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Account_MoAbdelhaye extends BaseClass {
	
	
	

	@Then("I click the accounts tab")
	public void i_click_the_accounts_tab() {
	  driver.findElement(By.linkText("Accounts")).click();  
	}
	
	@When("I Enter {string} Account name")
	public void i_enter_account_name(String Account_Name) {
	    driver.findElement(By.id("acc2")).sendKeys(Account_Name);
	}
	@Given("I Enter the {string} account number")
	public void i_enter_the_account_number(String Account_Number) {
	 driver.findElement(By.id("acc5")).sendKeys(Account_Number);
	}
	@Given("I Enter the {string} account Site")
	public void i_enter_the_account_site(String Account_Site) {
		 driver.findElement(By.id("acc23")).sendKeys(Account_Site);  
	}
	@Given("I Enter the {string} Annaul revenue")
	public void i_enter_the_annual_revenue(String Annual_revenue) {
		 driver.findElement(By.id("acc8")).sendKeys(Annual_revenue);  
	}
	@Then("I Enter the {string} Phone number")
	public void i_enter_the_phone_number(String Phone_nmuber) {
		driver.findElement(By.id("acc10")).sendKeys(Phone_nmuber);    
	}
	@Then("I Enter the {string} Fax number")
	public void i_enter_the_fax_number(String Fax_number) {
		driver.findElement(By.id("acc11")).sendKeys(Fax_number);    
	}
	@Then("I Enter the {string} website")
	public void i_enter_the_website(String webSite) {
		driver.findElement(By.id("acc12")).sendKeys(webSite);    
	}
	@Then("I Enter the {string} SIC code")
	public void i_enter_the_sic_code(String SIC) {
		driver.findElement(By.id("acc16")).sendKeys(SIC); 
	}
	
	@Then("I should see the following values for {string} field")
	public void i_should_see_the_following_values_for_field(String fieldName, DataTable values) {
	   
		List<String> rows = values.asList(String.class);
		WebElement val=driver.findElement(By.name(fieldName));
		Select sel= new Select(val);
		List<WebElement> opt= sel.getOptions();
		
		for(int i=0 ; i<opt.size() ;i++) {			
				Assert.assertEquals(rows.get(i),opt.get(i).getText());
			}
		}
	
	
	@Then("I click the {string} save button")
	public void i_click_the_save_button(String buttonValue) {
		driver.findElement(By.xpath("//input[@value='" + buttonValue + "']")).click();
	}
	
	
	@Then("I should see the reccord I saved")
	public void i_should_see_the_reccord_i_saved() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='topName']")).isDisplayed()); 
	}

}
