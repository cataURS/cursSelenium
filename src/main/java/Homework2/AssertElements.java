package Homework2;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class AssertElements  extends BaseTest{

	
	@Test
	public void fields() throws InterruptedException {
		
		WebElement field1 = driver.findElement(By.id("log"));
		WebElement field2 = driver.findElement(By.id("log"));
		
		try {
			Assert.assertFalse(field1.isDisplayed());
			Assert.assertFalse(field2.isDisplayed());
		} catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		driver.findElement(By.className("menu_user_login")).click();
		//Thread.sleep(3000);
		field1.isDisplayed();
		field2.isDisplayed();
		//Thread.sleep(3000);
		
		
	}
	
	
}
