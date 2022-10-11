package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShopPage {
	
	
	public WebDriver driver;
	public WebElement dropdown;
	public Select select;
	
	public ShopPage(WebDriver driver) {
		this.driver = driver; }
	
	
	public By orderDropdown =  By.name("orderby");
	public By firstBook = By.cssSelector("ul>li[class*='product']:nth-of-type(1) div span bdi>span");
	public By lastBook = By.cssSelector("ul>li[class*='product']:nth-of-type(1) div span bdi>span");
	
	
	public void selectByValue(String value) {
		dropdown =  driver.findElement(orderDropdown);
		select =  new Select(dropdown);
		select.selectByValue(value);
	}
	
	public void selectByIndex(int index) {
		dropdown =  driver.findElement(orderDropdown);
		select =  new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public void selectByVisibleText(String text) {
		dropdown =  driver.findElement(orderDropdown);
		select =  new Select(dropdown);
		select.selectByVisibleText(text);
	}
	
	public String getSelectedOption() {
		dropdown =  driver.findElement(orderDropdown);
		select =  new Select(dropdown);
		return select.getFirstSelectedOption().getText();
	}

	
	public boolean validate(By locator) {
		   return  driver.findElement(locator).isDisplayed();
		}
	
	public void validateMin() {
		int first = Integer.valueOf(driver.findElement(firstBook).getText());
		int last = Integer.valueOf(driver.findElement(lastBook).getText());
		assertTrue(first<last);
	}
}
