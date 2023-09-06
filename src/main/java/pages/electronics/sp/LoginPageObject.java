package pages.electronics.sp;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utilities;

public class LoginPageObject extends Utilities {
	
	public LoginPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	// WebElements
	@FindBy(xpath = "//span[text()='Hello, sign in']")
	private WebElement SignButton;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement Username;

	@FindBy(id = "")
	private WebElement Password;

	@FindBy(id = "login_Layer")
	private WebElement LoginBtn1;

	@FindBy(id = "continue")
	private WebElement ContinueBtn;

	@FindBy(id = "continue")
	private List<WebElement> list;

	
	
	// Element methods

	public void clickContinue() {
		jsScrollClick(ContinueBtn);
	}
	
	public void clickSignIn() {
		jsScrollClick(SignButton);
	}
	
	
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
