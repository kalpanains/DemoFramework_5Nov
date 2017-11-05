package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getBrowser(String browsername)
	
	{
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		
		}
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
		//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Webdriver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",DataProviderFactory.getConfig().getChromePath());
			driver = new ChromeDriver();
			
		
		}
		return driver;

}
	
	public static void closeBrowser(WebDriver ldriver){
		ldriver.quit();
	}

}


