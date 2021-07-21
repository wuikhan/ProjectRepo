#Author: SuuperDan

Feature: Test accounts page functionality
  

  
  Scenario: Click the Accounts Tab
     Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username And I enter "Welcome2" password
	When I click the "Login" button
	Then I should click the "Accounts" link
 Then I should close the browser