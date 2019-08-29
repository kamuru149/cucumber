package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.findElement(By.className("desktop-userIconsContainer")).click();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("kamarudin1493@gmail.com");
		driver.findElement(By.name("password")).sendKeys("kamarudin1493@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("77305380955");
		driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
		driver.findElement(By.className("register-register-button")).click();
	}

}
