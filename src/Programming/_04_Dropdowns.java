package Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _04_Dropdowns {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/FrameWorks/WorkBench/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/Locators.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		/**
		 * DROPDOWNS
		 */
		WebElement countryDropdown = driver.findElement(By.id("country"));
		Select s = new Select(countryDropdown);
		s.selectByIndex(1);
		s.selectByValue("Bhutan");
		s.selectByVisibleText("India");

		System.out.println("Success");
	}
}
