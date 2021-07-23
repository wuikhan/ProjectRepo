package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;

public class OpportunityPageTest_Danial extends BaseClass {
	
	@Then("^I should see the \"([^\"]*)\" text$")
	public void i_should_see_the_text(String field)  {

		String text= driver.findElement(By.className("pageDescription")).getText();
		Assert.assertEquals(field, text);
	}
	@Then("^I should select  date using link$")
	public void i_should_select_date_using_link()  {
	    driver.findElement(By.xpath("//a[@tabindex='7']")).click();
	}
	@Then("^I should verify the values in the dropdown and select \"([^\"]*)\"$")
	public void i_should_verify_the_values_in_the_dropdown_and_select(String value)  {
		Select sel = new Select(driver.findElement(By.id("opp11")));
		List<WebElement> list = sel.getOptions();
		for (WebElement option : list) {
			System.out.println(option.getText());
		}
		sel.selectByValue(value);
	
}
}