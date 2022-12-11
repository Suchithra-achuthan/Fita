package basicconcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowstest {

	public static void main(String[] args) {
WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		//Initialize driver
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		String s1= driver.getWindowHandle();
//		Opening a page in new tab
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		Set<String> newtab = driver.getWindowHandles();
		for(String temp:newtab)
		{
			if(!temp.contains(s1))
			{
				driver.switchTo().window(temp);
				System.out.println(driver.getCurrentUrl());
				
			}
		}
		driver.switchTo().window(s1);
//		Opening a page in new window
		driver.findElement(By.xpath("//a[@href='#Seperate']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();;
		Set<String> newwindow = driver.getWindowHandles();
		for(String temp2:newwindow)
		{
			if(!temp2.contains(s1))
			{
				driver.switchTo().window(temp2);
				driver.close();
			}
		}
		driver.switchTo().window(s1);
//		Opening many pages in multiple window
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info' and text()='click ']")).click();;
		Set<String> multiwindow = driver.getWindowHandles();
		for(String temp:multiwindow)
		{
			if(!temp.contains(s1))
			{
				driver.switchTo().window(temp);
				System.out.println(driver.getCurrentUrl());
				
			}
		}
		
		
	}

}
