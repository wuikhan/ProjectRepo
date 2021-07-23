#Author: SuuperDan
Feature: Testing Functionality of Opportunity page

  @opps
  Scenario: As a basic user User should be able to create an opportunity object
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username And I enter "Welcome2" password
    When I click the "Login" button
    Then I should click the "Opportunities " link
    When I click the "new" button
     Then I should see the "New Opportunity" text
    Then I should enter "SuuperDan" in the "Opportunity Name" field
    Then I should select  date using link
    Then I should verify the values in the dropdown and select "Prospecting"
     When I click the "save" button
     Then I should see selected value in the "opp3_ileinner" field
     Then I should close the browser