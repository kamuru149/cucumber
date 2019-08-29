package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alibaba {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.alibaba.com");
		driver.findElement(By.cssSelector("div[id='J_SC_header'] [name='SearchText']")).click();
		driver.findElement(By.cssSelector("div[id='J_SC_header'] [name='SearchText']")).sendKeys("perfume bottles");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[1]/div[2]/div/div[2]/div[1]/div/div/a/div/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[1]/div[3]/div/div[2]/div[1]/div/div/a/div/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/button")).click();
		
		driver.quit();
		
		

	}

}
