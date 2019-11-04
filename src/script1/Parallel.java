package script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel 
{
	public WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
	}
	
	@Parameters("browser")
	@Test
	public void test_parallel(String browser)
	{
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.google.com");
		}
		else if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
		}
		else
		{
			driver=new InternetExplorerDriver();
			driver.get("https://www.google.com");
		}
	}
}