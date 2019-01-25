package Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _20_JSE_HandlingElementHighlight2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/FrameWorks/WorkBench/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		flash(driver.findElement(By.id("nav-logo")), driver);
		driver.findElement(By.id("nav-logo")).click();
	}
	
	public static void flash(WebElement ele, WebDriver driver) {
		String bgColor = ele.getCssValue("backgroundColor");
		for(int i = 0; i<2; i++) {
			changeColor(bgColor, ele, driver);
			changeColor("rgb(0,200,0)", ele, driver);
		}
	}
	
	public static void changeColor(String bgColor, WebElement ele, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + bgColor + "'", ele);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
