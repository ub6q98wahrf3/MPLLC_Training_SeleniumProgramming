package Programming;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class _12_ActionsDemo {
	/**
	 * STEPS:
	 * 01. Open Chrome browser
	 * 02. Get navigated to amazon.in site
	 * 03. Move the mouse pointer on "Search by category" on the header.
	 * 04. Mouse hover on "TV, APPLIANCES..." option
	 * 05. Click on "DSLR camera" option
	 * 06. On the DSLR cameras PLP, click on the search text field.
	 * 07. Enter "Nikon" in it
	 * 08. Click on the very first result (whatever it is) that is getting displayed on the search page
	 * 09. Find the window where the product title is available
	 * 10. Get the title of the product on the corresponding page (PDP).
	 * CHILD, DESCENDANT, FOLLOWING, FOLLOWING SIBLING, PRECEDING SIBLING, ANCESTOR
	 */
	public static void main(String[] args) {
		/* 1 */
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/ActualTraining_SeleniumSessionProject/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/* 2 */
		driver.get("http://www.amazon.in");
		
		/* 3, 4, 5 */
		Actions a = new Actions(driver);
		
		WebElement shopByCategory = driver.findElement(By.xpath("//div[@id='nav-main']/child::div/child::div[2]/a"));
		WebElement tvAppliances = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/descendant::div[3]/child::span[7]"));
		WebElement dslrCameras = driver.findElement(By.xpath("(//div[@class='nav-panel'])[8]/child::a/following-sibling::a[6]"));
		
		a.moveToElement(shopByCategory).pause(Duration.ofMillis(500)).moveToElement(tvAppliances).pause(Duration.ofMillis(500)).moveToElement(dslrCameras).click().build().perform();
		
		/* 6, 7 */
		WebElement searchField = driver.findElement(By.xpath("(//div[@class='nav-search-field ']/ancestor::div[1])/descendant::input"));
		WebElement searchIcon = driver.findElement(By.xpath("(//div[@class='nav-left'])[2]/following::div/descendant::input"));
		
		a.moveToElement(searchField).click().sendKeys("Nikon").moveToElement(searchIcon).click().build().perform();
		
		/* 8 */
		WebElement firstResult = driver.findElement(By.xpath("//div[@id='resultsCol']/descendant::a[2]/img"));
		
		a.moveToElement(firstResult).click().build().perform();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
//		String fw = it.next();
//		String sw = it.next();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			int count = driver.findElements(By.xpath("//div[@id='titleSection']/child::div/preceding-sibling::h1/child::span")).size();
			if(count > 0) {
				System.out.println("Title Found: " + driver.findElement(By.xpath("//div[@id='titleSection']/child::div/preceding-sibling::h1/child::span")).getText());
				break;
			}else {
				System.out.println("Title not found on the current window. Switching to the other window...");
				continue;
			}
		}
	}
}
