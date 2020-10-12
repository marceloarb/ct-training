Feature: Homepage load with all products
  @SeleniumTest
  Scenario: Validate products in homepage
    Given User is on loading homepage
    When Homepage is loaded
    Then All products all displayed