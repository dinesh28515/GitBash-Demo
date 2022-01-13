Feature: Data Table application

  Scenario: HRM application
    Given user is on login page
    When user enter credentials
      | Admin | admin123 |
    Then user is on home page

