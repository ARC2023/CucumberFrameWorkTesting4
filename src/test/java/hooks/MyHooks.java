package hooks;

import configreader.ConfigurationReader;
import driverhandle.DriverInitiator;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {

	public String browser;
	public String URL;
	public static String folderName;
	
	
	@Before(order=0)
	public void setUpConfigFile(Scenario sc) {
		System.out.println(sc.getId());
		System.out.println(sc.getName());
		System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());
		//sc.getSourceTagNames();
		//sc.getLine();
		folderName=sc.getName();
		browser=ConfigurationReader.getConfigProp("Browser");
		URL=ConfigurationReader.getConfigProp("URL");
		
	}
	@Before(order=1)
	public void driverSetup() {
		
		DriverInitiator.getInstance().launchBrowser(browser, URL);
		
	}
	
	
	
}
