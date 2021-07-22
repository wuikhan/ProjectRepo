#Author: caramelkaya@gmail.com
Feature: Verify opportunity object fields and drop down values

  @opportunityFeature
  Scenario: As a basic user, I should be able to create an opportunity object
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I should see the "Home" link
    And I click the "Opportunities" link in the menu
    When I click the "new" button
    Then I should see "New Opportunity" text
    And I enter "Welcome123" in the "Opportunity Name" field
    And I select "2/22/2022" in the "Close Date" calendar field
    And I select "Qualification" for the "opp11" dropdown field
    When I click the "save" button
    Then I should see "Edit" button is visible
