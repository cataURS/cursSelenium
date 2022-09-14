package Homework6;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.BaseTest;

public class alertsJS extends BaseTest{
	
	@Test
	public void interractAlertsJS() {
		
		WebElement book = driver.findElement(By.cssSelector("h3>a[href='the-forest']"));
		book.click();
		
		WebElement review = driver.findElement(By.cssSelector("a[href='#tab-reviews']"));
		review.click();
		
		WebElement submit = driver.findElement(By.cssSelector("input[name='submit']"));
		submit.click();
		
		Alert alertJS = driver.switchTo().alert();
		alertJS.accept();
		
		WebElement star = driver.findElement(By.cssSelector("a[class='star-4']"));
		star.click();
		
		WebElement message = driver.findElement(By.cssSelector("textarea[name='comment']"));
		message.sendKeys("Haven't read it but i heard it sucks! 333");
		
		WebElement name = driver.findElement(By.cssSelector("input[name='author']"));
		name.sendKeys("Catalin");
		
		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		email.sendKeys("test@java.org");
		submit.click();
		
		WebElement approval = driver.findElement(By.cssSelector("em[class='woocommerce-review__awaiting-approval']"));
		assertEquals(approval.getText(), "Your review is awaiting approval");
		//Assert.assertTrue(approval.getAttribute("innerHTML").contains("awaiting approval"));

		
	}

}
