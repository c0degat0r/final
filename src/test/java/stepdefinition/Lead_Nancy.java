package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Lead_Nancy extends BaseClass{
	
	@Then("I see the {string} Home page title")
	public void i_see_the_home_page_title(String home) {
		boolean homepage = driver.findElement(By.xpath("//h2[@class='"+home+"']")).isDisplayed();
		 Assert.assertTrue(homepage);
	    
	}
	
	

}
