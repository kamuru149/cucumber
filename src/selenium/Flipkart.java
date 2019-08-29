package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		//driver.findElement(By.linkText("Signup")).click();
		//driver.findElement(By.xpath("//span[text()='Forgot?']")).click();
		//driver.findElement(By.className("_2zrpKA")).sendKeys("7305380955");
		//driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		driver.findElement(By.className("LM6RPg")).sendKeys("casio gshock white");//how to handle dropdowns		}
		driver.findElement(By.className("vh79eN")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'G674')]")).click();
		driver.findElement(arg0)
}
}