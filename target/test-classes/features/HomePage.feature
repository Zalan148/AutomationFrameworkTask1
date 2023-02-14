
Feature: Test Home Page features
    As a user of Trello
    I would like to be able to create a new board from the home page
    So that I can track progress of tasks

    Background:
      Given I have logged in successfully
      And I am on the Home page

    Scenario: A board can be created from the home page
      When I click on the Create a board link
      And  Enter a board title
      And  Click Create Board button
      Then A board is created









