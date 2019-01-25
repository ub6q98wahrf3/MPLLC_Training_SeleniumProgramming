package Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10A_WindowsOrTabs_SwitchToParentWindow {
	/**
	 * The following program will:
	 * - Click on "Welcome To Amazon" link in the new tab
	 * - Switch the tab back to the first tab
	 * - Click on the "Welcome To Flipkart" link in the new tab
	 * - Switch the tab back to the first tab
	 * - Click on the "Welcome To PayTM" link in the new tab
	 * - Switch the tab back to the first tab
	 * 
	 * As a result of this, the first tab besides the main tab will be in the order -> "PayTM" : "Flipkart" : "Amazon"
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/Locators.html");
		
		driver.findElement(By.linkText("Welcome To Amazon")).click();
		System.out.println("Amazon Title: " + driver.getTitle());
		driver.navigate().back();
		driver.findElement((By.linkText("Welcome To Flipkart"))).click();
		System.out.println("Flipkart Title: " + driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.linkText("Welcome To PayTM")).click();
		System.out.println("PayTM Title: " + driver.getTitle());
	}
}
