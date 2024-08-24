Feature: Login test

  Scenario: I login with valid credential
    Given I am on login page
    And User enter username
    And user enter password
    When user able to see home page
    Then User check title