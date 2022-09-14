package Homework4;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ContactUs extends BaseTest{
	
	@Test
	public void message() throws InterruptedException {
		
		WebElement contact = driver.findElement(By.cssSelector("ul[id='menu_main'] a[href*='contacts']"));
		contact.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/contacts/" );
		
		WebElement name = driver.findElement(By.cssSelector("input[name='your-name']"));
		name.sendKeys("Catalin");
		
		WebElement email = driver.findElement(By.cssSelector("input[name='your-email']"));
		email.sendKeys("test@java.org");
		
		WebElement subject = driver.findElement(By.cssSelector("input[name='your-s']"));
		subject.sendKeys("Test Subject");
		
		WebElement message = driver.findElement(By.cssSelector("textarea[name='your-message']"));
		message.sendKeys("Sorry for being late with my homeworks. Can i read a book instead?");
		
		WebElement send = driver.findElement(By.cssSelector("input[value='Send Message']"));
		//ar fi mai buleltproof dupa type='submit' posibil sa se modifice mai greu valoarea aia
		//am zis sa fol si value ca ceva mai altceva
		
		send.click();
		Thread.sleep(2000);
		WebElement confirmation = driver.findElement(By.cssSelector("div[class='wpcf7-response-output']"));
		//ma bate, am incercat si cu getText() dar tot nu reusesc sa iau valoarea dintre ><
		//task failed successfully
		//assertEquals(confirmation.getAttribute("value"), "Thank you for your message. It has been sent.");
		//hai ca am gasit
		Assert.assertTrue(confirmation.getAttribute("innerHTML").contains("Thank you for your message. It has been sent."));
		
		
	}

}
