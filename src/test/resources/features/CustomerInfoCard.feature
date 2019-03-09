Feature:

@login

  Scenario Outline: The user fills out required lines from excel "Phase V", "CustomerInfoCard1" sheet
  Given the user goes to url
  When the "user" enters valid email and password
    Then "User" clicks on "CRM" module
    And "User" clicks on "Customers" page
    When "User" clicks on "Create" button
    Then "User" sendKeys "<information>" from excel "Phase V", "CustomerInfoCard1" sheet
    And "User" clicks "Save" button
    Then "User" should be able to see "<information>" on page from excel "Phase V", "CustomerInfoCard1" sheet
    Then "User" should be able to see "<information>" in Database from excel "Phase V", "CustomerInfoCard1" sheet
    Examples:
      | information |
      | 0           |
      | 1           |
      | 2           |
      | 3           |
      | 4           |
      | 5           |
      | 6           |
      | 7           |
      | 8           |
      | 9           |
      | 10          |

