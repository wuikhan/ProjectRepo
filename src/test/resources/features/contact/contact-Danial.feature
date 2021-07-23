#Author: SuuperDan
Feature: Test Functionality of Contact page

  @con
  Scenario: As a basic user User should be able to create a Contact object
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username And I enter "Welcome2" password
    When I click the "Login" button
    Then I should click the "Contacts " link
    When I click the "new" button
    Then I should see the "New Contact" text
    Then I should enter "Dan" in the field with tab index of "3"
    When I click the "save" button
    Then I should see selected value in the "con2_ileinner" field
    Then I should close the browser