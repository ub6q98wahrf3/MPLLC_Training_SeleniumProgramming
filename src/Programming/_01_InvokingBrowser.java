package Programming;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class _01_InvokingBrowser {
	/**
	 * Showcase the logic using:
	 * - Generic way (inside main)
	 * - Calling a method by the object
	 * - Calling a method without the object using inheritance
	 * - Calling a constructor without argument
	 * - Calling a constructor using argument
	 */
	
//	ChromeDriver driver1;
//	FirefoxDriver driver2;
//	SafariDriver driver3;
	
	WebDriver driver;
	
	public  void invokeBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/chromedriver");
//			driver1 = new ChromeDriver();			//..Works fine but not recommended --> ChromeDriver driver = new ChromeDriver();
//			driver1.get("http://www.google.com");
			
			driver = new ChromeDriver();			//..Recommended --> WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/geckodriver");
//			driver2 = new FirefoxDriver();			//..Works fine but not recommended --> FirefoxDriver driver = new FirefoxDriver();
//			driver2.get("http://www.google.com");
			
			driver = new FirefoxDriver();			//..Recommended --> WebDriver driver = new FirefoxDriver();
			driver.get("http://www.google.com");
		}else if(browser.equalsIgnoreCase("safari")){
//			driver3 = new SafariDriver();			//..Works fine but not recommended --> SafariDriver driver = new SafariDriver();
//			driver3.get("http://www.google.com");
			
			driver = new SafariDriver();			//..Recommended --> WebDriver driver = new SafariDriver();
			driver.get("http://www.google.com");
		}
	}
	
	public _01_InvokingBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/chromedriver");
//			driver1 = new ChromeDriver();			//..Works fine but not recommended --> ChromeDriver driver = new ChromeDriver();
//			driver1.get("http://www.google.com");
			
			driver = new ChromeDriver();			//..Recommended --> WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/geckodriver");
//			driver2 = new FirefoxDriver();			//..Works fine but not recommended --> FirefoxDriver driver = new FirefoxDriver();
//			driver2.get("http://www.google.com");
			
			driver = new FirefoxDriver();			//..Recommended --> WebDriver driver = new FirefoxDriver();
			driver.get("http://www.google.com");
		}else if(browser.equalsIgnoreCase("safari")){
//			driver3 = new SafariDriver();			//..Works fine but not recommended --> SafariDriver driver = new SafariDriver();
//			driver3.get("http://www.google.com");
			
			driver = new SafariDriver();			//..Recommended --> WebDriver driver = new SafariDriver();
			driver.get("http://www.google.com");
		}
	}
	
	
	public static void main(String[] args) {
		_01_InvokingBrowser x = new _01_InvokingBrowser("firefox");
		x.invokeBrowser("Chrome");
		//invokeBrowser("safari"); ..since we are not changing the method to static, that's why we are not using this statement
	}
}
