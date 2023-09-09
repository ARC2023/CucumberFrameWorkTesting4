@All1
Feature: Tag implementations for filtering
  
Background: I want to run repeated steps
	  Given start implementation for tag
    And some other precondition for tag 
    


 	@Smoke @Sanity
  Scenario: Tag case one
    When I complete action one
    
		@Regression @Smoke
   Scenario: Tag case two
    
    When I complete action two by passing "Jonal" into text box
    
    @Sanity
     Scenario: Tag case three
    
    When I complete action three
    