package steps;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AccountsPageTest extends BaseClass {
	@Given("^I enter \"([^\"]*)\" username And I enter \"([^\"]*)\" password$")
	public void i_enter_username_And_I_enter_password(String username, String password)  {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("^I should click the \"([^\"]*)\" link$")
	public void i_should_click_the_link(String tab)  {
	   driver.findElement(By.xpath("//a[@title='"+tab+" Tab']")).click();
	}
	@Then("^I should close the browser$")
	public void i_should_close_the_browser()  {
	 driver.close();


	}
}
