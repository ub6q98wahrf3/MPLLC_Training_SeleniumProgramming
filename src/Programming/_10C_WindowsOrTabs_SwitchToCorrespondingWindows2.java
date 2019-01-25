package Programming;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10C_WindowsOrTabs_SwitchToCorrespondingWindows2 {
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
		
//		driver.findElement(By.xpath("//a[text()='Welcome To Amazon']")).sendKeys(keysCombination);
//		driver.findElement(By.xpath("//a[contains(text(),'Flipkart')]")).sendKeys(keysCombination);
//		driver.findElement(By.xpath("(//a[@class='anchor_class'])[3]")).sendKeys(keysCombination);
		
		//Find the total number of links present on the page:
		int count;
		count = driver.findElements(By.tagName("a")).size();
		System.out.println("The total number of links present on the page: " + count);
		
		
		
		for(int i=0; i<count; i++) {
			driver.findElements(By.className("anchor_class")).get(i).sendKeys(keysCombination);
		}
		
		/*
		 * As a result of the above execution, the order of windows opened will be "Amazon" : "Flipkart" : "PayTM"
		 */
		
		/*
		 * Now coming back to the main topic. We have to perform the following steps:
		 * - Print the title of the main window (tab).
		 * - Get navigated to first window (tab) and print the title of the corresponding page.
		 * - Get navigated to second window (tab) and print the title of the corresponding page.
		 * - Get navigated to third window (tab) and print the title of the corresponding page.
		 */
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
//		String parentWindowId = it.next();
//		String firstChildWindowId = it.next();
//		String secondChildWindowId = it.next();
//		String thirdChildWindowId = it.next();
//		
//		System.out.println(driver.switchTo().window(parentWindowId).getTitle());
//		System.out.println(driver.switchTo().window(firstChildWindowId).getTitle());
//		System.out.println(driver.switchTo().window(secondChildWindowId).getTitle());
//		System.out.println(driver.switchTo().window(thirdChildWindowId).getTitle());
		
		//But as we notice for all windows ID, the values don't match with the corresonding variable. This is because the set stores the values in the random order.
		/*
		 * But the way we achieved our task is not optimized one. Therefore, following way should be used:
		 */
		
		while(it.hasNext()) {
			System.out.println(driver.switchTo().window(it.next()).getTitle());
		}
	}
}
