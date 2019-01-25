package Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07B_Links_InNewTabOnClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/Locators.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String keyCombination = Keys.chord(Keys.COMMAND, Keys.RETURN);
		
		driver.findElement(By.partialLinkText("PayTM")).sendKeys(keyCombination);
		
		//So that you can perform the following:
		driver.findElement(By.xpath("//input[@value='apple']")).click();
	}
}
