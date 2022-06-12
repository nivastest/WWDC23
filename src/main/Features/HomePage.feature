Feature: check the functionality in for homepage
  Scenario: check it is facebook page
    Given I  u open browser
    When I enter homepage url
    And I validate home page
    Then I c close browser