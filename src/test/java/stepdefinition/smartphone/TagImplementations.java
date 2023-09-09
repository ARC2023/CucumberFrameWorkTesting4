package stepdefinition.smartphone;

import io.cucumber.java.en.*;

public class TagImplementations {

	
	
	@When("I complete action two by passing {string} into text box")
	public void i_complete_action_two_by_passing_into_text_box(String string) {
	   System.out.println(string);
	}
	
	@Given("start implementation for tag")
	public void start_implementation_for_tag() {

	}

	@Given("some other precondition for tag")
	public void some_other_precondition_for_tag() {

	}

	@When("I complete action one")
	public void i_complete_action_one() {

	}

	@When("I complete action two")
	public void i_complete_action_two() throws Exception {
		throw new Exception("Failed");
	}

	@When("I complete action three")
	public void i_complete_action_three() {

	}

	@When("I complete action Four")
	public void i_complete_action_four() {

	}
	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
