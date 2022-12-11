package skeleton;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class TestDependsOn {

	@Test(groups = { "GMO" },  priority = 1)
	public void EnterQty() throws InterruptedException {
		System.out.println("Enter Depends on  method1");
		TestPriority.driver.get().findElement(By.name("QTY_TENTS")).clear();
		TestPriority.driver.get().findElement(By.name("QTY_TENTS")).sendKeys("20");
		TestPriority.driver.get().findElement(By.name("bSubmit")).click();
	}

	@Test(groups = { "GMO" }, dependsOnMethods = { "EnterQty" },  priority = 2)
	public void proceedorder() throws InterruptedException {
		TestPriority.driver.get().findElement(By.name("bSubmit")).click();
	}
}
