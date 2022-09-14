package Curs8;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ImplicitWait extends BaseTest{
	
	@Test
	public void testWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement button = driver.findElement(By.cssSelector("div[id='start']>button"));
		button.click();
		
		WebElement text = driver.findElement(By.cssSelector("div[id='finish']"));
		assertEquals(text.getText(), "Hello World!");
		
		
	}

}
