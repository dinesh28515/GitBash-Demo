Feature: application
  Scenario Outline: login application
    Given user is on login page
    When user enter "<username>" and "<password>"
    Then use is on homePage
    Examples:
    |username|password|
    |Admin   |admin123|