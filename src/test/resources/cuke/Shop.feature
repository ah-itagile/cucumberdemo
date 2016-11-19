Feature: Shop

  Scenario: add item to cart
    Given I add item for 42 EUR to my cart
    And I add item for 2 EUR to my cart
    Then the sum of my shopping cart should be 43
