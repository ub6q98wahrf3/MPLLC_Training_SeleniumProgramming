package Programming;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;

public class _19_HandlingScreenshotsAndKillingProcesses {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "geckodriver executable path");
		WebDriver driver = new ChromeDriver();
		
		File srcc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcc, new File("/Path/To/Screenshot.png"));
		
		WindowsUtils.killByName("Excel.app");
	}
}
