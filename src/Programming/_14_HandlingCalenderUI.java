package Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
public class _14_HandlingCalenderUI {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/love.vashista/Documents/Eclipse_Workspace/FrameWorks/WorkBench/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        Thread.sleep(5000L);
        driver.findElement(By.xpath("//input[@id='datepicker' and @class='hasDatepicker']")).click();
        //July 2026 23rd
        while(!(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[1]")).getText().equalsIgnoreCase("July")
        		&&
        	  driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[2]")).getText().equalsIgnoreCase("2026"))) {
        	driver.findElement(By.xpath("//a[@data-handler='next']")).click();
        }
        
        int NoOfDays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-handler='selectDay']")).size();
        
        for(int i=0; i<NoOfDays; i++) {
        	if(driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-handler='selectDay']")).get(i).getText().equals("23")) {
        		driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-handler='selectDay']")).get(i).click();
        	}
        }
    }
}