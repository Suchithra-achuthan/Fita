package basicconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		//Initialize driver
		driver = new ChromeDriver();
		driver.get("http://demo.borland.com/gmopost/");
		driver.manage().window().maximize();
		driver.findElement(By.name("bSubmit")).click();
		driver.findElement(By.partialLinkText("3")).click();
		driver.navigate().back();
		System.out.println(driver.findElement(By.partialLinkText("Sun")).getAttribute("href"));
		driver.findElement(By.name("QTY_TENTS")).clear();
		driver.findElement(By.name("QTY_TENTS")).sendKeys("20");
		driver.findElement(By.name("bSubmit")).click();
		driver.findElement(By.name("bSubmit")).click();
		driver.findElement(By.name("billName")).sendKeys("Venky");
		driver.findElement(By.name("billAddress")).sendKeys("25 Woodbine Rd");
		driver.findElement(By.name("billCity")).sendKeys("Natick");
		driver.findElement(By.name("billState")).sendKeys("MA");
		driver.findElement(By.name("billZipCode")).sendKeys("01760");
		driver.findElement(By.name("billPhone")).sendKeys("9777877844");
		driver.findElement(By.name("billEmail")).sendKeys("zyx@gmail.com");
		driver.findElement(By.name("CardNumber")).sendKeys("7673-741374-78368");
		driver.findElement(By.name("CardDate")).sendKeys("09/22");
		driver.findElement(By.name("shipSameAsBill")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("bSubmit")).click();
		String s1=driver.findElement(By.xpath("//h4")).getText();
		if(s1.contentEquals("Thank you for shopping with Green Mountain Outpost"))
		{
			System.out.println("The Payment is made");
		}
		driver.findElement(By.name("bSubmit")).click();
		driver.close();
		
	}

}
