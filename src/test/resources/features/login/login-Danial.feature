
Feature: Test the login functionality
		@log
    Scenario: as a valid user I should be able to log in to the app
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I should see the "Home" link
   Then I should close the browser
	@log
  Scenario: As an invalid user, I should not be able to login to the app
    Given I open "chrome" browser
    And I enter "Inuefwuehfiwuhe" password
   When I click the "Login" button
    Then I should see the "Please check your username and password. If you still can't log in, contact your Salesforce administrator." error message
   Then I should close the browser
  