
@tag
Feature: Verify that Lead fields are visible

  
  Scenario: After loggin in, I should see and click Lead Tab 
  	Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    Given I click the Lead Tab
    Then I see the Lead Home page title
   
  Scenario: After click on Leads Tab, create new Lead Account
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    Given I click the "Lead" Tab
    Then I see the "Lead" Home page title
  	When I click the "New" button
    Then I see "New Lead" page title
  @SomeTest 
 Scenario: After create new Lead Account, verify first name
     Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    Given I click the Lead Tab
    Then I see the Lead Home page title
  	When I click the New button
    Then I see New Lead page title
    And I click on First name
    
   

  