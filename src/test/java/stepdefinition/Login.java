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
		System.out.println("check after saving");
	}
}
