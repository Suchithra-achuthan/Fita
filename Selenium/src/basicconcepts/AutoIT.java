package basicconcepts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		//Initialize driver
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='imagesrc']/parent::div")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\vbalasub\\Desktop\\Jars\\AutoIDtest1.exe");
	}

}
