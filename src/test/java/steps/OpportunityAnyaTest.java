package steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;

public class OpportunityAnyaTest extends BaseClass {


@Then("^I select \"([^\"]*)\" in the \"([^\"]*)\" calendar field$")
public void i_select_in_the_calendar_field(String arg1, String arg2) {
  driver.findElement(By.name("opp9")).click();
    
	 WebElement month = driver.findElement(By.id("calMonthPicker")); 
	 Select selectMonth = new Select(month); 
	  selectMonth.selectByVisibleText("February");
	 
	  WebElement year = driver.findElement(By.id("calYearPicker")); 
	 Select selectYear = new Select(year); 
	 selectYear.selectByVisibleText("2022");
	 
	  List<WebElement> dates = driver.findElements(By.xpath("//tr[@class='calRow']/td"));
	 
	 for (WebElement date : dates) {
	  String value = date.getText();
	 
	 if (value.contains("22")) { 
	  date.click(); break;
	   }}
}
@Then("^I select \"([^\"]*)\" for the \"([^\"]*)\" dropdown field$")
public void i_select_for_the_dropdown_field(String value, String fieldName)
{
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement dDown = driver.findElement(By.name(fieldName));
   Select sel = new Select(dDown);
   sel.selectByValue(value);
}
}
