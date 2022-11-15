
@tag
Feature:  As an authenticated user, I should be able to open Lead
  @SmokeTest
  Scenario: Lead field ,i should able to add Lead field
   Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    When I click on Lead field
    And I click on new button
    When I add Salutation on the Lead field
    And I field out first name