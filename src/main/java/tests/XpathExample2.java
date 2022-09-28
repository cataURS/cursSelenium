package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample2 extends BaseTest {
	
	
	 @Test
	 public void xpathExample() {
		
		 //parent
		 WebElement loginPopUp = driver.findElement(By.xpath("//a[contains(@class, 'popup_link')]/parent::li[@class='menu_user_login']"));
		 jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", loginPopUp);
		 loginPopUp.click();

		 //child
		 ////ul[@id='menu_user']/descendant::form[contains(@class, 'popup_form')]/child::div[contains(@class, 'login_field')]/child::input[@id='log']
		 ////ul[@id='menu_user']/descendant::input[@id='log']	
		 ////ul[@id='menu_user']//input[@id='log']
		 WebElement username = driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::form[contains(@class, 'popup_form')]/child::div[contains(@class, 'login_field')]/child::input[@id='log']"));
		 jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", username);
		 username.sendKeys("TestUser");

		 //descendant
		 WebElement password = driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::input[@id='password']	"));
		 jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", password);
		 password.sendKeys("12345@67890");

		 //following-sibling
		 WebElement rememberMe =  driver.findElement(By.xpath("//div[contains(@class, 'login_field')]/following-sibling::div[contains(@class, 'remember_field')]/input"));
		 jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", rememberMe);
		 rememberMe.click();
		 
		 //preceding
		 WebElement submitButton = driver.findElement(By.xpath("//form[contains(@class, 'login_form')]/preceding::input[@class='submit_button']"));
		 jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", rememberMe);
		 submitButton.click();

		 //ancestor
		 
		 
		 
	 }
	

}