package steps;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;

public class ContactPageTest_Danial extends BaseClass {

	@Then("^I should enter \"([^\"]*)\" in the field with tab index of \"([^\"]*)\"$")
	public void i_should_enter_in_the_field_with_tab_index_of(String input, String tabindex)  {
	    driver.findElement(By.xpath("//input[@tabindex='"+tabindex+"']")).sendKeys(input);
	}
	
}
