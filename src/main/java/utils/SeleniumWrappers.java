package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class SeleniumWrappers {
	
	public WebDriver driver;
	
	public SeleniumWrappers(WebDriver driver) {
		this.driver = driver;
	}
	
	public void sendKeys(WebElement element, String value) {
		
		try {
			element.clear();
			element.sendKeys(value);
			
		}catch (Exception e) {
			System.out.println("smth went wrong");
		}
	}

}
