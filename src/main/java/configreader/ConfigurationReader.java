package configreader;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties prop;
	
	public Properties setUpPropertiesFile() {

		prop = new Properties();

		try {
			FileInputStream in = new FileInputStream(
					"C:\\Users\\glend\\eclipse-workspace\\CucumberFrameworkTesting4\\src\\main\\resources\\configuration\\config.properties");
			System.out.println("File inserted into Stream");
			prop.load(in);
			System.out.println("Properties file loaded for use");
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return prop;
	}
	
	public static String getConfigProp(String propValue) {
				
		return getInstance().setUpPropertiesFile().getProperty(propValue);
		
	}

	public static ConfigurationReader getInstance() {
		
		return new ConfigurationReader();
	}
}
