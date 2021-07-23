package steps;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
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
	
	@Then("^I take a screenshot with the file name as \"([^\"]*)\"$")
	public void i_take_a_screenshot_with_the_file_name_as(String screenshot) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File srcFile =	ts.getScreenshotAs(OutputType.FILE); // take the ss and store it in the memory
		File destFile = new File(System.getProperty("user.dir")+"/Screenshots/"+screenshot+".png");
		FileUtils.copyFile(srcFile, destFile);
	}
}
