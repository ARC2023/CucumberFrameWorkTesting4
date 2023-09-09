package stepdefinition.smartphone;

import io.cucumber.java.en.*;

public class ScenarioOutlinetesting4 {
	@Given("I want to write a step with {string} testing4")
	public void i_want_to_write_a_step_with_testing4(String string) {
	    System.out.println(string);
	}

	@When("I check for the {string} in step testing4")
	public void i_check_for_the_in_step_testing4(String string) {
	    System.out.println(string); 
	}

	@Then("I verify the {string} in step testing4")
	public void i_verify_the_in_step_testing4(String string) {
	    System.out.println(string); 

	}


}
