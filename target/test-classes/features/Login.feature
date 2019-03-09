
Feature: login functionality
  Background:automatically gets in crm module every time
    Given the user goes to url
    When the "user" enters valid email and password
    When the user clicks on CRM module

  Scenario: Check customer creation functionality
    And the user clicks on Customers page
    Then the user clicks on Create button -Customers
