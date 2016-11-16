Feature: Shop

  Scenario: add item to cart
    Given I add 42 to my cart
    Then the sum of my shopping cart should be 43
