package Programming;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class _03F_Waits_FluentWait_Advanced_Function {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows");
		
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver);
		w.withTimeout(Duration.ofMillis(30000));
		w.pollingEvery(Duration.ofMillis(250));
		w.ignoring(NoSuchElementException.class);
		
		WebElement ele = w.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.linkText("New Element0"));
			}
		});
		
		ele.click();
		System.out.println("success");
	}
}
