Feature: Check Balance

  Scenario: View account balance

    Given user logged into application
    When user clicks on Accounts Overview
    Then account balance should be displayed