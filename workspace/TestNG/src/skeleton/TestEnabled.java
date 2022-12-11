package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestEnabled {

	@BeforeTest
	public void Open() {
		TestPriority.driver.set(new ChromeDriver());
		TestPriority.driver.get().get("http://demo.borland.com/gmopost/");

		TestPriority.driver.get().manage().window().maximize();

	}

@Test(enabled = false)
public void browse()
{
	TestPriority.driver.get().findElement(By.name("bBrowserTest")).click();
}

}
