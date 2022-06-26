package testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Browser;
import pomClasses.HeaderHomePage;

public class VerifyHeaderHomePage {
WebDriver driver;
HeaderHomePage search;
@Parameters ("browserName")
@BeforeTest
public void launchBrowser(String browser) {
	System.out.println(browser);
	if (browser.equals("Chrome"))
	{
		driver = Browser.launchChromeBrowser();
		
	}
	if (browser.equals("Firefox"))
	{
		driver = Browser.launchFirefoxBrowser();
	}
	if (browser.equals("Opera"))
	{
	driver = Browser.launchOperaBrowser();
	}
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@BeforeClass
public void POMObject()
{
	search = new HeaderHomePage(driver);
}
@BeforeMethod
public void loginToApplication(){
driver.get("https://www.amazon.in/");
}
@Test(priority = 2)
public void urlandtitleverfy() {
	String title = driver.getTitle();
	System.out.println(title);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title);	
	//Assert.assertEquals("https://www.amazon.in/", url);	
	System.out.println("Test A");
}
@Test(priority = 1)
public void search() throws InterruptedException {

search.clicksearch();
search.clicksearchsubmit();
System.out.println("Test B");
Thread.sleep(1000);
}
@Test(priority = 3)
public void searchByAllCategory() throws InterruptedException {
search.clickAllCategories();
Thread.sleep(2000);
search.accountlist(driver);
search.clicksearch();
Thread.sleep(2000);
search.clicksearchsubmit();
Thread.sleep(2000);
System.out.println("Test C");
} 
@AfterMethod
public void logoutToApplication() {
System.out.println("We are tester");	
}
@AfterClass
public void clearObject()
{
	search=null;
}
@AfterTest 
public void CloseBrowser() {
driver.close();
System.gc();
driver=null;
System.out.println("------?????-----");
}
}
