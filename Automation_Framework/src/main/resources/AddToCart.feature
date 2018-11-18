@Sanity @TS_1045
Feature: Cart function validation 

	Description: User able to add product to shopping cart


Scenario: User able to select product and add to cart 
	Given User able to login successfully with valid credential 
	And   Click the catalog link
	And   Click new product link 
	When  Check total product count and check current page number 
	And   Find out all product name with total count in page one and page two 
	And   Show only duplicate product
	And   Remove all duplicate value from the list 
	And   Find out how many shampoo in the list and each items count
	Then  Add one shampoo to cart