package steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;


public class AccountPageTest extends BaseClass {
	
	@Then("^I click the \"([^\"]*)\" link in the menu$")
	public void i_click_the_link_in_the_menu(String tabName) {
	   driver.findElement(By.xpath("//a[@title='"+tabName+" Tab']")).click();
	}

	@Then("^I should see \"([^\"]*)\" text$")
	public void i_should_see_text(String expectedText) {
	 String actualText = driver.findElement(By.xpath("//h2[@class='pageDescription']")).getText();
	Assert.assertEquals(actualText, expectedText);
	}

	@Then("^I enter \"([^\"]*)\" in the \"([^\"]*)\" field$")
	public void i_enter_in_the_field(String textToEnter, String fieldName) {
		
		if(fieldName.equalsIgnoreCase("Account Name")) {
			driver.findElement(By.id("acc2")).sendKeys(textToEnter);
		}
	    
	}

	@Then("^I should see \"([^\"]*)\" button is visible$")
	public void i_should_see_button_is_visible(String btn) {
	    boolean buttonPresent = driver.findElement(By.xpath("//input[@title='"+btn+"']")).isDisplayed();
	    Assert.assertTrue(buttonPresent);
	   // Assert.assertTrue(driver.findElement(By.xpath("//input[@title='"+btn+"']")).isDisplayed());
	}
}
