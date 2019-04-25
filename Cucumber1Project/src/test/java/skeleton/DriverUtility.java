package skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtility {

	public static WebDriver getDriver(String browser) {
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Driver\\chromedriver.exe");
		return new ChromeDriver();
		
		}
		else {
			return null;
		}
	}

}
