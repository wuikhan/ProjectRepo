#Author: waqas.khan@codegator.us
Feature: Test the login functionality

  Scenario: As a basic user, I should be able to login to the app
    Given I open "chrome" browser
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "login" button
    Then I should see the "dashboard" link

  Scenario: As an invalid user, I should not be able to login to the app
    Given I open "chrome" browser
    And I enter "test.user@gmail.com.test" username
    And I enter "Inuefwuehfiwuhe" password
   When I click the "login" button
    Then I should see the "Error message" error message
