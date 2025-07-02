package test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public static void main(String[] args) {
   System.setProperty("webdriver.gecko.driver","E:\\Automation Testing\\geckodriver-v0.36.0-win32");
    WebDriver driver = new ChromeDriver();
	
	 driver.get("www.google.com");
	  
		/*
		 * String title= driver.getTitle(); System.out.println(title);
		 * 
		 * if(title.equals("Google")) { System.out.println("Correct tiitle"); } else {
		 * System.out.println("in-correct title"); }
		 * System.out.println(driver.getCurrentUrl()); //4 driver.quit();
		 */	  
    }
}

