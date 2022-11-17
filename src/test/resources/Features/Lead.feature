
@tag
Feature: Verify that Lead fields are visible

  Scenario: Create New Leads Account
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    Given I click the "Leads" tab
    Then I see the "pageDescription" Home page title
    When I click the " New " button
    Then I see the "pageDescription" Home page title
@Tag1
 Scenario: Verify First Name Field
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    Given I click the "Leads" Tab
    Then I see the "pageDescription" Home page title
    When I click the " New " button
    Then I see the "pageDescription" Home page title
    When I see "id" field
    Then I send "input"
   
 Scenario: Verify Salutation Drop-Down
  Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    Given I click the "Leads" Tab
    Then I see the "Leads" Home page title
    When I click the "New" button
    Then I see the "New" Home page title
   	Then I should see the below drop down values for "00N3t00000LA9IN" field
      | --None-- |
      | Gold     |
      | Silver   |
      | Platinum |
      | Bronze   |
    And I should be able to select "Gold" from a "00N3t00000LA9IN" field
    
    
   

  