package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPriority {
	// static WebDriver driver;
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	@BeforeSuite(alwaysRun = true)
	public void Initialize() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		
	}

	@BeforeTest
	public void Open() {
		driver.set(new ChromeDriver());
		driver.get().get("http://demo.borland.com/gmopost/");

		driver.get().manage().window().maximize();

	}

	@Test(groups = { "GMO" }, priority = 0)
	public void EnterGMO() {
		driver.get().findElement(By.name("bSubmit")).click();
		System.out.println("Enter TEst prioirity method1");
	}

}
