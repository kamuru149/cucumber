package selenium;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNGExample {
	WebDriver driver;
		@Test(priority=-3)
	public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void maximize() {
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void appLaunch() {
		driver.get("https://www.facebook.com/");
		
	}
	@Test(priority=3)
	public void login() {
		driver.findElement(By.id("email")).sendKeys("kamuru149@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("yuvajohnedjp");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}
	@Test(priority=4)
	public void logout() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.xpath("//span[text()='Log out']")).click();
	}
	public void takeScreenshot() {
		driver = new ChromeDriver();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils
		
	}
	


}
