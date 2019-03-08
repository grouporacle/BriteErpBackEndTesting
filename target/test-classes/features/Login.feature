
@BRIT-4441
  Feature: login functionality
    Background:
      Given the user goes to url
      When the "user" enters valid email and password
      When the user clicks on CRM module
      And the user clicks on Customers page
      Then the user clicks on Create button -Customers


      Scenario: user login
        When the "user" enters valid email and password