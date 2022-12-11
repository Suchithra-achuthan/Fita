package test;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomationPage {
	@Test
	public void Signin()
	{
	WebDriver driver; 
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
	//Initialize driver
	ChromeOptions d = new ChromeOptions();
	d.setHeadless(true);
	driver = new ChromeDriver(d);
	driver.get("http://demo.automationtesting.in/Index.html");
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.id("btn2")).click();
	}
	@Test
	public void Register() throws InterruptedException
	{
		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		//Initialize driver
//		ChromeOptions d = new ChromeOptions();
//		d.setHeadless(true);
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Suchithra");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Achuthan");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("25, Saibaba colony");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("abc1@gamil.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9875995468");
		driver.findElement(By.xpath("//input[ @name='radiooptions'and @value='FeMale']")).click();
		System.out.println(driver.findElement(By.xpath("//input[ @name='radiooptions'and @value='FeMale']")).isSelected());
		driver.findElement(By.id("checkbox2")).click();
		System.out.println(driver.findElement(By.id("checkbox2")).isEnabled());
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("Testing1");
		System.out.println(driver.findElement(By.xpath("//h2")).getText());
		driver.findElement(By.id("submitbtn")).click();
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[text()='Dutch']")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//label[text()='Skills']")).click();
		Select skillslt = new Select(driver.findElement(By.id("Skills")));
		skillslt.selectByVisibleText("Android");
		Select Countryslt = new Select(driver.findElement(By.id("countries")));
		Countryslt.selectByVisibleText("India");
		driver.findElement(By.xpath("//span[@role='combobox'] ")).click();
		driver.findElement(By.xpath("//li[text()='Denmark']")).click();
		Select Yearslt= new Select(driver.findElement(By.id("yearbox")));
		Yearslt.selectByValue("1992");
		Select Monthslt= new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		Monthslt.selectByValue("May");
		Select Dayslt= new Select(driver.findElement(By.id("daybox")));
		Dayslt.selectByValue("14");
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		
	}
	@Test
	public void Alert() throws InterruptedException
	{
		WebDriver driver;
		ChromeOptions d = new ChromeOptions();
		d.setHeadless(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		driver = new ChromeDriver(d);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert1= driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert2= driver.switchTo().alert();
		alert2.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert3= driver.switchTo().alert();
		alert3.sendKeys("Testing");
		alert3.accept();
		
	}

}
