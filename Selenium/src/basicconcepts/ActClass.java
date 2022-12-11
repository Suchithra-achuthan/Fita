package basicconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActClass {

	public static void main(String[] args) {
		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		//Initialize driver
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Actions actionobj = new Actions(driver);
		actionobj.click(driver.findElement(By.id("highlight-addons"))).build().perform();
		actionobj.click(driver.findElement(By.xpath("//a[text()='SpiceMax ']"))).build().perform();
		actionobj.moveToElement(driver.findElement(By.id("Login"))).build().perform();
		actionobj.click(driver.findElement(By.id("ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_ConfirmationNumber"))).build().perform();
		actionobj.keyDown(Keys.SHIFT).sendKeys("hjijgf").build().perform();
		
		
	}
}

