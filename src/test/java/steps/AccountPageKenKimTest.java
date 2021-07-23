package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;

public class AccountPageKenKimTest extends BaseClass {

	@Then("I click the {string} tab")
	public void i_click_the_tab(String titleName) {
		driver.findElement(By.xpath("//a[@title='" + titleName + "']")).click();
	}

	@Then("I should see the values for the {string} field")
	public void i_should_see_the_values_for_the_field(String fieldID, io.cucumber.datatable.DataTable values) {
		WebElement dropDown = driver.findElement(By.id(fieldID));
		Select sel = new Select(dropDown);
		List<WebElement> opt = sel.getOptions();
		List<String> value = values.asList(String.class);
		for (int i = 0; i < value.size(); i++) {
			Assert.assertEquals(value.get(i), opt.get(i).getText());
		}
	}

	@Then("I close the browser")
	public void i_close_the_browser() {
		driver.close();
	}

	@Then("I enter {string} for the {string} field")
	public void i_enter_for_the_field(String val1, String fieldID) {
		driver.findElement(By.id(fieldID)).sendKeys(val1);
	}

	@Then("I select {string} for the {string} field")
	public void i_select_for_the_field(String val1, String fieldID) {
		WebElement activeField = driver.findElement(By.id(fieldID));
		Select choice = new Select(activeField);
		choice.selectByValue(val1);
	}

	@Then("I should see the value {string} in the {string} ID field")
	public void i_should_see_the_value_in_the_id_field(String val1, String fieldID) {
		String actualText = driver.findElement(By.id(fieldID)).getText();
		Assert.assertEquals(actualText, val1);
	}

	@Then("I should see the the {string} button")
	public void i_should_see_the_the_button(String btn) {
		boolean buttonPresent = driver.findElement(By.xpath("//input[@title='"+btn+"']")).isDisplayed();
	    Assert.assertTrue(buttonPresent);
	}

}
