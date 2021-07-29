package steps;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class ContactPageAnyaTest extends BaseClass {
	@Then("^I type \"([^\"]*)\" in the \"([^\"]*)\" field for Contact object$")
	public void i_type_in_the_field_for_Contact_object(String textToEnter, String fieldName) {
		if (fieldName.equalsIgnoreCase("Last Name")) {
			driver.findElement(By.id("name_lastcon2")).sendKeys(textToEnter);
		}
	}
	@When("^I click on the \"([^\"]*)\" field$")
	public void i_click_on_the_field(String magGlass) {
	   String parentWindow= driver.getWindowHandle();
	   System.out.println("Parent window "+parentWindow);
	   driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']")).click();
	   
	   Set<String> multipleHandles =driver.getWindowHandles();
	   for(String childWindow : multipleHandles ) {
		   System.out.println("Using window handles "+childWindow);
		   if(!parentWindow.equals(childWindow)) {
			   driver.switchTo().window(childWindow);
			 
			   System.out.println("This is a child window"+driver.getTitle());  
		   }
	   }
	}
	@Then("^I should see \"([^\"]*)\" text on the new page$")
	public void i_should_see_text_on_the_new_page(String expectedText) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame("searchFrame");
		System.out.println(driver.getTitle());
			String actualText=driver.findElement(By.xpath("//div[@class='bPageTitle']")).getText();	
		Assert.assertEquals(actualText, expectedText);
					
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
					}
		
		
	@Then("^I should type \"([^\"]*)\" name in the \"([^\"]*)\" field for Contact object$")
	public void i_should_type_name_in_the_field_for_Contact_object(String textToEnter, String accountField) {
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("resultsFrame");	
		if (accountField.equalsIgnoreCase("Account Name")) {
			driver.findElement(By.xpath("//input[@id='2']")).sendKeys(textToEnter);
		}
		driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]")).click();
		System.out.println("The code is working");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 String childWindow= driver.getWindowHandle();
		 Set<String> multipleHandles =driver.getWindowHandles();
		   for(String parentWindow : multipleHandles ) {
			   System.out.println("Using window handles "+parentWindow);
			   if(!childWindow.equals(parentWindow)) {
				   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				   driver.switchTo().window(parentWindow);
				   System.out.println("This is a new window"+parentWindow+driver.getTitle());  
				   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("con5")).sendKeys("123456789+");

			   }}}}


