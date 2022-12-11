package scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class KeywordMethods {
	SeleniumMethods seleobj = new SeleniumMethods();
	
	public void keywordvalidation(WebDriver driver, String Keyword, String Locator, String InputData, String Purpose) throws IOException
	{
		switch (Keyword)
		{
			case "OpenURL":
			{
				seleobj.OpenURL(driver, InputData);
				break;
			}
			case "Click":
			{
				seleobj.Click(driver, Locator);
				break;
			}
			case "Enter text":
			{
				
				seleobj.Entertext(driver, Locator, InputData);
				break;
			}
			case "Sdropdown":
			{
				seleobj.Sdropdown(driver, Locator, InputData);
				break;
			}
				
			default:
			{
				System.out.println("Invalid keyword");
				break;
			}
		}
}
}