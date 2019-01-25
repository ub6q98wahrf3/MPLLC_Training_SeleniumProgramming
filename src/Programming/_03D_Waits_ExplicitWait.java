package Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _03D_Waits_ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		WebDriverWait w = new WebDriverWait(driver, 40);
		
//		w.until(ExpectedConditions.elementToBeClickable(By.linkText("New Element 0"))).click();
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("New Element0"))).click();
		w.until(ExpectedConditions.presenceOfElementLocated(By.linkText("New Element0")));
		
		
		driver.findElement(By.linkText("New Element0")).click();
		System.out.println("Success");
	}
}
