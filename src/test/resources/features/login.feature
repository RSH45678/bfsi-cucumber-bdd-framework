Feature: Login Feature

  Scenario: Successful Login

    Given user is on login page
    When user enters valid username and password
    Then user should navigate to home page