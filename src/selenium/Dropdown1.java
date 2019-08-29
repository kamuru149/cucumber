package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("kamarudin");
		driver.findElement(By.name("password")).sendKeys("kamarudin");
		driver.findElement(By.name("login")).click();
		WebElement a = driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']"));
		if(a.isDisplayed()) {
			if(a.isEnabled()) {
				if(a.isSelected()) {
					a.click();
				}
			}
		}
	}

}
