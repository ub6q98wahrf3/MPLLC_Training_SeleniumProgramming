package Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_HandlingClickOperationWithoutClicking {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Love/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");
		driver.findElement(By.id("login-username")).sendKeys("qatest");
        driver.findElement(By.id("login-username")).submit();
	}
}
