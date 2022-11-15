#Author: your.email@your.domain.com

@tag
Feature: As an authenticated user, I should be able to login to the application

  @tag
  Scenario: As an authenticated user, I should be able to login
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    When I click the " New " button
    Then I should see the account number field
    And I enter "EdwardGuti" in the account name field
    When I enter "54321" in the account number field
    When I click the save button
    Then I should see the record is saved
    
    
   
    
    
    
    