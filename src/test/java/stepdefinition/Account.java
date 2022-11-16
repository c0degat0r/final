package stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;


public class Account extends BaseClass {
	@Then("I click on the {string} Tab")
	public void i_click_on_the_tab(String tab) {
		driver.findElement(By.xpath("//a[@title='"+ tab +" Tab']")).click();
	}
	@Then("i enter acount name input field")
	public void i_enter_acount_name_input_field() {
	   driver.findElement(By.id("acc2")).sendKeys("Maricruz"); 
	}
	@Then("i enter acount number input field")
	public void i_enter_acount_number_input_field() {
		 driver.findElement(By.id("acc5")).sendKeys("123");
	}
	@Then("i enter account site input field")
	public void i_enter_account_site_input_field() {
		driver.findElement(By.id("acc23")).sendKeys("codegator");
	}
	@Then("i add annual revenue input field")
	public void i_add_annual_revenue_input_field() {
		 driver.findElement(By.id("acc8")).sendKeys("152");
	}
	@Then("i add phone input field")
	public void i_add_phone_input_field() {
		driver.findElement(By.id("acc10")).sendKeys("1233456677");
	}
	@Then("i add fax input field")
	public void i_add_fax_input_field() {
		driver.findElement(By.id("acc11")).sendKeys("1542555");
	}
	@Then("i add website input field")
	public void i_add_website_input_field() {
		 driver.findElement(By.id("acc12")).sendKeys("codegator");

	}
	@Then("i add SIC code input field")
	public void i_add_sic_code_input_field() {
		 driver.findElement(By.id("acc16")).sendKeys("a30");

	}
	@Then("i should see the below drop down values for {string} field")
	public void i_should_see_the_below_drop_down_values_for_field(String sla, io.cucumber.datatable.DataTable dataTable) {
		List<String> slaData = dataTable.asList();
		WebElement slaDropDown = driver.findElement(By.id(sla));
		Select sel = new Select(slaDropDown);
		List<WebElement> options = sel.getOptions();
		for(int i=0; i<options.size(); i++) {
			Assert.assertEquals(options.get(i).getText(), slaData.get(i));
		}
		sel.selectByVisibleText("Gold");
	}
	@Then("i click the {string} button")
	public void i_click_the_button(String save) {
		driver.findElement(By.xpath("//input[@value='" + save + "']")).click();

	}

}
