
Feature: Test Login functionality
  As a user of Trello,
  I want to be able to enter my login credentials,
  So that I can access the boards page



  Scenario: Able to login with correct credentials
    Given I am on the Trello login page
    When I enter valid login credentials
    And submit the details
    Then I arrive at the Boards page

  Scenario: Continue button remains displayed when no username entered
    Given I am on the Trello login page
    When I enter no Username
    And Click the Continue button
    Then Continue button remains displayed

  Scenario Outline: Unable to login with invalid credentials
    Given I am on the Trello login page
    When I enter "<username>" and "<password>"
    And submit the invalid details
    Then an error message will be displayed

    Examples:
    |username    |password   |
    | xyz        |           |
    | qwert      | abc       |


