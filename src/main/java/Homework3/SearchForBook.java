package Homework3;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class SearchForBook extends BaseTest {
		
		@Test
		public void fields() throws InterruptedException {
		   
			List<WebElement> bookCateg = driver.findElements(By.className("sc_tabs_title"));
			WebElement book = driver.findElement(By.cssSelector("h3>a[href='the-forest']"));
			
			System.out.println(bookCateg.size());
			System.out.println(bookCateg);
			
			for(int i=0; bookCateg.size()<=i; i++) {
				bookCateg.get(i).click();
				SoftAssert sa = new SoftAssert();
				sa.assertTrue(book.isDisplayed());
			}
			// nu inteleg de ce nu itereaza prin lista, iese din for cand gaseste elementul
			// sau nu am scris bine get si clickul?
			book.click();
			Assert.assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/" );
		   
		   
		}


	}

