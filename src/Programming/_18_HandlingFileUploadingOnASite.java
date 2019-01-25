package Programming;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _18_HandlingFileUploadingOnASite {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/FrameWorks/WorkBench/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://pdf2doc.com/");
		
		driver.findElement(By.xpath("//span[text()='Upload Files']")).click();
		
		Robot r = new Robot();
		
		File src = new File("/Users/love.vashista/Downloads/Docs/Automation Docs/MPLLC_WebAutomationDocumentation.pdf");
		StringSelection ss = new StringSelection(src.getAbsolutePath());
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		r.keyPress(KeyEvent.VK_META);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_META);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.delay(2000);
		
		r.keyPress(KeyEvent.VK_META);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_META);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_G);
	
		r.keyPress(KeyEvent.VK_META);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_META);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.delay(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
