
  Feature: Verification DataBase and UI data verification (user perspective)

    Background:
      Given the user goes to url
      When the "user" enters valid email and password and goes to CRM module
      And  the user clicks on Customers page
      Then the user clicks on Create button

      Scenario: Customer Info Card entered information UI and DataBase verification
        Given user is on Create Customer Info Card
        When user fills out required fields
        Then the same data should be stored in Database