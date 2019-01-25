package Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _08C_JSAlert_PromptAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///Users/love.vashista/Library/Containers/com.apple.mail/Data/Library/Mail%20Downloads/649EA35A-E955-4363-87F2-39563D81AF68/Locators.html");
		
		driver.findElement(By.xpath("//button[text()='Prompt Pop Up']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Very Much Thank You.");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
}
