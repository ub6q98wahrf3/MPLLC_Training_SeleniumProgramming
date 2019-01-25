package Programming;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _15_MPLLC_Version_HandlingAutoSuggestiveDropdowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/love.vashista/Documents/Eclipse_Workspace/FrameWorks/WorkBench/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/autocomplete/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("input.ui-autocomplete-input")).sendKeys("R");
		
		WebElement suggestiveDropdown = driver.findElement(By.cssSelector("input.ui-autocomplete-input"));
		
		Thread.sleep(3000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//body/ul/li[@class='ui-menu-item']"));
		
		for(WebElement e: elements) {
			suggestiveDropdown.sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			System.out.println(e.getText());
			if(e.getText().contains("Clojure")) {
				System.out.println("Value found!");
				e.click();
				break;
			}
		}
	}
}
