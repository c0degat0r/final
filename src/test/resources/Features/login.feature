#Author: AimalFaiq

@tag
Feature: As an authenticated user, I should be able to login to the application

  @tag1
  Scenario: As an authenticated user, I should be able to login
    Given I open "chrome2" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    And I click the account tab
    When I click the " New " button
    
    @tag2
  Scenario: As an authenticated user, I should be able enter data
    Given I open "chrome2" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    And I click the account tab
    When I click the " New " button
    Given I enter account name
    And I enter account number
    When I enter phone number
    When I click the save button
  
  