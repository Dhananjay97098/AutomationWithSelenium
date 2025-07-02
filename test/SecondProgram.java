package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProgram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
	       driver.get("https://testautomationpractice.blogspot.com/");
	    	String title=driver.getTitle();
	        System.out.println("Website title is:"+title);
	        // 01. Xpath
	        //absolute xpaht should not be used==html/body/div[5]/div[3]/a
	        
	        //only relative xpath should be used===//*[@id=\"name\"]
	        
	        
	   //driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Dhananjay Kumar");
	   //driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("dkjnb01@gmail.com");
	   //driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9709880622");
	     //02. id
	        
	    driver.findElement(By.id("name")).sendKeys("Dhananjay kumar");
	    driver.findElement(By.id("phone")).sendKeys("9709880622");
	     
	     //03.This is only for links
	    //driver.findElement(By.linkText("Udemy Courses")).click();
	     
	    //04.partialLink------do not use this is also for links
	    //driver.findElement(By.partialLinkText("Hidden Element")).click();	 
	    
	    //.05 CSS Selector.
	    //if id is there--#{id}
	    //if class is there---{class}
	     driver.findElement(By.cssSelector("#email")).sendKeys("dkjnb02@gmail.com");
	     //06.ClassName-----this is also not recommended to use 
	     driver.findElement(By.className("hasDatepicker")).sendKeys("25/12/2002");
	}

}
