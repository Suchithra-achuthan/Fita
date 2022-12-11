package basicconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		//Initialize driver
		driver = new ChromeDriver();
		driver.get("http://demo.borland.com/gmopost/online-catalog.htm");
		driver.manage().window().maximize();
		List<WebElement> table = driver.findElements(By.xpath("//td[@align='center']//table//tr/td[1]"));
//		List<WebElement> table2 =driver.findElements(By.xpath("//input[@type='text']"));
		
		for(WebElement temp:table) {
				if(temp.getText().contains("1001"))
				{
					WebElement temp2 =driver.findElement(By.xpath("//td[text()='1001']/parent::tr/td[4]/h1/input"));
					temp2.click();
					temp2.sendKeys("30");
				}
				
			}
		}	 

	}

