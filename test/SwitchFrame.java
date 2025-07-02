package test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webDriver.chrome.Driver", "E:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();//maximize windows
        driver.manage().deleteAllCookies();//delete all the cookies
//dynamic wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://ui.cogmento.com/");
        driver.findElement(By.name("email")).sendKeys("dkjnb01@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Dhananjay@1234");
        Thread.sleep(5000);
 //       driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[4]")).click();
 //       driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[4]")).click(); 
        driver.findElement(null);
          driver.findElement(By.xpath("//div[text()='Login']")).click();
        System.out.println("login succesfully");
        
        
		
	}

}
