package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HeaderHomePage {
@FindBy (xpath="//div[@class='nav-search-field ']//input")
private WebElement search;

@FindBy (xpath="(// input[@type='submit'])[1]")
private WebElement searchsubmit;

@FindBy (xpath="//select[@id='searchDropdownBox']")
private WebElement allcategories;

//@FindBy (xpath="(// div[@id='nav-search-dropdown-card'])[1]")
//private WebElement optionFurniture ;

public HeaderHomePage (WebDriver driver)
{
PageFactory.initElements(driver, this);
}
public void clicksearch() {
	search.sendKeys("Chairs");
	//search.click();
}
public void clicksearchsubmit(){
	searchsubmit.click();
}
public void clickAllCategories() {
	allcategories.click();
	}
public void accountlist(WebDriver driver) {
	//Actions act = new Actions(driver);
//	act.moveToElement(allcategories).moveToElement(optionFurniture).build().perform();
	Select s= new Select(allcategories);
    s.selectByVisibleText("Furniture");
}

}

