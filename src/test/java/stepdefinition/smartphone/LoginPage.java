package stepdefinition.smartphone;

import configreader.ConfigurationReader;
import io.cucumber.java.en.*;
import pages.electronics.sp.*;

public class LoginPage {
	
	LoginPageObject LPO = new LoginPageObject();
	
	@Given("user loads the Amazon url")
	public void user_loads_the_amazon_url() {
	   System.out.println("URL Loaded");
	}

	@When("user enters valida credentials")
	public void user_enters_valida_credentials() throws InterruptedException {		
		Thread.sleep(5000);
		LPO.clickSignIn();
		LPO.sendUsername(ConfigurationReader.getConfigProp("UserName"));
		LPO.clickContinue();		
		/*LPO.sendPassword(ConfigurationReader.getConfigProp("PassWord"));
		LPO.clickLoginButtonHomePage();*/
	}

	@Then("user lands on Home page of Amazon")
	public void user_lands_on_home_page_of_amazon() {
	    
	}
}
