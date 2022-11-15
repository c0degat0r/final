#Author: Mohamed Abdelhaye
@SmokeTest
Feature: I want to be able to enter my account info

  @SmokeTest1
  Scenario: Afeter logged in, I should be enter a new account info
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    And I click the accounts tab
    When I click the " New " button
    And I Enter "MoAbdelhaye" Account name
    Then I Enter the "9090909090" account number
    And I Enter the "unknown" account Site
    And I Enter the "1000000" Annaul revenue
    Then I Enter the "010101010101" Phone number
    And I Enter the "0000000000" Fax number
    And I Enter the "www.moAbdelhay.com" website
    And I Enter the "22222222222" SIC code
    And I should see the following values for "00N3t00000LA9IN" field
      | --None-- |
      | Gold     |
      | Silver   |
      | Platinum |
      | Bronze   |
    Then I click the " Save " save button
    And I should see the reccord I saved
