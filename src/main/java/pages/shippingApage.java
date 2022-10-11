package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class shippingApage {
	
public WebDriver driver;
public Select select;

	
	public shippingApage(WebDriver driver) {
		this.driver = driver;
		
	}

	public By countryRegion =  By.id("shipping_country");
	public By province =  By.id("shipping_state");
	
	public void selectByValue(String value) {
		WebElement dropdown = driver.findElement(province);
		select =  new Select(dropdown);
		select.selectByValue(value);
	}
	
	public void selectByIndex(int index) {
		WebElement dropdown = driver.findElement(countryRegion);
		select =  new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public String getSelectedCountry() {
		WebElement dropdown = driver.findElement(countryRegion);
		select =  new Select(dropdown);
		return select.getFirstSelectedOption().getText();
	}
	
	public String getSelectedProvince() {
		WebElement dropdown = driver.findElement(province);
		select =  new Select(dropdown);
		return select.getFirstSelectedOption().getText();
	}
	
}
