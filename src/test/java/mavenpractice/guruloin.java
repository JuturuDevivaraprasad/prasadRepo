package mavenpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guruloin {
	
	@Test
	public void gurulogin() {

   WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demo.guru99.com/v4/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement UserId = driver.findElement(By.xpath("//input[@name=\"uid\"]")); 
	UserId.sendKeys("mngr406136"); 
			

	WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
	password.sendKeys("Prasad@414");
	password.sendKeys(Keys.ENTER);

	
}
}