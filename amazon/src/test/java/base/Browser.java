package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browser {
	public static WebDriver launchChromeBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\All Browser\\Chrome versions\\chromedriver32-102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	return driver;
	}
	public static WebDriver launchFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Softwares\\All Browser\\geckodriver64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver; 
	}
	public static WebDriver launchOperaBrowser()
	{
		System.setProperty("webdriver.opera.driver", "D:\\Softwares\\All Browser\\operadriver64\\operadriver_win64 102\\operadriver_win64\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		return driver;
	}
}
