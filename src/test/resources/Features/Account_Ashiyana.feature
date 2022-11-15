
@tag
Feature: As an authenticated user, I should be able to open Accountfield


  
   Scenario: Account number field ,I am able to field numberfield and able to see record.
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    And i click on account tab
    When I clicked the New  button
    When I should see account name field
    When I enter "Ashiyana" account name field 
    When I Add Account site input field
    And I also Add Annual revenue input field
    And I  Add Phone input field
    And Add Fax input field
    And Add Website input field
    And   Add SIC code input field
    When I add SLA serial number input field
     And I click the save button
     And I should see the record
     
   
    

 