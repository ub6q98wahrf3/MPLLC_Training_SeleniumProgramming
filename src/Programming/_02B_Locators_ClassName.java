package Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02B_Locators_ClassName {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/FrameWorks/WorkBench/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/Locators.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/**
		 * LOCATOR - CLASS NAME
		 */
		driver.findElement(By.className("input_class")).sendKeys("TEST");
		

		System.out.println("Success");		
	}
}
