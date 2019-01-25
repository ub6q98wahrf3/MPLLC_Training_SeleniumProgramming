package Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Checkboxes {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/FrameWorks/WorkBench/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/Locators.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		/**
		 * CHECKBOXES
		 */
		WebElement FruitOption = driver.findElement(By.cssSelector("input[value='apple']"));
		FruitOption.click();
		if(FruitOption.isSelected()) {
			System.out.println("Checkbox successfully checked. Test Case passed.");
		}else {
			System.out.println("Checkbox not checked. Test Case Failed.");
		}
		
		System.out.println("Success");
	}
}
