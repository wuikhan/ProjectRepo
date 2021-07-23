#Author: Ken Kim

Feature: Test the create of an Opportunity

	@regression
	Scenario: As a basic user , User should be able to create an opportunity object.
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I click the "Opportunities Tab" tab
    Then I click the "new" button
    Then I enter "Best Buy Inc." for the "opp3" field
    And I enter "7/25/2021" for the "opp9" field
    And I select "Qualification" for the "opp11" field
    Then I click the "save" button
    Then I should see the the "Edit" button