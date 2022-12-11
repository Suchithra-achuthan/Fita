package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NormalClass {

	@Test
	public void method1() throws InterruptedException
	{
		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		//Initialize driver
		ChromeOptions d = new ChromeOptions();
		d.setHeadless(true);
		driver = new ChromeDriver(d);
		driver.get("http://demo.automationtesting.in/Index.html");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Suchithra");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Achuthan");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("25, Saibaba colony");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("abc@gamil.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9875495468");
		driver.findElement(By.xpath("//input[ @name='radiooptions'and @value='FeMale']")).click();
		System.out.println(driver.findElement(By.xpath("//input[ @name='radiooptions'and @value='FeMale']")).isSelected());
		driver.findElement(By.id("checkbox2")).click();
		System.out.println(driver.findElement(By.id("checkbox2")).isEnabled());
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("testing");
		System.out.println(driver.findElement(By.xpath("//h2")).getText());
		driver.findElement(By.id("submitbtn")).click();
		System.out.println("End");
		
		Thread.sleep(5000);
		driver.close();
		


	}

}
