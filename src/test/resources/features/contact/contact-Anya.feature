#Author: Anya caramelkaya@gmail.com

Feature: Verify contacts object field

  @contactFeature
  Scenario: As a basic user, I should be able to create contact object
    Given I open "chrome" browser
    And I visit the "qa" environment
    And I enter "test.user@gmail.com.test" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I should see the "Home" link
    And I click the "Contacts" link in the menu
    When I click the "new" button
    Then I should see " New Contact" text
    And I select "Mrs." for the "name_salutationcon2" dropdown field
    And I will enter "Maria" in the "name_firstcon2" field
    And I select "Partner Referral" for the "con9" dropdown field
    And I will enter "Allen" in the "name_lastcon2" field
     And I will enter "Prority" in the "con5" field
     When I click on "Account Name Lookup" magnifying glass
     Then I should see new "Lookup" window 
     And I will enter "Anuta" in the "lksrch" field
     When I click the "new" button
    Then I should see the new "Results" fiels output
  And I will enter "Anuta" in the "Account Name" field
    When I click the "save" button
    Then I should see "Edit" button is visible