Feature: Verify account object fields and dropdown values

	@newFeature
  Scenario: As a basic user, I should be able to create an account object
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I should see the "Home" link
    And I click the "Accounts" link in the menu
    When I click the "new" button
    Then I should see "New Account" text
    And I enter "Hello World" in the "Account Name" field
    When I click the "save" button
    Then I should see "Edit" button is visible
    And I take a screenshot with the file name as "account"
    
