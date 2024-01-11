@smoke
Feature: forget password Test Case
  Background: user open browser
    Given user navigates to the login form for recovery

    Scenario: user reset the password successfully
      When user click on forget password
      And user fill email section with a valid email
      Then user click on recovery button
      And message shows successfully