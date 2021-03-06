#Author: Anya caramelkaya@gmail.com
Feature: Verify contact object fields and drop down values

  @contactFeature
  Scenario: As a basic user, User should be able to create contact object
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I should see the "Home" link
    And I click the "Contacts" link in the menu
    When I click the "new" button
    Then I should see "New Contact" text
    And I type "Allen" in the "Last Name" field for Contact object
   When I click on the "lookupIcon" field
   Then I should see "Contact Edit" text on the new page
   When I click the "new" button
   Then I should type "Allure" name in the "Account Name" field for Contact object
   When I click the "save" button
   Then I should see "Allure" text in the "con4" field
    When I click the "save" button
    Then I should see "Edit" button is visible
