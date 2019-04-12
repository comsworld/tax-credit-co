@LoginTest
Feature: Login Action

  Scenario Outline: Login with Valid Credentials
    Given User navigates to Home Page using <browser>
    When User enters UserName
    And User enters Password
    Then Validate username Kostadin Mladenov is displayed

    Examples:
    |browser|
    |local  |
#    |chrome |
#    |firefox|
#    |ie     |


  Scenario: LogOut
    Given User is logged in as Kostadin Mladenov
    When User LogOut from the Application
    Then Message displayed LogOut Successfully