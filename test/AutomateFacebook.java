package Facebook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.agent.builder.AgentBuilder.Ignored;

public class AutomateFacebook {
	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver","E:\\Automation Testing\\chromedriver-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		driver.findElement(By.name("firstname")).sendKeys("Dhananjay");
		driver.findElement(By.name("lastname")).sendKeys("Kumar Singh");
		
		WebElement addDay=driver.findElement(By.name("birthday_day"));
		Select selectDate=new Select(addDay);
		selectDate.selectByVisibleText("15");
		
		WebElement addMonth=driver.findElement(By.id("month"));
		Select selectMonth=new Select(addMonth);
		selectMonth.selectByVisibleText("Jun");
		
		WebElement addYear=driver.findElement(By.name("birthday_year"));
		Select selectYear=new Select(addYear);
		selectYear.selectByVisibleText("2003");
		
		WebElement maleRadio=driver.findElement(By.xpath("//label[text()='Male']"));
		maleRadio.click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[6]/div/div[1]/input")).sendKeys("9709880632");
		driver.findElement(By.id("password_step_input")).sendKeys("Dhananjay@1234");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
		
	}

}
