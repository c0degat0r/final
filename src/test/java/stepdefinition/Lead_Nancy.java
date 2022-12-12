package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lead_Nancy extends BaseClass{
	
	@Then("I see the {string} Home page title")
	public void i_see_the_home_page_title(String home) {
		boolean homepage = driver.findElement(By.xpath("//h2[@class='"+home+"']")).isDisplayed();
		 Assert.assertTrue(homepage);
	}
	@Given("I click the {string} Tab")
	public void i_click_the_tab(String Tab) {
	driver.findElement(By.xpath("//a[@title='"+Tab+" Tab']")).click();
	}
	@When("I see {string} field")
	public void i_see_field(String id) {
			boolean field = driver.findElement(By.id(id)).isDisplayed();
			 Assert.assertTrue(field);
	}
	@Then("I send {string} into {string} field")
	public void i_send_into_field(String input, String field) {
		driver.findElement(By.id(field)).sendKeys(input);
	}
	
}

