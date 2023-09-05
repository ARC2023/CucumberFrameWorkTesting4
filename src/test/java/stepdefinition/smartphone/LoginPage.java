package stepdefinition.smartphone;

import io.cucumber.java.en.*;
import pages.electronics.sp.*;

public class LoginPage {
	
	LoginPageObject LPO = new LoginPageObject();
	
	@Given("user loads the Amazon url")
	public void user_loads_the_amazon_url() {
	   
	}

	@When("user enters valida credentials")
	public void user_enters_valida_credentials() {
		LPO.sendUsername(null);
		LPO.sendUsername(null);
		LPO.clickLoginButtonHomePage();
	}

	@Then("user lands on Home page of Amazon")
	public void user_lands_on_home_page_of_amazon() {
	    
	}
}
