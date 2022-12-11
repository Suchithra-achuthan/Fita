package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import scripts.KeywordMethods;

public class DemoAutomation {

	WebDriver driver;
	KeywordMethods keyobj = new KeywordMethods();
	@BeforeClass
	public void Initialize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
	
	}
	@DataProvider
	public String[][] method1() throws IOException
	{
		return utilityreader.ExcelReader.getexceldata("testdata.xls","Sheet1");
		
	}

	@Test(dataProvider = "method1")
	public void Register(String Keyword, String Locator, String InputData, String Purpose) throws IOException
	{
		keyobj.keywordvalidation(driver, Keyword, Locator, InputData, Purpose);
	}
	@AfterClass
	public void close()
	{
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
