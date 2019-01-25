package Programming;
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
	 * Steps:
	 * 01. Open Chrome Browser
	 * 02. Navigate to Amazon.com site
	 * 03. Move the pointer to "shop by category" option of the header
	 * 04. Move the pointer to "TV, Appliances, Electronics" from the header menu
	 * 05. Move the pointer to "DSLR Cameras" option from the "TV..." sub menu and click on it.
	 * 06. ON the DSLR page, click on the "Search" text field, enter "Nikon" and click on the "Search" button besides it.
	 * 07. Click on the first result (independent of the product specifications)
	 * 08. Get the text of the returned product
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//Invoke the browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//Get navigated to the "amazon.com" site
		driver.get("http://www.amazon.in");
		
		WebElement shopByCategory = driver.findElement(By.xpath("(//div[@class='nav-fill'])[3]/descendant::a[@id='nav-link-shopall']"));
		WebElement tvAppliancesElectronics = driver.findElement(By.xpath("//span[@aria-label='Mobiles, Computers']/following-sibling::span"));
		WebElement DSLRCameras = driver.findElement(By.xpath("//a[contains(@href,'digital-slr-cameras')]/child::span"));
		
		
		Actions a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		a.moveToElement(shopByCategory).build().perform();
		Thread.sleep(2000);
		a.moveToElement(tvAppliancesElectronics).build().perform();
		Thread.sleep(2000);
		a.moveToElement(DSLRCameras).click().build().perform();
		
		WebElement searchField = driver.findElement(By.xpath("//div[@class='nav-search-field ']/child::input"));
		WebElement searchIcon = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/child::input"));
		
		a.moveToElement(searchField).click().sendKeys("Nikon").
		moveToElement(searchIcon).click().build().perform();
		
		WebElement firstResult = driver.findElement(By.xpath("//ul[@id='s-results-list-atf']/child::li/descendant::img"));
		
		a.moveToElement(firstResult).click().build().perform();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
//		String fw = it.next();
//		String sw = it.next();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			int count = driver.findElements(By.cssSelector("span#productTitle")).size();
			if(count > 0) {
				System.out.println(driver.findElement(By.cssSelector("span#productTitle")).getText());
				break;
			}else {
				System.out.println("Element not found in the current window. Switching to the other window...");
				continue;
			}
		}
		
//		driver.switchTo().window(sw);
//		
//		System.out.println(driver.findElement(By.cssSelector("span#productTitle")).getText());
		
		System.out.println("Success");
	}
}
