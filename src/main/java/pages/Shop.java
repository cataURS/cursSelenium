package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Shop {
	
public WebDriver driver;
public WebElement dropdown;
public Select select;

	public Shop(WebDriver driver) {
		this.driver = driver;
		
	}

	public By anyBook = By.xpath("//a[contains(text(), 'Cooking with love')]");
	public By h1title = By.xpath("//h1[@class='product_title entry-title']");
	public By stars = By.xpath("//div[@class='star-rating']");
	public By zoom = By.xpath("//a[contains(@class, 'gallery__trigger')]");
	public By price = By.xpath("//p[@class='price']");
	public By description = By.xpath("//div[contains(@class, 'short-description')]");
	public By amount = By.xpath("//div[@class='quantity']");
	public By addCart = By.xpath("//button[@type='submit' and @name='add-to-cart']");
	public By tags = By.xpath("//div[@class='product_meta']");
	//curs12
	public By orderDropdown = By.xpath("//select[@name='orderby']");
	
	public void selectByValue(String value) {
		dropdown = driver.findElement(orderDropdown);
		select = new Select(dropdown);
		select.selectByValue(value);
	}
	
	public void selectByIndex(int index) {
		dropdown = driver.findElement(orderDropdown);
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public void selectByVisibleText(String text) {
		dropdown = driver.findElement(orderDropdown);
		Select select = new Select(dropdown);
		select.selectByVisibleText(text);
	}
	
	public String getSelectedOption() {
		dropdown = driver.findElement(orderDropdown);
		Select select = new Select(dropdown);
		return select.getFirstSelectedOption().getText();
	}
	
	
	public boolean validate(By locator) {
		   return  driver.findElement(locator).isDisplayed();
		}
}
