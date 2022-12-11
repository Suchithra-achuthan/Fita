package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestInocationCount {
WebDriver driver;
@AfterTest
public void Exit()
{
	TestPriority.driver.get().close();
}
@Test(invocationCount=1)
public void About()
{
	TestPriority.driver.get().findElement(By.name("bAbout")).click();
	TestPriority.driver.get().navigate().back();
}

}
