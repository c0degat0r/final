package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {

	@Given("I open {string} browser")
	public void i_open_browser(String browser) {
		openbrowser(browser);
	}

	@Given("I visit {string} environment")
	public void i_visit_environment(String env) {
		openApplication(env);
	}

	@When("I enter {string} username")
	public void i_enter_username(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@When("I enter {string} password")
	public void i_enter_password(String password) {
		driver.findElement(By.name("pw")).sendKeys(password);
	}

	@When("I click the {string} button")
	public void i_click_the_button(String buttonValue) {
		driver.findElement(By.xpath("//input[@value='" + buttonValue + "']")).click();
	}

	@Then("I should see the dashboard")
	public void i_should_see_the_dashboard() {
		Assert.assertTrue(driver.findElement(By.id("phHeaderLogoImage")).isDisplayed());
	}
	@Then("I click the account tab")
	public void i_click_the_account_tab() {
	   driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
	}
	@Given("I click the new button")
	public void i_click_the_new_button() {
	    driver.findElement(By.className("new")).click();
	}
	@Given("I enter account name")
	public void i_enter_account_name() {
		 driver.findElement(By.id("acc2")).sendKeys("Aimal Faiq");
	}
	@Given("I enter account number")
	public void i_enter_account_number() {
	  driver.findElement(By.id("acc5")).sendKeys("333333");
	}
	@When("I enter phone number")
	public void i_enter_phone_number() {
		  driver.findElement(By.id("acc10")).sendKeys("123456");
	}
	@When("I click the save button")
	public void i_click_the_save_button() {
		  driver.findElement(By.xpath("//input[@title='Save']")).click();
	}
	

}
