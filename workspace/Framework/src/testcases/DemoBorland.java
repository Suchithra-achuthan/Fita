package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import scripts.KeywordMethods;

public class DemoBorland {
WebDriver driver;
KeywordMethods keyobj = new KeywordMethods();

@BeforeClass
public void Initialize()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.borland.com/gmopost/");
	driver.manage().window().maximize();
	
}
@DataProvider
public String[][] datapassing() throws IOException
{
	return utilityreader.ExcelReader.getexceldata("BorlandTestdata.xls","Sheet1");
}
@DataProvider
public String[][] AboutData() throws IOException
{
	return utilityreader.ExcelReader.getexceldata("BorlandTestdata.xls","Sheet2");
}
@Test(dataProvider= "datapassing")
public void EnterGMO(String Keyword , String Locator , String InputData , String Purpose) throws IOException
{
	keyobj.keywordvalidation(driver, Keyword, Locator, InputData, Purpose);
	
}
@Test(dataProvider= "AboutData")
public void AboutGMO(String Keyword , String Locator , String InputData , String Purpose) throws IOException
{
	keyobj.keywordvalidation(driver, Keyword, Locator, InputData, Purpose);
	driver.navigate().back();
}
@AfterClass
public void close()
{
	System.out.println(driver.getCurrentUrl());
	driver.close();
}

}
