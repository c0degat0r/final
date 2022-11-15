package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lead extends BaseClass {
	@Given("I click the leads tab")
	public void i_click_the_leads_tab() {
	 driver.findElement(By.id("Lead Tab")).click();
	}
	@Given("I click on new button")
	public void i_click_on_new_button() {

	}
	@When("I enter my first name")
	public void i_enter_my_first_name() {

	}
	@When("I enter my last name")
	public void i_enter_my_last_name() {

	}
	@When("I enter my phone number")
	public void i_enter_my_phone_number() {

	}
	@Then("I enter email address")
	public void i_enter_email_address() {
	 
	}

}
