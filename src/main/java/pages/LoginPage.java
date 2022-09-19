package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
public WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;

	}
	
	public By user= By.id("log");
	public By pass = By.id("password");
	public By subm = By.cssSelector("ul input[class='submit_button']");
	public By loginerror = By.cssSelector("div[class*='sc_infobox_style_error']");
	public By loginsuccess = By.cssSelector("div[class*='sc_infobox_style_success']");
	public By logoutbtn = By.cssSelector("li[class='menu_user_logout']");
	
	
	public void loginapp(String username, String password) {
		driver.findElement(user).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(subm).click();
		
	}
	
	public boolean loginSuccessMessage() {
		return driver.findElement(loginsuccess).isDisplayed();
		
	}
	
	public void logout() {
		
		driver.findElement(logoutbtn).click();
		
	}
	
	
}
