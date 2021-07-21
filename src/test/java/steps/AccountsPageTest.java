package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountsPageTest extends BaseClass {
	@Given("^I enter \"([^\"]*)\" username And I enter \"([^\"]*)\" password$")
	public void i_enter_username_And_I_enter_password(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("^I should click the \"([^\"]*)\" link$")
	public void i_should_click_the_link(String tab) throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='" + tab + " Tab']")).click();
		Thread.sleep(2000);
	}

	@Then("^I should close the browser$")
	public void i_should_close_the_browser() {
		driver.close();
	}

	@Then("^I should enter \"([^\"]*)\" in the Account Name field$")
	public void i_should_enter_in_the_Account_Name_field(String value) {
		driver.findElement(By.id("acc2")).sendKeys(value);
	}

	@Then("^I should verify the values in the \"([^\"]*)\" dropdown and select \"([^\"]*)\"$")
	public void i_should_verify_the_values_in_the_dropdown_and_select(String dropdown, String value) {
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='" + dropdown + "']")));
		List<WebElement> list = sel.getOptions();
		for (WebElement option : list) {
			System.out.println(option.getText());
		}
		sel.selectByValue(value);

	}

	@Then("^I should see selected value in the \"([^\"]*)\" field$")
	public void i_should_see_selected_value_in_the_field(String field) {
		System.out.println("The entered value was: " + driver.findElement(By.id(field)).getText());
	}

}