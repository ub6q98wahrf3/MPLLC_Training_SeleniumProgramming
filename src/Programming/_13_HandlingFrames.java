package Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _13_HandlingFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.clickAndHold(driver.findElement(By.xpath("//div[@id='resizable']/div/following-sibling::div[2]"))).moveByOffset(300, 100).release().build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Animate")).click();
		
		Thread.sleep(2000);
		driver.get("http://jqueryui.com/droppable/");
		
		int TotalFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(TotalFrames);
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
		
		System.out.println("Success");
	}
}
