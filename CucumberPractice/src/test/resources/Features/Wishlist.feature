Feature: User should able to add a product to wishlist

  Scenario: User should able  to add a product to wishlist after selecting product and size
    Given User should be in zalando website
    When User should search for a product
    And User should able to view the search results page
    And User should able to select a particular product
    And User should able to select the size of the product
    And User should able to add that particular product to wishlist

    
    Scenario: User should able  to add a product to wishlist after selecting product and reached the cart page
    Given User should be in zalando website
    When User should search for a product
    And User should able to view the search results page
    And User should able to select a particular product
    And User should able to select the size of the product
    And User should able to select the my cart button
    And User should now able to add product to wishlist from mycart page
    
    
    
    
    