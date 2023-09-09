package utility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import driverhandle.DriverInitiator;


public class Utilities extends DriverInitiator {

	public static JavascriptExecutor js;
	public static Actions mouse;
	
	
	
	// DropDown
	
	
	// WebElement methods
	public void sendValue(WebElement element,String value) {
		element.click();
		element.clear();
		element.sendKeys(value);		
	}
	
	// Combined methods
	
	
	
	// Action Utility
	// 1. Move To Element	
	public static void MoveToElement(WebElement element) throws InterruptedException {
		mouse= new Actions(driver);
		Thread.sleep(2000);
		mouse.moveToElement(element).build().perform();
	}
	// 2. Click using action class
	public static void actionClick(WebElement element) throws InterruptedException {
		mouse= new Actions(driver);
		Thread.sleep(2000);
		mouse.click(element).build().perform();
		
	}		
	// 3. Drag and Drop 	
			
		public static void dragDrop(WebElement drag,WebElement drop) {
			
			mouse.dragAndDrop(drag, drop).build().perform();
		}	
		// 4. Right Click 
		public static void actionRightClick(WebElement element) throws InterruptedException {
			mouse= new Actions(driver);
			Thread.sleep(2000);
			mouse.contextClick(element).build().perform();
			
		}
		public static void actionClickAndHold(WebElement element) throws InterruptedException {
			mouse= new Actions(driver);
			Thread.sleep(2000);
			mouse.clickAndHold(element).build().perform();			
		}	
		
		public static void actionDoubleClick(WebElement element) throws InterruptedException {
			mouse= new Actions(driver);
			Thread.sleep(2000);
			mouse.doubleClick(element).build().perform();			
		}
			
		public void upperCaseTextbox(WebElement element,String value) {
			mouse = new Actions(driver);			
			mouse.moveToElement(element).click().keyDown(element, Keys.SHIFT)
				.sendKeys(element, value)
				.keyUp(element, Keys.SHIFT)
				.doubleClick(element)
				.contextClick()
				.build().perform();
		}
			public void actionSendkeys(WebElement element,String value) throws InterruptedException {
				mouse = new Actions(driver);
				mouse.sendKeys(element, value).build().perform();
				//mouse.sendKeys(txtUsername,Keys.ENTER).build().perform();
				Thread.sleep(3000);
			}
			
		public void actionScrollToElement(WebElement element) {
			mouse = new Actions(driver);
			mouse.scrollToElement(element).build().perform();
		}
			
			

	
	
// Java Script Utility
	
	public static void flashing(WebElement etr) throws Exception {
		  js = (JavascriptExecutor) driver;
		String backGroundColor = etr.getCssValue("backgroundColor");
		System.out.println("BackGround Color of Element -->" + backGroundColor);
		for (int i = 0; i < 10; i++) {
			colorChange(etr, "rgb(200,20,81)");
			colorChange(etr, backGroundColor);
		}
	}

	public static void colorChange(WebElement etr, String color) throws InterruptedException {
		  js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", etr);
		Thread.sleep(1000);
	}

	public static void borderCreation(WebElement etr) {
		  js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='10px solid red'", etr);
	}

	public static void generateAlert(String message) {
		 js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "');");
	}

	public static void jsScrollClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("arguments[0].click();", element);
	}

	public static void jsSendKeys(WebElement element, String UN) {
		 js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + UN + "';", element);
	}

	public static void refreshPageJS(WebDriver driver) {
		 js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}

	public static void getURL() {
		 js = (JavascriptExecutor) driver;
		System.out.println("Title of page by one way-->" + js.executeScript("return document.URL;").toString());
		String title = (String) js.executeScript("return document.URL;");
		System.out.println("Title of page by other way-->" + title);
	}

	public static void getTitle() {
		 js = (JavascriptExecutor) driver;
		System.out.println("URL of page by one way-->" + js.executeScript("return document.title;").toString());
		String title = (String) js.executeScript("return document.title;");
		System.out.println("URL of page by other way-->" + title);
	}

	public static void retriveInnerTextOfPage() {
		 js = (JavascriptExecutor) driver;
		System.out.println("Inner Text of page by one way-->"
				+ js.executeScript("return document.documentElement.innerText;").toString());
		String title = (String) js.executeScript("return document.documentElement.innerText;");
		System.out.println("Inner Text of page by other way-->" + title);
	}

	public static void scrollToHeight() {
		 js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scrollToElement(WebElement element) {
		 js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static String retrieveValueOfElement(WebElement element) {
		 js = (JavascriptExecutor) driver;
		String value = (String) js.executeScript("return arguments[0].value;", element);
		System.out.println("Value from Element-->" + value);
		return value;
	}

	public static void hideElement(WebElement element) {
		 js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display='none';", element);
	}

	public static void hideElements(List<WebElement> element) {
		 js = (JavascriptExecutor) driver;
		for (WebElement ele : element) {
			js.executeScript("arguments[0].style.display='none';", ele);
			System.out.println("Mission Done");
		}
	}

	public static void modifyElement(WebElement element, String value) {
		 js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].innerText = '" + value + "';", element);
	}

	public static void getElementInnerText(WebElement element) {
		 js = (JavascriptExecutor) driver;
		String innerText = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].textContent;",
				element);
		System.out.println("Inner Text of Element" + innerText);
	}

	public static void waitForAnElement(WebElement element) {
		 js = (JavascriptExecutor) driver;
		js.executeScript("var callback = arguments[arguments.length - 1];" + "var interval = setInterval(function() {"
				+ "if (arguments[0].offsetHeight > 0) {" + "clearInterval(interval);" + "callback();" + "}"
				+ "}, 100);", element);
	}

	
	
	
}
