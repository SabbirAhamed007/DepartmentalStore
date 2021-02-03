Feature: Test Macysdepartmentalstore

  @tag1
  Scenario: Smoke Test of Macysdepartmentalstore scenario
    Given I want to open chrome browser
    When I verify shop by department button
    Then I close the browser
