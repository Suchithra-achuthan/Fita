package basicconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args)
	{
	WebDriver driver; 
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
	//Initialize driver
	driver = new ChromeDriver();
	
     driver.manage().window().maximize();
     driver.get("https://www.selenium.dev/");
     driver.findElement(By.id("gsc-i-id1")).sendKeys("chrome");
     driver.findElement(By.id("gsc-i-id1")).sendKeys(Keys.ENTER);
//     driver.findElement(By.className("search-icon")).click();
		
	}

}
