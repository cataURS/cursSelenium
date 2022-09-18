package Curs8;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class fluentWait extends BaseTest {

	@Test
	public void testWait() {
		
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
	//	WebElement finish =  driver.findElement(By.cssSelector("div[id='finish']>h4"));

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500));
			//	.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("finish"), "Hello World!"));			
		
		
		//assertEquals(finish.getText(), "Hello World!");
		
	}
	
}