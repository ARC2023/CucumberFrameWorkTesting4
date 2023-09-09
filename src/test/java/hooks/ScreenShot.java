package hooks;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utility.Utilities;

public class ScreenShot extends Utilities{
	public static int counter = 1;

	public static void takeScreenShotOnFailure() throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File desFile = new 
				File("C:\\Users\\glend\\eclipse-workspace\\CucumberFrameworkTesting4\\ScreenShotOnFailure\\" +
						MyHooks.folderName + "\\" + "Failed" + ".jpg");
		FileUtils.copyFile(srcFile, desFile);
		System.out.println("Screen Shot Taken For Failure");
	}

	public static void takeScreenShot() throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File desFile = 
		new File("C:\\Users\\glend\\eclipse-workspace\\CucumberFrameworkTesting4\\ScreenShotOnSuccess\\" 
		+ MyHooks.folderName + "\\" + counter + ".jpg");
		FileUtils.copyFile(srcFile, desFile);
		System.out.println("Screen Shot Taken");
		counter++;
	}
}
