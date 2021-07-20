package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageTest extends BaseClass {

	@Given("^I open \"([^\"]*)\" browser$")
	public void i_open_browser(String browser) {

		// check which operating system you are on
		String osName = System.getProperty("os.name");
		System.out.println("OS Name : " + osName);

		if (browser.equalsIgnoreCase("chrome")) {
			if (osName.equalsIgnoreCase("Windows 10")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/drivers/windows/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			} else if (osName.equalsIgnoreCase("Mac OS X")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/drivers/mac/chromedriver");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			} else if (osName.equalsIgnoreCase("Linux")) {
				System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("headless");
				options.addArguments("disable-gpu");
				driver = new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			} else {
				System.out.println("Configurations for " + osName + " does not exist.");
			}
			
		}
		
	}
	
	@Given("^I visit the \"([^\"]*)\" environment$")
	public void i_visit_the_environment(String env)  {
	    
		if(env.equalsIgnoreCase("qa")) {
			driver.get("https://login.salesforce.com");
		}
	}

	@Given("^I enter \"([^\"]*)\" username$")
	public void i_enter_username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}

	@Given("^I enter \"([^\"]*)\" password$")
	public void i_enter_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("^I click the \"([^\"]*)\" button$")
	public void i_click_the_button(String button) {
		driver.findElement(By.xpath("//input[@name='"+button+"']")).click();
	}

	@Then("^I should see the \"([^\"]*)\" link$")
	public void i_should_see_the_link(String tab) {
		Assert.assertTrue(driver.findElement(By.xpath("//a[@title='"+tab+" Tab - Selected']")).isDisplayed());
	}

	@Then("^I should see the \"([^\"]*)\" error message$")
	public void i_should_see_the_error_message(String verifyError) {
		
		String errorText = driver.findElement(By.id("error")).getText();
		Assert.assertEquals(verifyError, errorText);

	}

}
