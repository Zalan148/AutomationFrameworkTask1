
Feature: Test Logout functionality
  As a user of Trello
  I would like to be able to logout of Trello
  So that nobody else can access my account
  @zalantest
  Scenario: Able to logout successfully
    Given I have logged in successfully
    And I am on the Home page
    When I click on the Account icon
    And Click on the Logout link
    Then I am logged out of Trello and log out of your Atlassian account page is displayed

