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

 #@SmokeTest
  Scenario: Verify First Name Field
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
    When I see "name_firstlea2" field
    Then I send "Nancy" into "name_firstlea2" field
#@SmokeTest
  Scenario: Verify Salutation Drop-Down
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
    Then I should see the below drop down values for "name_salutationlea2" field
      | --None-- |
      | Mr.      |
      | Ms.      |
      | Mrs.     |
      | Dr.      |
      | Prof.    |
    And I should be able to select "Ms." from a "name_salutationlea2" field
		 #@SmokeTest
  Scenario: Verify Last Name Field
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
    When I see "name_lastlea2" field
   ## Then I verify if the "requiredBlock" in the "name_lastlea2" field is visible 
    Then I send "Nancy" into "name_firstlea2" field