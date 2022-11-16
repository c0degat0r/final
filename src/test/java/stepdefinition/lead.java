package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;

public class lead extends BaseClass {
	@Then("i enter first name input field")
	public void i_enter_first_name_input_field() {
		driver.findElement(By.id("name_firstlea2")).sendKeys("Maricruz");
	}
	@Then("i enter last name input field")
	public void i_enter_last_name_input_field() {
		driver.findElement(By.id("name_lastlea2")).sendKeys("Ortiz");
	}
	@Then("i enter company input field")
	public void i_enter_company_input_field() {
		driver.findElement(By.id("lea3")).sendKeys("codegator");
	}
	@Then("i enter title input field")
	public void i_enter_title_input_field() {
		driver.findElement(By.id("lea4")).sendKeys("hello");
	}
	@Then("i enter campaign input field")
	public void i_enter_campaign_input_field() {
		driver.findElement(By.id("lea20")).sendKeys("world");
	}
	@Then("i enter annual revenue input field")
	public void i_enter_annual_revenue_input_field() {
		driver.findElement(By.id("lea7")).sendKeys("100,000");
	}
	@Then("i enter phone input field")
	public void i_enter_phone_input_field() {
		driver.findElement(By.id("lea8")).sendKeys("1233456677");
	}
	@Then("i enter mobile input field")
	public void i_enter_mobile_input_field() {
		driver.findElement(By.id("lea9")).sendKeys("1234566677");
	}
	@Then("i enter fax input field")
	public void i_enter_fax_input_field() {
		driver.findElement(By.id("lea10")).sendKeys("1234566677");
	}
	@Then("i enter email input field")
	public void i_enter_email_input_field() {
		driver.findElement(By.id("lea11")).sendKeys("helloworld@123.com");
	}
	@Then("i enter website input field")
	public void i_enter_website_input_field() {
		driver.findElement(By.id("lea12")).sendKeys("www.helloall.com");
	}
	@Then("i enter no. of employees input field")
	public void i_enter_no_of_employees_input_field() {
		driver.findElement(By.id("lea15")).sendKeys("15");
	}
	@Then("i enter street input field")
	public void i_enter_street_input_field() {
		driver.findElement(By.id("lea16street")).sendKeys("123 street dr");
	}
	@Then("i enter city input field")
	public void i_enter_city_input_field() {
		driver.findElement(By.id("lea16city")).sendKeys("Woodbridge");
	}
	@Then("i enter state\\/province input field")
	public void i_enter_state_province_input_field() {
		driver.findElement(By.id("lea16state")).sendKeys("VA");
	}
	@Then("i enter zip\\/postal code input field")
	public void i_enter_zip_postal_code_input_field() {
		driver.findElement(By.id("lea16zip")).sendKeys("22222");
	}
	@Then("i enter country input field")
	public void i_enter_country_input_field() {
		driver.findElement(By.id("lea16country")).sendKeys("USA");
	}
	@Then("i enter SIC input field")
	public void i_enter_sic_input_field() {
		driver.findElement(By.id("00N3t00000LA9Ib")).sendKeys("idk");
	}
	@Then("i enter number of locations input field")
	public void i_enter_number_of_locations_input_field() {
		driver.findElement(By.id("00N3t00000LA9IY")).sendKeys("4");
	}
	@Then("i enter current generator input field")
	public void i_enter_current_generator_input_field() {
		driver.findElement(By.id("00N3t00000LA9IX")).sendKeys("2");
	}
	@Then("i enter description input field")
	public void i_enter_description_input_field() {
		driver.findElement(By.id("lea17")).sendKeys("hello all ");
	}
}
