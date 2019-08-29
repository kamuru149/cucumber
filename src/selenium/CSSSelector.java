package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CSSSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Kamarudin");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("basha");
		Select select = new Select(driver.findElement(By.cssSelector("select[name='birthday_day']")));
		select.selectByIndex(14);
		Select select1=new Select(driver.findElement(By.cssSelector("#month")));
		select1.selectByVisibleText("Sept");
		Select select2=new Select(driver.findElement(By.cssSelector("#year")));
		select2.selectByValue("1993");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("input[name='reg_email__']"))).click().keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("av").keyDown(Keys.SHIFT).sendKeys("in").build().perform();
		
		
	}

}
