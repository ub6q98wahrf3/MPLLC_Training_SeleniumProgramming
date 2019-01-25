package Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class _16_HandlingSSLCertificates {
	public static void main(String[] args) {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ChromeOptions co = new ChromeOptions();
		co.merge(dc);
		
		System.setProperty("webdriver.chrome.driver", "chromedriver executable file path");
		WebDriver driver = new ChromeDriver();
		
		driver.get("any site containing ssl or insecure certificates that will no longler be present on the screen.");
	}
}
