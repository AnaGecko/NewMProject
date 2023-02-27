
Feature: Contact Us

    Scenario: Invalid email

    Given user is on the page
    And fill all the required fields
    When user click on Send
    Then an error message is presented in the screen

#Examples:
#    | username  | password |
#    | test@test | 123      |


