Feature: Link & Images broken test

  @tag20
  Scenario: Links&Images test scenario
    Given I open the macys webpages
    When I validate the broken links & images
    Then I close macys webpages
