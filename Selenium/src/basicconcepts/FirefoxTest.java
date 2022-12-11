package basicconcepts;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
public class FirefoxTest {
	public static void main(String[] args) throws FindFailed {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vbalasub\\Desktop\\Jars\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		Screen scnobj1= new Screen();
		Pattern patobj1= new Pattern("C:\\Users\\vbalasub\\Desktop\\Images\\Sign-in.PNG");
		scnobj1.click(patobj1);
		Pattern patobj2= new Pattern("C:\\Users\\vbalasub\\Desktop\\Images\\Email.PNG");
		scnobj1.type(patobj2,"abc@gmail.com");
		Pattern patobj3= new Pattern("C:\\Users\\vbalasub\\Desktop\\Images\\Password.PNG");
		scnobj1.type(patobj3,"Testing1");
		Pattern patobj5= new Pattern("C:\\Users\\vbalasub\\Desktop\\Images\\Logo.PNG");
		scnobj1.click(patobj5);
		Pattern patobj4= new Pattern("C:\\Users\\vbalasub\\Desktop\\Images\\Enterbutton.PNG");
		scnobj1.click(patobj4);
	
	
		}

}
