package Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class _13_HandlingFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.jqueryui.com/resizable");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement resizePointer = driver.findElement(By.xpath("//div[@id='resizable']/child::div[3]"));
		
		Actions a = new Actions(driver);
		
		a.clickAndHold(resizePointer).moveByOffset(300, 100).release().build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Droppable")).click();
		
		int frameCountOnPage = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total number of frames present on the page: " + frameCountOnPage);
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		
		System.out.println("Success");
	}
}
