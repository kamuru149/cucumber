package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		/*System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
		driver.findElement(By.cssSelector("body > form > table:nth-child(17) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > table > tbody > tr:nth-child(6) > td:nth-child(2) > a > img")).click();
		driver.switchTo().alert().accept();
		
		*/
		
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		

		
		//System.out.println("Current window Name : "+windowName + windowTitle +"window title");
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		
		String windowName = driver.getWindowHandle();
		String windowTitle = driver.getTitle();

		System.out.println(windowName);
		System.out.println(windowTitle);
		
		WebElement clickLogin = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div[1]/div/ul/li[9]/a"));
		clickLogin.click();
	
		WebElement enterMobile = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		enterMobile.sendKeys("sample@cc.com");
		
		WebElement enterPassword = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		enterPassword.sendKeys("sample");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Thread.sleep(3000);
		
		//Explicit wait 
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
		
		WebDriverWait expliWait = new WebDriverWait(driver, 30);
		expliWait.until(ExpectedConditions.elementToBeClickable(loginButton));
		
		loginButton.click();
		
		
		//Select selctvalue = new Select(driver.findElement(By.id("")));
		
		
		
		
		
	}

}
