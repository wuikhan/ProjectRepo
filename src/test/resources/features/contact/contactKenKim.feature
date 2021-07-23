#Author: Ken Kim

Feature: As a basic user, User should be able to create contact object.

	@regression
	Scenario: As a basic user , User should be able to create an opportunity object.
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I click the "Contacts Tab" tab
    Then I click the "new" button
    Then I enter "Kim" for the "name_lastcon2" field
    Then I click the "save" button
    Then I should see the the "Edit" button