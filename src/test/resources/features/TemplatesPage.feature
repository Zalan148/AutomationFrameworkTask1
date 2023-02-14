Feature: Test Templates Page features
  As a user of Trello
  I would like to be able to choose a category template
  So that I can save time creating one myself

  Background:
    Given I have logged in successfully
    And   I am on the Templates page


    Scenario Outline: Templates by category are able to be accessed from the featured categories on the templates page
    When I select "<category>" from the featured categories
    Then the template gallery for "<category gallery>" is displayed

    Examples:
      | category        |category gallery    |
      | Business        |Business templates |
      | Design          |Design templates |




  Scenario Outline: Templates by category are able to be accessed from the left menu on the templates page
      When I select "<category>" from the left hand side menu
      Then the template gallery for "<category gallery>" is displayed

      Examples:
        | category        |category gallery    |
        | Marketing       |Marketing templates |
        | Education       |Education templates |










