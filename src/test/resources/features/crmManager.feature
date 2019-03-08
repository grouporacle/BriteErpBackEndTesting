Feature: BriteErp Application Database and UI data verification

  Background:
    Given the user goes to url
    When the "crm manager" enters valid email and password
    When the user clicks on CRM module
    Then the manager goes to the activity type page

  Scenario: Department data UI and Database verification
    When I search for name
    Then UI data and Database data must match