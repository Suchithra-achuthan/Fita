package skeleton;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testparameter {
	@Test(groups= {"GMO"},  priority = 3)
	@Parameters("State")
	public void Billing(String State) 
	{
		System.out.println("The heading is "+TestPriority.driver.get().findElement(By.xpath("//h1")).getText());
		TestPriority.driver.get().findElement(By.name("billName")).sendKeys("Venky");
		TestPriority.driver.get().findElement(By.name("billAddress")).sendKeys("25 Woodbine Rd");
		TestPriority.driver.get().findElement(By.name("billCity")).sendKeys("Natick");
		TestPriority.driver.get().findElement(By.name("billState")).sendKeys(State);
		TestPriority.driver.get().findElement(By.name("billZipCode")).sendKeys("01760");
		TestPriority.driver.get().findElement(By.name("billPhone")).sendKeys("9777877844");
		TestPriority.driver.get().findElement(By.name("billEmail")).sendKeys("zyx@gmail.com");
		TestPriority.driver.get().findElement(By.name("CardNumber")).sendKeys("7673-741374-78368");
		TestPriority.driver.get().findElement(By.name("CardDate")).sendKeys("09/22");
		TestPriority.driver.get().findElement(By.name("shipSameAsBill")).click();
		
		TestPriority.driver.get().findElement(By.name("bSubmit")).click();
	}

}
