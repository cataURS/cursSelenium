package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavMenuPage {

	public WebDriver driver;
	
	public NavMenuPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//locatori
	//driver.findElement(By.linkText("BOOKS"));
	public By shopLink = By.linkText("BOOKS");
	public By loginLink = By.linkText("Login");
	public By contactLink = By.linkText("CONTACTS");
	
	
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
	
	
	
	
	
}