#Author: your.email@your.domain.com
@tag
Feature: add account information

  @tag1
  Scenario: create new account
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    And I click on the "Accounts" Tab
    And I click the " New " button
    And i enter acount name input field
    And i enter acount number input field
    And i enter account site input field
    And i add annual revenue input field
    And i add phone input field
    And i add fax input field
    And i add website input field
    And i add SIC code input field
    And i should see the below drop down values for "00N3t00000LA9IN" field
      | --None-- |
      | Gold     |
      | Silver   |
      | Platinum |
      | Bronze   |
    Then i click the " Save " button
