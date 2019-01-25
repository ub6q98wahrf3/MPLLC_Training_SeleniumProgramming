package Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _11_Locators_Xpath_Advanced {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=hello");
		
		//In this class we will not locate any specific element, rather we will see how we can locate elements based on advanced xpath techniques
		
		//ANCESTOR
		driver.findElement(By.xpath("//div[@id='gbw']/ancestor::div"));
		
		//ANCESTOR-OR-SELF
		driver.findElement(By.xpath("//div[@id='gbw']/ancestor-or-self::div"));
		
		//CHILD
		driver.findElement(By.xpath("//div[@class='gb_ab']/child::div"));
		
		//DESCENDANT
		driver.findElement(By.xpath("//div[@class='gb_ab']/descendant::div"));
		
		//DESCENDANT-OR-SELF
		driver.findElement(By.xpath("//div[@class='gb_ab']/descendant-or-self::div"));
		
		//FOLLOWING
		driver.findElement(By.xpath("//div[@id='main']/following::div"));
		
		//FOLLOWING-SIBLING
		driver.findElement(By.xpath("//div[@class='gb_Ab']/following-sibling::div"));
		
		//PARENT
		driver.findElement(By.xpath("//div[@class='gb_4b']/parent::div"));
		
		//PRECEDING-SIBLING
		driver.findElement(By.xpath("//div[@class='gb_4b']/preceding-sibling::div"));
		
		//SELF
		driver.findElement(By.xpath("//div[@class='gb_4b']/self::div"));
		
	}
}
