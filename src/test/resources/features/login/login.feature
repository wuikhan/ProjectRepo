#Author: waqas.khan@codegator.us
Feature: Test the login functionality

  Scenario: As a basic user, I should be able to login to the app
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I should see the "Home" link
    And I take a screenshot with the file name as "login"

  Scenario: As an invalid user, I should not be able to login to the app
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Inuefwuehfiwuhe" password
    When I click the "Login" button
    Then I should see the "Please check your username and password. If you still can't log in, contact your Salesforce administrator." error message
