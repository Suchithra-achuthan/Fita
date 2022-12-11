package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import scripts.KeywordMethods;

public class DemoDataDriven {
	WebDriver driver;
	KeywordMethods keyobj = new KeywordMethods();
	@BeforeClass
	public void Initialize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	
	}
	@DataProvider
	public String[][] method1() throws IOException
	{
		return utilityreader.ExcelReader.getexceldata("testdata.xls","Sheet2");
		
	}

	@Test(dataProvider = "method1")
	public void Register(String FirstName, String LastName, String Address, String Emailid, String Phone, String Gender,String Hobbies,String Language, String Skills, String Country, String Country2, String Year, String Month, String Day, String Password ,String Confirm ) throws IOException, InterruptedException
	{
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(LastName);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(Address);
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(Emailid);
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(Phone);
		driver.findElement(By.xpath("//input[ @name='radiooptions'and @value='"+Gender+"']")).click();
		driver.findElement(By.xpath("//input[@value ='"+Hobbies+"']")).click();
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys(Confirm);
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[text()='"+Language+"']")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//label[text()='Skills']")).click();
		Select skillslt = new Select(driver.findElement(By.id("Skills")));
		skillslt.selectByVisibleText(Skills);
		Select Countryslt = new Select(driver.findElement(By.id("countries")));
		Countryslt.selectByVisibleText(Country);
		driver.findElement(By.xpath("//span[@role='combobox'] ")).click();
		driver.findElement(By.xpath("//li[text()='"+Country2+"']")).click();
		Select Yearslt= new Select(driver.findElement(By.id("yearbox")));
		Yearslt.selectByValue(Year);
		Select Monthslt= new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		Monthslt.selectByValue(Month);
		Select Dayslt= new Select(driver.findElement(By.id("daybox")));
		Dayslt.selectByValue(Day);
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(5000);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
	}
	@AfterClass
	public void close()
	{
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
	}

}
