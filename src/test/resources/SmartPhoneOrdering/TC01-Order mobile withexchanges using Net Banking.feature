Feature: Validate smart phone ordering with exchange using net banking

@Smoke
Scenario: To verify smartphone ordering with exchange using net banking

Given user loads the Amazon url
	When user enters valida credentials 
	Then user lands on Home page of Amazon
		
  When user select electronics category from dropdown 
	And enter smart phone details in the search bar
	And Click on search button
	Then user will land on search catalouge	
	 When user Clicks on any smart phone from the catalouge
	Then user lands on product information page

 When user validates Product title, Ratings, Answered question from DB
    And user Validate the MRP, DIscount and Final price after discount from DB
	And Validate replacement and return policy info along with other details
	And Validate color and style name selection is enabled
    And  Validate Product core information 
	
 When user Clicks on without exchange option
    And Validate delivery ETA, Address pin, Stock avaiability and Selller information
    And  No plans selected
    And user Clicks on add to cart
	Then Cart under additional information page should come 
	
	
	When user Clicks on Cart under additional information page of cart
	And user Clicks on Proceed to buy button 
    Then user lands on address selection page
	
	
  When user Selects appropriate address 
  And click on use this address button
  Then focus should shift on payment methods
  
  
 When user Selects COD 
 And click on use this payment method button
 Then validate the order summary page
 
 When user Click on place your order
Then Validate order confirmation page