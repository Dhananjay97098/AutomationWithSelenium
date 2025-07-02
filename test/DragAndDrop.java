package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
   Actions action=new Actions(driver);
   Thread.sleep(5000);
   action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
          .moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
        
	    driver.quit();
}
}