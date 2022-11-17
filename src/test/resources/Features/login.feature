#Author: your.email@your.domain.com
@tag
Feature: As an authenticated user, I should be able to login to the application

  @tag1
  Scenario: As an authenticated user, I should be able to login
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard