package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNGEx {
	WebDriver driver;
	@Test(priority=-4)
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority=-3)
	public void getPage() {
		driver.get("https://accounts.google.com");
	}
	@Test(priority=-2)
	public void login() throws InterruptedException {
		driver.findElement(By.id("identifierId")).sendKeys("kamarudin1493@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("kamarudin1993");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
}
