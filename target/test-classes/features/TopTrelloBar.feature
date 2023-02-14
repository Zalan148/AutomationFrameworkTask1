Feature: Test Top Trello Navigation Bar
  As a user of Trello
  I would like to be able to access the main features of Trello from the top navigation bar visible from any page
  So that I can easily access the main features from a common location

  Background:
    Given I have logged in successfully

  Scenario: Able to access More options from Atlassian from top navigation bar
    And I am on the Home page
    When I click the dots icon from the top navigation bar
    Then the More from Atlassian menu options are displayed

  Scenario: Able to select a search result in the top navigation bar
    And I am on the Templates page
    When I enter search criteria into the search box
    Then able to select a search result

  Scenario: Able to access Information menu options from top navigation bar
    And I arrive at Boards page
    When I click on the information icon
    Then information menu options are displayed

  Scenario: Able to access Notifications menu options from top navigation bar
    And I arrive at Boards page
    When I click on the Notifications icon
    Then notification menu options are displayed

  Scenario: Able to access Account menu options from top navigation bar
    And I am on the Home page
    When I click on the Account icon
    Then account menu options are displayed
  @zalantest
  Scenario: Able to access Your Workspace menu options from top navigation bar
    And I am on the Templates page
    When I click on the Workspaces dropdown
    Then my workspaces are displayed


