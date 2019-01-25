package Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_RadioButtons {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/FrameWorks/WorkBench/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/Locators.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/**
		 * RADIO BUTTON
		 */
		WebElement GenderOption = driver.findElements(By.cssSelector("input[type='radio']")).get(1);
		GenderOption.click();
		if(GenderOption.isSelected()) {
			System.out.println("Gender Successfully selected. Test Case passed.");
		}else {
			System.out.println("Gender not selected. Test Case failed. ");
		}

		System.out.println("Success");
	}
}
