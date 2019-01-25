package Programming;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10B_WindowsOrTabs_SwitchToTabAndValidateTitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/Locators.html");
		
		/*
		 * The previous program is not an efficient one, as to open each link, we have to first switch to the main window and then perform the operation. It will lead to performance issues.
		 * To overcome this disadvantage, we have to use the following way:
		 */
		String keysCombination = Keys.chord(Keys.COMMAND, Keys.RETURN);
		
		driver.findElement(By.xpath("//a[text()='Welcome To Amazon']")).sendKeys(keysCombination);
		
		String windowTitle = driver.getTitle();
		
		System.out.println(windowTitle);
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		System.out.println(driver.switchTo().window(it.next()).getTitle());
		
		System.out.println(driver.switchTo().window(it.next()).getTitle());
		
		//System.out.println(it.next());
	}
}
