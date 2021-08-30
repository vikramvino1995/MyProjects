Feature: User should able to enter username and password

  Scenario: User should able to enter valid details only
    Given User should able to reach the facebook website
    When User should able to enter the valid username
    And User should able to enter the valid password
    Then User should able to click and login
