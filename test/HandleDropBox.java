package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://testautomationpractice.blogspot.com/");
    //handle a drop box:
    Select select=new Select(driver.findElement(By.id("comboBox")));
    select.selectByVisibleText("Item 2");
    
	}

}
