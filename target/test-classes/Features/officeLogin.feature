
Feature: login functionality test
#  @smoke
  Scenario: Check login with valid credentials

    Given user is on login page
    When user enters valid username and password
    Then user is navigated to the home page

