package Curs8;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class explicitWait extends BaseTest{
	
	@Test
	public void testWait() {
		WebElement button = driver.findElement(By.cssSelector("div[id='start']>button"));
		button.click();
		
		WebElement text = driver.findElement(By.cssSelector("div[id='finish']"));
		assertEquals(text.getText(), "Hello World!");
	}
	

}
