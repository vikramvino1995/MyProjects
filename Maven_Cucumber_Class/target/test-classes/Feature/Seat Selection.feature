#Feature for seat selection in Nordica Airlines
@Feature2
Feature: User should able to select the type of seat


@Regression
Scenario: User should able to select the seat type as Economy class		
	Given   User should have selected travel dates in Nordica Airlines
	When    User should select the Economy Class after selecting the travel date
	And     User Should able to select the Economy Type as flex 
	And     User should able to verify the amount in cart
	Then    User should able to select the continue button
@Smoke	
Scenario: User should able to select the seat type as Premium class		
	Given   User should have selected travel dates in Nordica Airlines
	When    User should select the Premium Class after selecting the travel date
	And     User Should able to select the Premium Type as Premium Standard 
	And     User should able to verify the amount in cart
	Then    User should able to select the continue button	
	
@Sanity	
	Scenario: User should able to select the seat type as Buisness class			
	Given   User should have selected travel dates in Nordica Airlines
	When    User should select the Buisness Class after selecting the travel date
	And     User Should able to select the Buisness Type as semi flex 
	And     User should able to verify the amount in cart
	Then    User should able to select the continue button	