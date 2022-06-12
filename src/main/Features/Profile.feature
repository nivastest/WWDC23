Feature: check the functionality in for homepage
  Scenario: check for the profile page
    Given I  m open browser
    When I was profile enter url
    And I validate profile page
    Then I i close browser