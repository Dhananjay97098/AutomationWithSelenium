package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AleartAndPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.Driver","E:\\Automation Testing\\chromedriver-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signin-btn")).click();//go under the submit buttons
		//driver.wait(10);
		//Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
System.out.println(alert.getText());
alert.accept();//click in OK btn
//alert.dismiss();//also doing same
	}

}
