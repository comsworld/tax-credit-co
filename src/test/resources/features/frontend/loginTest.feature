@UITest
Feature: Login Action

  Scenario Outline: Login with Valid Credentials
    Given User navigates to Home Page using <browser>
    When User enters UserName
    And User enters Password
    Then Message displayed Login Successfully

    Examples:
    |browser|
    |chrome |
#    |firefox|
#    |ie     |


  Scenario: LogOut
    Given User is logged in
    When User LogOut from the Application
    Then Message displayed LogOut Successfully