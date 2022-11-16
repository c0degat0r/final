#Author: your.email@your.domain.com
@tag
Feature: leads profile

  @tag1
  Scenario: create lead profile
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    And I click on the "Leads" Tab
    And I click the " New " button
    And i enter first name input field
    And i enter last name input field
    And i enter company input field
    And i enter title input field
    And i enter campaign input field
    And i enter annual revenue input field
    And i enter phone input field
    And i enter mobile input field
    And i enter fax input field
    And i enter email input field
    And i enter website input field
    And i enter no. of employees input field
    And i enter street input field
    And i enter city input field
    And i enter state/province input field
    And i enter zip/postal code input field
    And i enter country input field
    And i enter SIC input field
    And i enter number of locations input field
    And i enter current generator input field
    And i enter description input field
    Then i click the " Save " button
