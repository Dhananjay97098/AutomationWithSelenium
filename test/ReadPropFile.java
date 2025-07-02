package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {
       
    	Properties prop = new Properties();
        FileInputStream fi = new FileInputStream("D:\\MavenWithSeleniumProject\\SecondSeleniumproj\\src\\main\\java\\test\\config.properties");
        
        prop.load(fi);

        String browserName = prop.getProperty("Browser");  // Changed from "Broswer" to "Browser"
        String url = prop.getProperty("URL");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "E:\\Automation Testing\\geckodriver-v0.36.0-win32\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Browser not supported!");
            return;
        }

        // Load the URL (use variable, not string)
        driver.get(url);

        // Optional: Sample element interaction
        // driver.findElement(By.xpath(prop.getProperty("FirstName_xpath"))).sendKeys("firstName");
    }

		
	}


