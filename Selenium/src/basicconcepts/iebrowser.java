package basicconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class iebrowser {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.ie.driver","C:\\Users\\vbalasub\\Desktop\\Jars\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.findElement(By.id("gsc-i-id1")).sendKeys("Web");
		driver.findElement(By.id("gs_st50")).click();
		driver.findElement(By.id("gsc-i-id1")).sendKeys("chrome");
		driver.findElement(By.id("gsc-i-id1")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("gsc-i-id1")).sendKeys(Keys.ENTER);
		
		
		
	}

}
