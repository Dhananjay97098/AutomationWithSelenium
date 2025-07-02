package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
	    driver.manage().timeouts().pageLoadTimeout(4,TimeUnit.SECONDS);//this method is deprecated in new Selenium version.

	   // driver.quit();
	    
	}

}
