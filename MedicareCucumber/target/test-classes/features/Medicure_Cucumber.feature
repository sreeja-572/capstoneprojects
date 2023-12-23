Feature: To test medicare apis for capstone project

  Scenario: Retrieve the list of all products in the store
    Given User Enters Medicare base URL and Authorization
    When User executes HTTP get method
    Then Validate the response status code

  Scenario: Retrieve the list of all registered users
    Given User Enters Medicare base URL and Authorization
    When User executes HTTP get method
    Then Validate the response status code

  Scenario: Add the product
    Given User Enters Medicare base URL and Authorization
    When User executes HTTP post method
    Then Validate the response status code

  Scenario: Update the product
    Given User Enters Medicare base URL and Authorization
    When User executes HTTP put method
    Then Validate the response status code

  Scenario: Update the product status
    Given User Enters Medicare base URL and Authorization
    When User executes HTTP put method
    Then Validate the response status code

  Scenario: Delete the product
    Given User Enters Medicare base URL and Authorization
    When User executes HTTP Delete method
    Then Validate the response status code
