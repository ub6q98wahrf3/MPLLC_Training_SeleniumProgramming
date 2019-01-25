package Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02F_Locators_Xpath {
	
	/**
	 * Absolute Xpath																									|		Relative Path
	 * Refers to the path that starts all the way from the root element of the dom till the corresponding element 		|		Refers to the path that starts directly from the element under consideration
	 * Starts with “/“																									|		Starts with “//“
	 * Slower in execution																								|		Faster in execution
	 * Not recommended, as if the dom changes, the entire path is changed.												|		Always recommended, as the path is not affected by the change in the dom.
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/FrameWorks/WorkBench/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/Locators.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/**
		 * LOCATOR - XPATH
		 * Syntax: //tag[@attribute='value']
		 */
		driver.findElement(By.xpath("//input[contains(@id,'_id')]")).sendKeys("TEST");
		
//		driver.findElement(By.xpath("/html/body/div[2]/p/a")).click();
//		driver.findElement(By.xpath("//a[@href='https://www.amazon.com']")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'amazon')]")).click();
//		driver.findElement(By.xpath("//a[@id='anchor_id']")).click();
//		driver.findElement(By.xpath("//a[@class='anchor_class']")).click();
		driver.findElement(By.xpath("//a[text()='Welcome To Amazon']")).click();

		System.out.println("Success");
	}
}
