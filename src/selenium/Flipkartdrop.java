package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("sb_form_q")).sendKeys("casio");
		List<WebElement> bing = driver.findElements(By.xpath("//ul[@class='sa_drw']/li"));
		for(int i=0;i<bing.size();i++) {
			
		if(i==3)
			{			
			bing.get(3).click();
		
			}
		
		WebElement a =driver.findElement(By.xpath("//ul[@class='sa_drw']/li"));
		if(a.getAttribute("value").contains("Pangea"))
			a.click();
		if(a.isDisplayed())
		{
			if (a.isEnabled())
			{
				if (a.isSelected())
				{
					a.click();
				}
			}
		} 
		
		}
		

	}

}
