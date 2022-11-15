
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: As an authenticated user, I should be able to login
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    And I click the Account Tab
    When I click the " New " button
    Then I should see the account number field
    And I enter "Juancho" in the account name field
    When I enter "12345" in the account number field
    And I enter "Codegator" in the account site field
    Then I enter "100K" in the annual revenue field
    And I enter "123456789" in the phone number field
    Then I enter "0987654321" in the fax number field
    And I enter "example.com" in the website field
    Then I enter "23434" in the sic code
    When I click the save button 
    Then I should see the record is saved 
  

 