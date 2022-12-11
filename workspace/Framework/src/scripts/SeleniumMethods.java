package scripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumMethods {
	
	public void OpenURL(WebDriver driver, String InputData) throws IOException
	{
		driver.get(InputData);
		this.Screenshot(driver);
		
	}
	public void Click(WebDriver driver, String Locator) throws IOException
	{
		if(Locator.split("~~")[0].equals("xpath"))
		{
			driver.findElement(By.xpath(Locator.split("~~")[1])).click();
		}
		else if(Locator.split("~~")[0].equals("id"))
		{
			driver.findElement(By.id(Locator.split("~~")[1])).click();
		}
		else if(Locator.split("~~")[0].equals("name"))
		{
			driver.findElement(By.name(Locator.split("~~")[1])).click();
		}
		else
		{
			Assert.fail("Invalid locator");
		}
		this.Screenshot(driver);
		
	}
	public void Entertext(WebDriver driver, String Locator, String InputData)
	{
		if(Locator.split("~~")[0].equals("xpath"))
		{
			driver.findElement(By.xpath(Locator.split("~~")[1])).clear();
			driver.findElement(By.xpath(Locator.split("~~")[1])).sendKeys(InputData);
		}
		else if(Locator.split("~~")[0].equals("id"))
		{
			driver.findElement(By.id(Locator.split("~~")[1])).sendKeys(InputData);
		}
		else if(Locator.split("~~")[0].equals("name"))
		{
			driver.findElement(By.name(Locator.split("~~")[1])).sendKeys(InputData);
			
		}
		else
		{
			Assert.fail("Invalid locator");
		}
	}
	public void Sdropdown(WebDriver driver, String Locator, String InputData)
	{
		if(Locator.split("~~")[0].equals("xpath"))
		{
			Select Yearslt= new Select(driver.findElement(By.xpath(Locator.split("~~")[1])));
			Yearslt.selectByValue(InputData);
			
		}
		else if(Locator.split("~~")[0].equals("id"))
		{
			Select Yearslt= new Select(driver.findElement(By.id(Locator.split("~~")[1])));
			Yearslt.selectByValue(InputData);
		}
		else if(Locator.split("~~")[0].equals("name"))
		{
			Select Yearslt= new Select(driver.findElement(By.name(Locator.split("~~")[1])));
			Yearslt.selectByValue(InputData);
			
		}
		else
		{
			Assert.fail("Invalid locator");
		}
	}
	private void Screenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy_mm_dd hh_mm_ss");
		Date date = new Date();
		String dateval=sdf.format(date);
		File ScrFile = scrshot.getScreenshotAs(OutputType.FILE);
		File DesFile = new File(System.getProperty("user.dir")+"\\src\\Output_Images\\"+dateval+".PNG");
		FileUtils.copyFile(ScrFile,DesFile);
		
	}
}

