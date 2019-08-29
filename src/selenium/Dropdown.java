package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("kamarudin");
		driver.findElement(By.name("password")).sendKeys("kamarudin");
		driver.findElement(By.name("login")).click();
		WebElement Departfrom=driver.findElement(By.name("fromPort"));
		
		Select DepartFromOptions=new Select(Departfrom);
		DepartFromOptions.selectByIndex(3);
		//DepartFromOptions.selectByValue("Frankfurt");
		//DepartFromOptions.selectByVisibleText("London");
		WebElement Month=driver.findElement(By.name("fromMonth"));
		
		Select Monthselect = new Select(Month);
		Monthselect.selectByIndex(5);
		
	}

}
