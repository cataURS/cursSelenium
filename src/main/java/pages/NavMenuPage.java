package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumWrappers;

public class NavMenuPage extends SeleniumWrappers{

	//public WebDriver driver;
	
	public NavMenuPage(WebDriver driver) {
		//this.driver = driver;
		super(driver);
		
	}
	
	//locatori
	//driver.findElement(By.linkText("BOOKS"));
	public By shopLink = By.linkText("BOOKS");
	public By loginLink = By.linkText("Login");
	public By contactLink = By.linkText("CONTACTS");
	public By blog = By.linkText("BLOG");
	public By blogClassic = By.linkText("Classic");
	public By postFormats = By.linkText("Post Formats");
	
	
	public By searchIcon = By.cssSelector("button[class*='search_submit']");
	public By searchField = By.cssSelector("input[class='search_field']");
	
	//public By bookPicture = By.cssSelector("img[src*='"+picture+"']");
	
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
   //    NavMenuPage navMenu =  new NavMenuPage(driver);
//	     navMenu.navigateTo(navMenu.shopLink);
//	     ShopPage shopPage = new ShopPage(driver);	

	
	public ShopPage navigateToShop() {
		driver.findElement(shopLink).click();
		return new ShopPage(driver);
	}
	
	public void searchBook(String value) {
		click(searchIcon);
		sendKeys(searchField, value);
		click(searchIcon);
	}
	
	
	public boolean isBookPictureDisplayed(String picture) {
		WebElement element =  driver.findElement(By.cssSelector("div[data-image*='"+picture+"']"));
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
	
	
	
	
}