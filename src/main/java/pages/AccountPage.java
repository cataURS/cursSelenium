package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
	
public WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		
	}

	public By account = By.cssSelector("li[class='menu_user_controls']");
	public By settings = By.cssSelector("a[href*='profile.php']");
	public By address = By.cssSelector("a[href*='edit-address']");
	public By editShipping = By.cssSelector("a[href*='edit-address/shipping']");
	

	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
}