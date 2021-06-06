Feature: Zadanie Zalicz 1 Chetni

  Scenario Outline: user adds address to the account
    Given an open browser
    When user enters username and password
    When user clicks Addresses
    When user enters "<address>" and "<postcode>"
    When used enters "<city>"
    When user chooses country
    And user clicks save
    Then the result should contain "<added>"
    When user clicks delete
    Then the result should contain "<deleted>"
    And close browser

    Examples:
      |address   | postcode | city  | added | deleted
      |Jurassic  | 222-33   | Park  | added | deleted
      |Twin      | 156-23   | Peaks | added | deleted
