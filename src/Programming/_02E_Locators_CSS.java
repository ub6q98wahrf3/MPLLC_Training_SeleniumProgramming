package Programming;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02E_Locators_CSS {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/FrameWorks/WorkBench/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/Locators.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/**
		 * LOCATOR - CSS
		 * Syntax: tag[attribute='value']
		 */
		
//		driver.findElement(By.cssSelector("a[href='https://www.amazon.com']")).click();
//		driver.findElement(By.cssSelector("a[href*='amazon']")).click();
//		driver.findElement(By.cssSelector("a#anchor_id")).click();
		driver.findElement(By.cssSelector("a.anchor_class")).click();
		
		System.out.println("Success");
		
	}
}
