package Homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.BaseTest;

public class BuyBook extends BaseTest{
	
	@Test
	public void AddToCart() throws InterruptedException {
		
		WebElement search = driver.findElement(By.cssSelector("button[title='Open search']"));
		search.click();
		
		WebElement searchField = driver.findElement(By.cssSelector("input[class='search_field']"));
		searchField.sendKeys("The story about me");
		searchField.sendKeys(Keys.RETURN);
		
		WebElement loadMore = driver.findElement(By.cssSelector("div>a[id='viewmore_link']"));
		
		loadMore.click();
		Thread.sleep(2000);
		
		WebElement book = driver.findElement(By.cssSelector("h4>a[href='https://keybooks.ro/shop/the-story-about-me/']"));
		//article div[data-title='The story about me']
		//div[data-title='The story about me']>a>img
		//m-am chinuit ceva pana sa realizez ca trebuie un sleep mai sus, parea ca incarca destul de repede :))
		book.click();
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-story-about-me/" );
		
		WebElement addCart = driver.findElement(By.cssSelector("button[name='add-to-cart']"));
		addCart.click();
		
		WebElement cartMessage = driver.findElement(By.cssSelector("div[role='alert']"));
		cartMessage.isDisplayed();
		Assert.assertTrue(cartMessage.getAttribute("innerHTML").contains("The story about me” has been added to your cart."));
		
		WebElement viewCart = driver.findElement(By.cssSelector("div>a[class='button wc-forward']"));
		viewCart.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/cart/" );
		
	}
	
	@Test
	public void CartOperations() throws InterruptedException {
		
		WebElement increment = driver.findElement(By.cssSelector("span[class='q_inc']"));
		increment.click();
		//se poate face in mai multe feluri
		//si cu sendkeys in field, cu un clear prealabil
		//si cu schimbarea valorii in dom, cred, nu-s foarte sigur :)) ca totusi trebuie apasat un update
		
		WebElement update = driver.findElement(By.cssSelector("button[name='update_cart']"));
		update.click();
		Thread.sleep(2000);
		
		WebElement message = driver.findElement(By.cssSelector("div[class='woocommerce-message']"));
		Assert.assertTrue(message.getAttribute("innerHTML").contains("Cart updated."));
		
		WebElement proceed = driver.findElement(By.cssSelector("a[class^='checkout-button']"));
		proceed.click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/checkout/" );
		
		WebElement billingMessage = driver.findElement(By.cssSelector("div[class='woocommerce-billing-fields']>h3"));
		Assert.assertTrue(billingMessage.getAttribute("innerHTML").contains("Billing details"));
		
		WebElement infoMessage = driver.findElement(By.cssSelector("div[class='woocommerce-additional-fields']>h3"));
		Assert.assertTrue(infoMessage.getAttribute("innerHTML").contains("Additional information"));
		
	}

}
