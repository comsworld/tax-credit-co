@NewRegistration
Feature: New Registration

  Scenario Outline: : User navigates to new registration page
    Given User navigates to Home Page using <browser>
    When User clicks on new registration link
    Then User is taken to New Registration page
#
    Examples:
      |browser|
      |chrome |
#    |firefox|
#    |ie     |

  Scenario: User fills required fields in New registration form
    Given The user is on the new registration page
    When User enters Name
    And User selects България nationality from dropdown
    And User enters Personal ID Number 7511133333
    And User enters User Name SomeUsername
    And User enters email test@gmail.com
    And User enters new password SomePassword
    And User confirms password SomePassword
    And User check Terms and Conditions box
    And User checks the privacy policy box
    And User click on cancel button
    Then User is taken to home page