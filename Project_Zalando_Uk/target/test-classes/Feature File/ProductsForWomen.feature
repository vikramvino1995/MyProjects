@Feature2
Feature: Women Customer should able to select Products.

  Background: 
    Given Customer should able to Launch GC Browser and enter Zalando Url

  Scenario: Women Customer should able to search and select a single product
    When User should select the Customer Type as Women and search for womenProduct
      | Jean Jacket |
      | nina Shirt  |
      | tshirt      |
    And Women User should able to select a product
    And Women User should able to view the product details page
    Then Women User should able to close the browser

  Scenario: Women Customer should  able to search and select multiple product
    When User should select the Customer Type as Women and search for more than one womenProduct
      | Jean Jacket |
      | Shirt       |
      | tshirt      |
    And Women User should able to select and view multiple products in different tabs
    And Women User should able to finalize from selected multiple product
 
