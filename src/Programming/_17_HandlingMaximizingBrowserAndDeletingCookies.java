package Programming;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _17_HandlingMaximizingBrowserAndDeletingCookies {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/TEST/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/autocomplete/");
//		driver.manage().deleteAllCookies();
//		driver.manage().deleteCookie(new Cookie(null, null));
//		driver.manage().deleteCookieNamed("__utmc");
		driver.manage().addCookie(new Cookie("Love","MyValue"));
		System.out.println("New Cookie Added");
		System.out.println("Cookie: " + driver.manage().getCookieNamed("__utmc"));
	}
}
