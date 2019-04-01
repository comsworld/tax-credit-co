@NewRegistration
Feature: New Registration

  Scenario Outline: User navigates to new registration page
    Given User navigates to Home Page using <browser>
    When User clicks on new registration link
    Then User is taken to New Registration page

    Examples:
      |browser|
      |chrome |
#    |firefox|
#    |ie     |

  Scenario: User fills required fields in New registration form
    Given The user is on the new registration page
    When User enters Name
    And User selects nationality from dropdown
    And User enters Personal ID Number
    And User enters User Name
    And User enters email
    And User enters new password
    And User confirms password
    And User check Terms and Conditions box
    And User checks the privacy policy box
    And User click on cancel button
    Then User is taken to home page