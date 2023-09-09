package stepdefinition.smartphone;

import java.io.IOException;

import configreader.ConfigurationReader;
import io.cucumber.java.en.*;
import pages.electronics.sp.*;
import hooks.ScreenShot;

public class LoginPage {
	
	LoginPageObject LPO = new LoginPageObject();
	
	@Given("user loads the Amazon url")
	public void user_loads_the_amazon_url() throws IOException {
	   System.out.println("URL Loaded");
	   ScreenShot.takeScreenShot();
	}

	@When("user enters valida credentials")
	public void user_enters_valida_credentials() throws InterruptedException, IOException {		
		Thread.sleep(5000);
		LPO.clickSignIn();
		ScreenShot.takeScreenShot();
		LPO.sendUsername(ConfigurationReader.getConfigProp("UserName"));
		ScreenShot.takeScreenShot();
		LPO.clickContinue();	
		ScreenShot.takeScreenShot();
		/*LPO.sendPassword(ConfigurationReader.getConfigProp("PassWord"));
		LPO.clickLoginButtonHomePage();*/
	}

	@Then("user lands on Home page of Amazon")
	public void user_lands_on_home_page_of_amazon() {
	    
	}
}
