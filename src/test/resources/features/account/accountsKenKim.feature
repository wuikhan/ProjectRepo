#Author: Ken Kim

Feature: Test the create of an Account

	@regression
	Scenario: As a basic user , User should be able to create an account object.
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I click the "Accounts Tab" tab
    Then I click the "new" button
    Then I enter "Best Buy Inc." for the "acc2" field
    Then I click the "save" button
    Then I should see the the "Edit" button

	@regression
  Scenario: As a basic user, I should be able to see the --None--, No, and Yes values in the drop down field
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I click the "Accounts Tab" tab
    Then I click the "new" button
    Then I should see the values for the "00N2E00000D7LOy" field
    | --None-- |
    | No       |
    | Yes      |
    Then I close the browser
    
	@regression
  Scenario: When a user creates an Account with an Active Drop down value as “Yes”, then he should see the “Yes” value once the page is saved.
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I click the "Accounts Tab" tab
    Then I click the "new" button
    Then I enter "Best Buy Inc." for the "acc2" field
    And I select "Yes" for the "00N2E00000D7LOy" field
    Then I click the "save" button
    Then I should see the value "Yes" in the "00N2E00000D7LOy_ileinner" ID field
    Then I close the browser
    
	@regression
	Scenario: When a user creates an Account with an Active Drop down value as “No”, then he should see the “No” value once the page is saved.
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I click the "Accounts Tab" tab
    Then I click the "new" button
    Then I enter "Best Buy Inc." for the "acc2" field
    And I select "No" for the "00N2E00000D7LOy" field
    Then I click the "save" button
    Then I should see the value "No" in the "00N2E00000D7LOy_ileinner" ID field
    Then I close the browser
    
    @regression
    Scenario: When a user creates an Account with an Active Drop down value as “--None--”, then he should not see any value for the Active Drop down field once the record is saved.
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I click the "Accounts Tab" tab
    Then I click the "new" button
    Then I enter "Best Buy Inc." for the "acc2" field
    Then I click the "save" button
    Then I should see the the "Edit" button
    Then I close the browser
    
	@regression
	Scenario: Active Drop down is not a required field.
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I click the "Accounts Tab" tab
    Then I click the "new" button
    Then I enter "Best Buy Inc." for the "acc2" field
    Then I click the "save" button
    Then I should see the the "Edit" button