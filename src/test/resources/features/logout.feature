Feature: Logout Feature

  Scenario: Logout from application

    Given user already logged in
    When user clicks logout
    Then user should logout successfully