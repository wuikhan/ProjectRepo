package steps;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactPageAnyaTest extends BaseClass{
	
	@Then("^I type \"([^\"]*)\" in the \"([^\"]*)\" field for Contact object$")
	public void i_type_in_the_field_for_Contact_object(String textToEnter, String fieldName)  {
		
		if(fieldName.equalsIgnoreCase("Last Name")) {
			driver.findElement(By.id("name_lastcon2")).sendKeys(textToEnter);
		}
	}
	
	@When("^I click on the \"([^\"]*)\" field$")
	public void i_click_on_the_field(String textToEnter) {
	  String parentWindow = driver.getWindowHandle();
	  driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']")).click();
	  Set<String> childWindows = driver.getWindowHandles();
	  
	  for (String childWindow : childWindows) { 
	  if(!parentWindow.equals(childWindow)) {
	   driver.switchTo().window(childWindow);
	  System.out.println(driver.getTitle()); 
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if(accountField.equalsIgnoreCase("Account Name")) {
		   driver.findElement(By.xpath("//input[@id='2']")).sendKeys(textToEnter); 
	 driver.switchTo().defaultContent(); driver.switchTo().frame(1);
	   driver.switchTo().window(parentWindow);
	}
	  }}
	
	 @Then("^I should see \"([^\"]*)\" text on the new page$")
	 public void i_should_see_text_on_the_new_page(String expectedText){ 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 String actualText = driver.findElement(By.xpath("//img[@class='pageTitleIcon']//following-sibling::h1")).getText();
	 Assert.assertEquals(actualText, expectedText); }
	 
	
	@Then("^I should type \"([^\"]*)\" name in the \"([^\"]*)\" field for Contact object$")
	public void i_should_type_name_in_the_field_for_Contact_object(String textToEnter, String accountField) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if(accountField.equalsIgnoreCase("Account Name")) {
		   driver.findElement(By.xpath("//input[@id='2']")).sendKeys(textToEnter); 
	   }
	}

	@Then("^I should see \"([^\"]*)\" text in the \"([^\"]*)\" field$")
	public void i_should_see_text_in_the_field(String arg1, String arg2)  {

	}

}
