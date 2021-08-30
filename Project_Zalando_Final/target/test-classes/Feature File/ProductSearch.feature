Feature: User should able to search for their desired product in search bar

  Scenario Outline: User should select customer type as women and search product in search bar
    Given User should able to launch chrome and reach "<zalandoURL>"
    When User should able to select the customer type as women
    And User should able to verify whether the page displays women products only
    And User should able to search a women product in search bar "<womenProduct>"
    Then User should able to verify whether searched women products are displayed in search results page "<womenProduct>"

    Examples: 
      | zalandoURL                 | womenProduct |
      | https://www.zalando.co.uk/ | Jean         |

  Scenario Outline: User should select customer type as men and search product in search bar
    Given User should able to launch chrome and reach "<zalandoURL>"
    When User should able to select the customer type as men
    And User should able to verify whether the page displays men products only
    And User should able to search a men product in search bar "<menProduct>"
    Then User should able to verify whether searched men products are displayed in search results page "<menProduct>"

    Examples: 
      | zalandoURL                 | menProduct |
      | https://www.zalando.co.uk/ | Shirt      |

  Scenario Outline: User should select customer type as kids and search product in search bar
    Given User should able to launch chrome and reach "<zalandoURL>"
    When User should able to select the customer type as kids
    And User should able to verify whether the page displays kids products only
    And User should able to search a kids product in search bar "<kidsProduct>"
    Then User should able to verify whether searched kids products are displayed in search results page "<kidsProduct>"

    Examples: 
      | zalandoURL                 | kidsProduct |
      | https://www.zalando.co.uk/ | T-shirt     |

      
      
      