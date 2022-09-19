package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SAPage {

public WebDriver driver;
	
	public SAPage(WebDriver driver) {
		this.driver = driver;
		
	}

	public By Drama = By.cssSelector("div[data-stop='95']");
	public By Biography = By.cssSelector("div[data-stop='75']");
	public By Cookbooks = By.cssSelector("div[data-stop='82']");
	
	//am incercat initial cu nth of type dar nu vrea sinu inteleg de ce, nth-of-type(1)le gasea pe toate, wtf
	//"div[class='sc_skills_total']:nth-of-type(2)"
	//"div[class='sc_skills_total']:nth-of-type(3)"
	
	public String gettext(By locator) {
		
		return driver.findElement(locator).getText();
	}
	
}
