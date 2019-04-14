Feature: Selenium Class

Background: 
Given I am in background step

	Scenario: iPhone Product Search
	
	Then I will navigate to amazon home page
	Then I will search a product "iPhone"
	Then I will verify whether "Apple iPhone X (64GB) - Silver" is available or not and select it
	Then I will print the product price
#	
#	Scenario: Gmail login
#	
#	Given Open gmail url
#	Then provide details
#	Then click on Compose
#	And quit browser


