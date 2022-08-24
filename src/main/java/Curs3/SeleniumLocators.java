package Curs3;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class SeleniumLocators extends BaseTest{

	
	@Test
	public void tagNameLocator() {
		WebElement discoverText = driver.findElement(By.tagName("em"));
		System.out.println(discoverText.getText());
		assertEquals(discoverText.getText(), "Discover");
		
	}
	
}
