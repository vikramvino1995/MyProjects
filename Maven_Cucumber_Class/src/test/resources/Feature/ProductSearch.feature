Feature: All types of Customers(Men,Women,Kids) should able to search their desired product in Zalando.co.uk.

  Scenario Outline: All types of customers should able to search valid product using search Bar
    Given Customer should able to Launch GC Browser and enter Zalando Url "<Zalando Url>"
    When User should select the Customer Type as Women and search for womenProduct in search bar "<productForWomen>"
    And User should able to view the  women products in search results
    And User should revert back to Homepage, select the Customer Type as Men and search for menProduct in search bar"<productForMen>"
    And User should able to view the men products in search results
    And User should revert back to Homepage ,select the Customer Type as Kids and search for kidsProduct "<productForKids>"
    And User should able to view the kids products in search results
    Then User should able to close the browser

    Examples: 
      | Zalando Url                | productForWomen | productForMen | productForKids |
      | https://www.zalando.co.uk/ | Jean Jacket     | Polo Shirts   | t-Shirts       |

  Scenario: All types of customers should able to search valid product using product list
    Given Customer should able to Launch GC Browser and enter Zalando Url
    When User should select the Customer Type as Women and search for womenProduct by selecting the product from product list
    And User should able to view the  women products in search results
    And User should revert back to Homepage, select the Customer Type as Men and search for menProduct by selecting the product from product list
    And User should able to view the men products in search results
    And User should revert back to Homepage ,select the Customer Type as Kids and search for kidsProduct by selecting the product from product list
    And User should able to view the kids products in search results
    Then User should able to close the browser

  Scenario: All types of customers should able to search product using Hero Image.
    Given Customer should able to Launch GC Browser and enter Zalando Url
    When User should select the Customer Type as Women and search for womenProduct by selecting the hero Image.
    And User should able to view the women products displayed
    And User should revert back to Homepage, select the Customer Type as Men and search for menProduct by selecting the hero Image
    And User should able to view the men products displayed
    And User should revert back to Homepage ,select the Customer Type as Kids and search for kidsProduct by selecting the hero Image
    And User should able to view the kids products displayed
    Then User should able to close the browser

  Scenario: All types of customers should able to select suggested product.
    Given Customer should able to Launch GC Browser and enter Zalando Url
    When User should select the Customer Type as Women and search for womenProduct by selecting the suggested product
    And User should able to view the selected womens product details page
    And User should revert back to Homepage, select the Customer Type as Men and search for menProduct by selecting the suggested product
    And User should able to view the selected mens product details page
    And User should revert back to Homepage ,select the Customer Type as Kids and search for kidsProduct by selecting the suggested product
    And User should able to view the the selected kids product details page
    Then User should able to close the browser

  Scenario Outline: All types of customers should not be able to search invalid product using search Bar
    Given Customer should able to Launch GC Browser and enter Zalando Url "<Zalando Url>"
    When User should select the Customer Type as Women and search for womenProduct in search bar "<productForWomen>"
    And User should not able to view the  women products in search results
    And User should revert back to Homepage, select the Customer Type as Men and search for menProduct in search bar"<productForMen>"
    And User should not able to view the men products in search results
    And User should revert back to Homepage ,select the Customer Type as Kids and search for kidsProduct "<productForKids>"
    And User should not able to view the kids products in search results
    Then User should able to close the browser

    Examples: 
      | Zalando Url                | productForWomen | productForMen | productForKids |
      | https://www.zalando.co.uk/ | XYZ             | XZZ           | ZZZZ           |
