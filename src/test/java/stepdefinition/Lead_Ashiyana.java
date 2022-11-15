package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.When;

public class Lead_Ashiyana  extends BaseClass{

	@When("I click on Lead field")
	public void i_click_on_lead_field() {
		driver.findElement(By.xpath("//a[@title='Leads Tab - Selected']")).click();
	    
	}
	@When("I click on new button")
	public void i_click_on_new_button() {
		driver.findElement(By.xpath("//input[@name='new']")).click();
	}
	
	@When("I add Salutation on the Lead field")
	public void i_add_salutation_on_the_lead_field() {
		WebElement  salutation = driver.findElement(By.id("name_salutationlea2"));
		Select sltsalutation = new Select(salutation);
		sltsalutation.selectByIndex(3);
	    
	}
	@When("I field out first name")
	public void i_field_out_first_name() {
	    
	}

	
	
	
	
}
