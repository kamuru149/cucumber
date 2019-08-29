package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlaCab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 WebElement find = driver.findElement(By.tagName("a"));
		 List<WebElement> footer = find.findElements(By.xpath("//div[@id='pageFooter']/div[@role='contentinfo']//tr[3]/td[2]"));
		 //System.out.println(footer.getText());
		 for(int i=0;i<footer.size();i++) {
			 WebElement lang = footer.get(i);
			 String res = lang.getText();
			 if(res.equalsIgnoreCase("Celebrities")) {
				 lang.click();
				 break;
			 }
			 System.out.println(lang);
		 }
		 
		 
	}

}
