package test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlePopUPWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.gecko.driver","E:\\Automation Testing\\geckodriver-v0.36.0-win32.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.rrc.texas.gov/resource-center/research/gis-viewer/gis-popup-blocker-test/#");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/article/p[3]/a")).click();
		Set <String> handler=driver.getWindowHandles();
        Iterator<String> it=handler.iterator();
        String parentWindows=it.next();
        System.out.println("Main Window Screen:"+parentWindows);
        	
        String childWindows=it.next();
        System.out.println("Child Windows Screen:"+childWindows);
       
        driver.switchTo().window(childWindows);
        System.out.println("childWindows title:"+driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.close();
        
        driver.switchTo().window(parentWindows);
        System.out.println("parent Windows:"+driver.getTitle());
        
		
	}

}
