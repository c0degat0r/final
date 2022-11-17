@tag
Feature: Verify that Account Number input field is present

  Scenario: After loggin in, I should see and click Accounts Tab
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    Given I click the Accounts Tab Tab button
    Then I see the Accounts Home page title
    When I click the New button
    Then I see New Account page title
    Then I enter "Nancy"  Account Name
    Then I enter "12345678910" Account Number
    Then I enter "Headquarters" Account Site
    Then I enter "1,000,000.00" Annual Revenue
    Then I enter "(703)444-8889" Phone
    Then I enter "(703)444-8889" Fax
    Then I enter "www.FakeWebsite.com" Website
    Then I enter "5812" SIC Code
    Then I click the Save button

  Scenario: just Log In
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    Given I click the Accounts Tab Tab button
    Then I see the Accounts Home page title
    When I click the New button
    Then I see New Account page title

  Scenario: verify SLA drop down values
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    When I click the "Accounts" tab
    And I click the New button
    Then I see New Account page title
    Then I should see the below drop down values for "00N3t00000LA9IN" field nancy
      | --None-- |
      | Gold     |
      | Silver   |
      | Platinum |
      | Bronze   |
    And I should be able to select "Gold" from a "00N3t00000LA9IN" field

  Scenario: verify Active drop down values
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    When I click the "Accounts" tab
    And I click the New button
    Then I see New Account page title
    Then I should see the below drop down values for "00N3t00000LA9IK" field
      | --None-- |
      | No       |
      | Yes      |
    And I should be able to select "Yes" from a "00N3t00000LA9IK" field

 
  Scenario: verify Rating drop down values
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    When I click the "Accounts" tab
    And I click the New button
    Then I see New Account page title
    Then I should see the below drop down values for "acc9" field
      | --None-- |
      | Hot      |
      | Warm     |
      | Cold     |
    And I should be able to select "Hot" from a "acc9" field

 
  Scenario: verify Industry drop down values
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    When I click the "Accounts" tab
    And I click the New button
    Then I see New Account page title
    Then I should see the below drop down values for "acc7" field
      | --None--           |
      | Agriculture        |
      | Apparel            |
      | Banking            |
      | Biotechnology      |
      | Chemicals          |
      | Communications     |
      | Construction       |
      | Consulting         |
      | Education          |
      | Electronics        |
      | Energy             |
      | Engineering        |
      | Entertainment      |
      | Environmental      |
      | Finance            |
      | Food & Beverage    |
      | Government         |
      | Healthcare         |
      | Hospitality        |
      | Insurance          |
      | Machinery          |
      | Manufacturing      |
      | Media              |
      | Not For Profit     |
      | Recreation         |
      | Retail             |
      | Shipping           |
      | Technology         |
      | Telecommunications |
      | Transportation     |
      | Utilities          |
      | Other              |
    And I should be able to select "Food & Beverage" from a "acc7" field

  @
  Scenario: verify Type drop down values
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome1" password
    When I click the "Log In" button
    Then I should see the dashboard
    When I click the "Accounts" tab
    And I click the New button
    Then I see New Account page title
    Then I should see the below drop down values for "acc6" field
      | --None--                   |
      | Prospect                   |
      | Customer - Direct          |
      | Customer - Channel         |
      | Channel Partner / Reseller |
      | Installation Partner       |
      | Technology Partner         |
      | Other                      |
    And I should be able to select "Prospect" from a "acc6" field
