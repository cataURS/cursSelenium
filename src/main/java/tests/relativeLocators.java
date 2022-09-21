package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import utils.BaseTest;

public class relativeLocators extends BaseTest{
	
	@Test
	public void relativeLocators() {
		
		WebElement price10_20 = driver.findElement(RelativeLocator.with(By.xpath("//h5[contains(text(), '$10.20'))]"))
				.toLeftOf(By.xpath(null)));
		
	}
}
