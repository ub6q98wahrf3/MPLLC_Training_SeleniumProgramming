package Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _21_HandlingTableGrids {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/FrameWorks/WorkBench/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		
		int rowCount = table.findElements(By.xpath("//tbody/tr")).size();
		System.out.println(rowCount);
		for(int i=1; i<=rowCount; i++) {
			System.out.println(table.findElement(By.xpath("//tbody/tr["+i+"]/th")).getText());
		}
		
		int sum = 0;
		for(int i=1; i<=rowCount; i++) {
			System.out.println(table.findElement(By.xpath("//tbody/tr["+i+"]/td[4]")).getText());
			String yearString = table.findElement(By.xpath("//tbody/tr["+i+"]/td[4]")).getText();
			int yearInt = Integer.parseInt(yearString);
			sum = sum + yearInt;
		}
		System.out.println("SUM OF ALL THE YEARS: " + sum);
		
		for(int i=1; i<=rowCount; i++) {
			if(table.findElement(By.xpath("//tbody/tr["+i+"]/th")).getText().equals("Burj Khalifa")) {
				if(table.findElement(By.xpath("//tbody/tr["+i+"]/td[3]")).getText().contains("829")) {
					System.out.println("The height of the monument is as expected. Test Case Passed.");
				}else {
					System.out.println("Not as expected. Test Case failed.");
				}
				break;
			}
		}
		System.out.println("Success");
	}
}
