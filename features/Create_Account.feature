Feature: Create Account feature

  @tag2
  Scenario: Create Account test scenario
    Given I open Macys page
    And Mouse Hover on Sign In
    And Click on SignIn link
    And click on create account button
    When I fillup the createaccount form
    Then I click on create account button
    And close the browser
