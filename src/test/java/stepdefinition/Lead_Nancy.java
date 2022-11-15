package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Lead_Nancy extends BaseClass{
	
	@Given("I click the Lead Tab")
	public void i_click_the_lead_tab() {
		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
	}
	@Then("I see the Lead Home page title")
	public void i_see_the_lead_home_page_title() {
	   driver.findElement(By.xpath("//h2[@class='pageDescription']")).click();
	}
	
	@Then("I see New Lead page title")
	public void i_see_new_lead_page_title() {
	   driver.findElement(By.xpath("//h2[@class='pageDescription']")).click();
	}
	//@Then("I click on First name")
	//public void i_click_on_first_name() {
	   //driver.findElement(By.xpath(""))
	//}
	
	

}
