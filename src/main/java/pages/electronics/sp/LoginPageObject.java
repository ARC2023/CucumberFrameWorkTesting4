package pages.electronics.sp;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Utilities;

public class LoginPageObject extends Utilities {

	// WebElements
	@FindBy(xpath = "")
	private WebElement Username;

	@FindBy(id = "")
	private WebElement Password;

	@FindBy(id = "login_Layer")
	private WebElement LoginBtn1;


	
	// Element methods

	public void sendUsername(String value) {

		jsSendKeys(Username, value);

	}

	public void sendPassword(String value) {

		jsSendKeys(Password, value);

	}
	
	public void clickLoginButtonHomePage() {

		jsScrollClick(LoginBtn1);

	}
	
}
