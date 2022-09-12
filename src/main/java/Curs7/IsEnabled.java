package Curs7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class IsEnabled extends BaseTest {
	
	@Test
	public void isEnabledExample() {
		
		WebElement loginPopup = driver.findElement(By.cssSelector("li>a[href='#popup_login']"));
		
		System.out.println(loginPopup.isEnabled());
		
	}

}
