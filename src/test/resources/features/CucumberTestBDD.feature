Feature: BDD for Demo

  Background: Demonstrating Cucumber Integration with SpringBoot and Maven
    Given You have already added pom file

  Scenario: Adding two numbers and assert the result
    When variable A initialized with value 100
    When variable B initialized with value 200
    And operation is ADDITION
    Then Output will be 300

  Scenario: Subtracting two numbers and assert the result
    When variable A initialized with value 200
    When variable B initialized with value 100
    And operation is SUBTRACTION
    Then Output will be 100