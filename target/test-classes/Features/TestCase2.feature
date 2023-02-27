
Feature: Leadership and FB

  Scenario: Check Leadership and FB page

    Given user is on home page
    When user click on Company
    And verify URL and Leadership section
    Then click on FB page
    And verify that a new page is opened in new browser

#    Examples:
#      | username | password |
#      | dentalone@mailinator.com | Gecko123 |
