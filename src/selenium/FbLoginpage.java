package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginpage{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=XDQYWsCHDcWdX7z5k6AM");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.id("email")).sendKeys("asjhdfksa");
		//driver.findElement(By.name("pass")).sendKeys("asjhdfksa");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//driver.findElement(By.xpath("//*[@id="u_0_3"]")).click();
		//*[@id="login_form"]/table/tbody/tr[2]
	}
}