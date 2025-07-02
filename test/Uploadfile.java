package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {
	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver","E:\\Automation Testing\\chromedriver-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\DHANANJAY\\OneDrive\\Desktop\\project review2.docx");
	
		driver.findElement(By.xpath("//*[@id=\"post-206\"]/div/div[3]/form/input[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"PKVDd5\"]/div/label/input")).isSelected();
		driver.findElement(By.id("checkbox")).click();
	}

}
