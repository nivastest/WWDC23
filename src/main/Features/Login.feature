Feature: login to facebook
  Scenario: check it is facebook page
    Given I open browser
    When I enter url
    And I validate page
    Then I close browser