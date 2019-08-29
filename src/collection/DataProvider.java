package collection;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import selenium.Webdriver;


public class DataProvider {
	ChromeDriver driver;
	@Test(dataProvider="getData")
	public void Login(String username,String password) {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
		
	}
	@dataProvider
	public Object=new Object[][];
	String mba = "abc";
	
	Object mb[] = new Object[5];

	mb[0][1]="abc";
	mb[0][1]="sf";
	mb[0][0]=""; 
	mb[0][0]=""; //mb[iteration][parameters]
	mb[0][1]="";

}
