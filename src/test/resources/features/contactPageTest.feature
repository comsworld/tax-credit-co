@ContactTest
Feature: Contact Page

  Scenario Outline: Navigate to Contact page
    Given User navigates to Home Page using <browser>
    When User clicks on Contact button
    Then User is taken to Contact page
    When User enters name test
    And User enters title test
    And User enters email test@test.com
    And User enters phone 333-555-4444
    And User enters company name test
    And User enters company size test
    And User enters state CA
    And User enters industry test
    And User enters additional info test test test
    And User click on Submit button
    Then Message displayed Thanks for reaching out! A representative will be in touch shortly.


    Examples:
      |browser|
      |chrome |
 #     |firefox|
 #  Uncomment above line to test with Firefox browser
