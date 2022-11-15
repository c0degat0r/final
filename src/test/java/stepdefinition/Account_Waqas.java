package stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Account_Waqas extends BaseClass {

	@When("I click the {string} tab")
	public void i_click_the_tab(String tab) {
	   driver.findElement(By.xpath("//a[@title='"+tab+" Tab']")).click();
	}
	@Then("I should see the below drop down values for {string} field")
	public void i_should_see_the_below_drop_down_values_for_field(String sla, io.cucumber.datatable.DataTable dataTable) {
	 List<String> slaData = dataTable.asList();
	 WebElement slaDropDown = driver.findElement(By.id(sla));
	 Select sel = new Select(slaDropDown);
	 List<WebElement> options = sel.getOptions();
	 for(int i=0;i<options.size();i++) {
		 Assert.assertEquals(options.get(i).getText(), slaData.get(i));
	 }
	}
}
