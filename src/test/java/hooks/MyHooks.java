package hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import configreader.ConfigurationReader;
import driverhandle.DriverInitiator;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

public class MyHooks {

	public String browser;
	public String URL;
	public static String folderName;
	public WebDriver LocalhooksDriver;
	
	
	@Before(order=0)
	public void setUpConfigFile(Scenario sc) {
		System.out.println("Get Name = "+sc.getName());
		System.out.println(sc.getSourceTagNames());
		//sc.getLine();
		folderName=sc.getName();
		browser=ConfigurationReader.getConfigProp("Browser");
		URL=ConfigurationReader.getConfigProp("URL");
		
	}
	@Before(order=1)
	public void driverSetup() {
				
		//LocalhooksDriver=DriverInitiator.getDriverInstance().launchBrowser(browser, URL);
		
	}
	
	@After(order=1)
	public void setCounter() {
		
		ScreenShot.counter=1;
		
	}
	@After(order=0)
	public void dismantleDriver(Scenario sc) throws IOException {
		/*
		if(sc.isFailed()) {
			System.out.println(sc.getStatus());
			ScreenShot.takeScreenShotOnFailure();
			try {
				// this method invokes screenshot upon failure
				ScreenShot.takeScreenShotOnFailure();
				// This code is to attach the failure page screenshot to report /
				
				String screenshotName = sc.getName().replaceAll(" ", "_");
				
				byte[] sourcePath = ((TakesScreenshot) LocalhooksDriver).getScreenshotAs(OutputType.BYTES);
				
				sc.attach(sourcePath, "image/png", screenshotName);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println(sc.getStatus());
		}
		
		DriverInitiator.quitDriver();
		*/
	}
}
