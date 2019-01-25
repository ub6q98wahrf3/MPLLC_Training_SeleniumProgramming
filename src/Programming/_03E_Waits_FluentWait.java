package Programming;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class _03E_Waits_FluentWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.ignoring(NoSuchElementException.class);
		
		//WebElement ele = wait.until((ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='New Element0']")))).click();
		
		WebElement ele = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//a[text()='New Element0']"));
			}
		});
		
		if(ele.isDisplayed()) {
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}
		
		ele.click();

//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//		wait.withTimeout(Duration.ofMillis(30000));
//		wait.pollingEvery(Duration.ofMillis(250));
//		wait.ignoring(NoSuchElementException.class);
//		
//		WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.linkText("New Element0"));
//			}
//		});
//		
//		ele.click();
		
		
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//		wait.withTimeout(Duration.ofMillis(30000));
//		wait.pollingEvery(Duration.ofMillis(250));
//		wait.ignoring(NoSuchElementException.class);
//		
//		
//		Boolean flag = wait.until(new Function<WebDriver, Boolean>(){
//			public Boolean apply(WebDriver dirver) {
//				if(driver.findElement(By.linkText("New Element0")).isDisplayed()) {
//					return true;
//				}else {
//					return false;
//				}
//			}
//		});
//		
//		System.out.println("Element Displayed: " + flag);
	}	
}
