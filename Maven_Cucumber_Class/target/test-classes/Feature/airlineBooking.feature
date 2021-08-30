#------------------Feature in cucumber-----------------------
@Feature1
Feature: User should able to book airline ticket.

	Background: 
	
		Given User should launch chrome and search Nordica Airlines, select the URL.

	@Regression
  Scenario: Select round trip with valid source and destination.
  
  
   
    When User should click the round trip radio 
    And User should select the valid source
    And User should select the valid destination
    And User should select the start date and return date of travel
    And User should select the find flights button
    Then List of available flights should be displayed

 @Smoke @Sanity
 Scenario: Select one-way trip with valid Source and destination.
 
 
    
    When User should click the one-way trip radio 
    And User should select the valid source
    And User should select the valid destination
    And User should select the start date  of travel
    And User should select the find flights button
    Then List of available flights should be displayed  
 
 @Smoke @Regression
 Scenario: Select one-way trip with In-valid Source and valid destination.
 
 
    
    When User should click the one-way trip radio 
    And User should select the Invalid source
    And User should select the valid destination
    And User should select the start date  of travel
    And User should select the find flights button
    Then List of available flights should be displayed  
 				
 											
 Scenario: Select one-way trip with valid Source and In-valid destination.
 
   
    When User should click the one-way trip radio 
    And User should select the valid source
    And User should select the In-valid destination
    And User should select the start date  of travel
    And User should select the find flights button
    Then List of available flights should be displayed  										
 													