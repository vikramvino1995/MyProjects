@Feature1
Feature: All types of Customers(Men,Women,Kids) should able to search their desired product in Zalando.co.uk.

  Scenario Outline: All types of customers should able to search valid product using search Bar
    Given Customer should able to Launch GC Browser and enter Zalando Url "<Zalando Url>"
    When User should select the Customer Type as Women and search for womenProduct in search bar "<productForWomen>"
    And User should able to view the searched women product list
    And User should revert back to Homepage, select the Customer Type as Men and search for menProduct in search bar"<productForMen>"
    And User should able to view the searched men product list
    And User should revert back to Homepage ,select the Customer Type as Kids and search for kidsProduct "<productForKids>"
    And User should able to view the searched kids productlist
    Then User should able to close the browser.

    Examples: 
      | Zalando Url                | productForWomen | productForMen | productForKids |
      | https://www.zalando.co.uk/ | Jean Jacket     | Polo Shirts   | t-Shirts       |


		