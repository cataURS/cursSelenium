package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class SearchForBook extends BaseTest {
		
		@Test
		public void fields() throws InterruptedException {
		   
		   WebElement field1 = driver.findElement(By.id("log"));
		   WebElement field2 = driver.findElement(By.id("password"));
		   
		   driver.findElement(By.className("menu_user_login")).isDisplayed();
		   SoftAssert sa = new SoftAssert();
		   sa.assertFalse(field1.isDisplayed());
		   sa.assertFalse(field2.isDisplayed());

		   driver.findElement(By.className("menu_user_login")).click();
		   //Thread.sleep(3000);
		   sa.assertTrue(field1.isDisplayed());
		   sa.assertTrue(field2.isDisplayed());
		   sa.assertAll();
		   //Thread.sleep(3000);
		}


	}

