Feature: All types of Customers(Men,Women,Kids) should able to select a  desired product in Zalando.co.uk.

 Scenario Outline: All types of customers should able to select product without sorting product search results
 Given Customer should able to Launch GC Browser and enter Zalando Url "<Zalando Url>"
    When User should select the Customer Type as Women and search for womenProduct in search bar "<productForWomen>"
    And User should able to view the  women products in search results
    And User should able select a women product, view the product details page
    And User should 