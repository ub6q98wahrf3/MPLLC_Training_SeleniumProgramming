package Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03B_Waits_PageLoadTimeout {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);		
		
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
	}
}
