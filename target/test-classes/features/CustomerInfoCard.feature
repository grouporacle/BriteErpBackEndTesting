Feature:


  @BRIT-4441
  Scenario Outline: The user fills out required lines from excel "Phase V", "CustomerInfoCard1" sheet
    Given the user is on Customers page
    When the user clicks on Create button
    When "User" sendKeys "<information>" from excel "Phase V", "CustomerInfoCard1" sheet
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

