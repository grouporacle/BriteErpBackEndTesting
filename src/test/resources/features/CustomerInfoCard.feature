
Feature: BriteErp Database and UI Data verification (user perspective)

  #Background:
   # Given the user goes to url
   # When the "user" enters valid email and password
   # When the user clicks on CRM module
  #  And the user clicks on Customers page
  #  Then the user clicks on Create button -Customers
  @BRIT-4441
  Scenario: The user fills out required lines from excel "Phase V", "CustomerCardInformation" sheet
   # Given the user is on Customers page

    When "User" sendKeys "fill all lines out" from excel "Phase V", "CustomerCardInformation" sheet
    #When "User" clicks "Save" button
   # Then "User" should be able to see "all new information" on page from excel "Phase V", "CustomerCardInformation" sheet
   # Then "User" should be able to see "all new information" in Database from excel "Phase V", "CustomerCardInformation" sheet