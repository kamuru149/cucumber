package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		//Thread.sleep(10000);
		 List<WebElement> drop = driver.findElements(By.xpath("//ul[@class='sbsb_b']/li"));
		// int dropcount = drop.size();
		 System.out.println(drop.size());
		 for(int i=0;i<drop.size();i++) 
		 {
			 WebElement reqdrop=drop.get(i);
			 String reqdroptext = reqdrop.getText();
			 if(reqdroptext.equalsIgnoreCase("Selenium Testing"))
			 { 
			 reqdrop.click();
			 }
		 }
	}	

}
