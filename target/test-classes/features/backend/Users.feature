@APITest
Feature: Test for user get
#THis is a sample test case to set up and configure Cucumber, Gherkin and Java using Spring Boot.
#Make sure that the annotation dictates if the test is an API test or a UI test. this is used by the runner to decide how to run the test.

#  Scenario: Test post user
#    Given I have a user with id 1031 and body Blah Blah Blah and title Hello world of API testing
#    And I post user information for userId 1031
#    Then Response status is 201
#    And User title is Hello world of API testing
#    And User body is Blah Blah Blah
#    And User id is 1031


#  Scenario: Test all users get
#    Given I request users information
#    Then I get users information


  Scenario: Test individual user get
    Given I request user information for userId 100
    Then Title contains at nam consequatur ea labore ea harum


#  Scenario: Test individual user get
#    Given I request patients information
#    Then Risk score is not null
#    And id is 21


