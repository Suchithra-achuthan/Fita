package basicconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws FindFailed {
		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		//Initialize driver
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Screen scnobj1= new Screen();
		Pattern patobj1= new Pattern("C:\\Users\\vbalasub\\Desktop\\Images\\Sign-in.PNG");
		scnobj1.click(patobj1);
		
		Pattern patobj2= new Pattern("C:\\Users\\vbalasub\\Desktop\\Images\\Email.PNG");
		scnobj1.wait(patobj2,10);
		scnobj1.type(patobj2,"abc@gmail.com");
	
	}
	
}