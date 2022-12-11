package basicconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		//Initialize driver
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn2")).click();
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
		

	}

}
