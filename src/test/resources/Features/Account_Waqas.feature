Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: As an authenticated user, I should be able to login
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    When I click the "Accounts" tab
    And I click the " New " button
    Then I should see the below drop down values for "00N3t00000LA9IN" field
      | --None-- |
      | Gold     |
      | Silver   |
      | Platinum |
      | Bronze   |
    Then I should see the below drop down values for "00N3t00000LA9IK" field
      | --None-- |
      | No       |
      | Yes      |
      
     