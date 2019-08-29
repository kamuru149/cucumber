package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.id("uh-search-box")).sendKeys("eminem");//how to take xpath for the list
		Thread.sleep(5000);
		List<WebElement> drop=driver.findElements(By.xpath("//ul[@class='yui3-aclist-list']/li"));
		for(int i=0;i<drop.size();i++) {
				WebElement Reqdrop = drop.get(i);
				String Reqdropdown = Reqdrop.getText();
				if(Reqdropdown.equalsIgnoreCase("Eminem songs"))
				{
					Reqdrop.click();
					break;
					
				}
		}
	}

}
