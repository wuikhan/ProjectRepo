package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;

public class ContactPageAnyaTest extends BaseClass {

	@Then("^I type \"([^\"]*)\" in the \"([^\"]*)\" field for Contact object$")
	public void i_type_in_the_field_for_Contact_object(String textToEnter, String fieldName) {

		if (fieldName.equalsIgnoreCase("Last Name")) {
			driver.findElement(By.id("name_lastcon2")).sendKeys(textToEnter);
		}
	}

	@Then("^I should see \"([^\"]*)\" text on the new page$")
	public void i_should_see_text_on_the_new_page(String expectedText) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String actualText = driver.findElement(By.xpath("//img[@class='pageTitleIcon']//following-sibling::h1"))
				.getText();
		Assert.assertEquals(actualText, expectedText);
	}

	@Then("^I should type \"([^\"]*)\" name in the \"([^\"]*)\" field for Contact object$")
	public void i_should_type_name_in_the_field_for_Contact_object(String textToEnter, String accountField) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (accountField.equalsIgnoreCase("Account Name")) {
			driver.findElement(By.xpath("//input[@id='2']")).sendKeys(textToEnter);
		}
	}

	@Then("^I should see \"([^\"]*)\" text in the \"([^\"]*)\" field$")
	public void i_should_see_text_in_the_field(String arg1, String arg2) {

	}

}
