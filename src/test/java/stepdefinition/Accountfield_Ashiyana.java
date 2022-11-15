package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Accountfield_Ashiyana extends BaseClass {
	//public static WebDriver driver;

	@Then("i click on account tab")
	public void i_click_on_account_tab() {
		driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
 
	}

@When("I clicked the New  button")
public void i_clicked_the_new_button() {
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
	}
	   	@When("I should see account name field")
	public void i_should_see_account_name_field() {
	 boolean accountfield =  driver.findElement(By.id("acc2")).isDisplayed(); 
	}
	   	
	@When("I enter {string} account name field")
	public void i_enter_account_name_field(String string) {
	    driver.findElement(By.id("acc2")).sendKeys(string);
	}
	
	@When("I Add Account site input field")
	public void i_add_account_site_input_field() {
		driver.findElement(By.id("acc23")).sendKeys("codegator");
	}
	
	@When("I also Add Annual revenue input field")
	public void i_also_add_annual_revenue_input_field() {
	  driver.findElement(By.id("acc8")).sendKeys("78");
	}
	@When("I  Add Phone input field")
	public void i_add_phone_input_field() {
		driver.findElement(By.id("acc10")).sendKeys("98766545353");
  
	}
	
	@When("Add Fax input field")
	public void add_fax_input_field() {
		driver.findElement(By.id("acc11")).sendKeys("985643267");
	   
	}
	@When("Add Website input field")
	public void add_website_input_field() {
		driver.findElement(By.id("acc12")).sendKeys("www.abc.com");
	   
	}
	@When("Add SIC code input field")
	public void add_sic_code_input_field() {
	 driver.findElement(By.id("acc16")).sendKeys("65");
	}
	
	@When("I add SLA serial number input field")
	public void i_add_sla_serial_number_input_field() {
	   WebElement sla =  driver.findElement(By.xpath("//select[@id='00N3t00000LA9IN']"));
	    Select selectsla = new Select(sla);
	    selectsla.selectByIndex(3);
	    
	}
	@When("I click the save button")
	public void i_click_the_save_button() {
		driver.findElement(By.xpath("//td[@class='pbButtonb']//input[@name='save']")).click();
	    
	}
	
	@When("I should see the record")
	public void i_should_see_the_record() {
		driver.navigate().back();
	  driver.findElement(By.linkText("Accounts")).click();
	boolean record =  driver.findElement(By.xpath("//a[contains(text(),'Ashiyana')]")).isDisplayed();
	}

}
	
	



