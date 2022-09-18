package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SAPage {

public WebDriver driver;
	
	public SAPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//locatori
	//driver.findElement(By.linkText("BOOKS"));
	public By Drama = By.cssSelector("input[class='search_field']");
	public By Biography = By.cssSelector("input[class='search_field']");
	public By Cookbooks = By.cssSelector("input[class='search_field']");
	
	public void gettext(By locator) {
		
		driver.findElement(locator).getText();
	}
	
}
