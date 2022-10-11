package Homework12;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.AccountPage;
import pages.LoginPage;
import pages.NavMenuPage;
import pages.shippingApage;
import tests.LoginTest;
import utils.BaseTest;

public class ShippingFields extends BaseTest{
	
	
	@Test(priority = 1)
	public void navigate() {
		
	NavMenuPage nav = new NavMenuPage(driver);
	nav.navigateTo(nav.loginLink);
	LoginPage login = new LoginPage(driver);
	login.loginInApp("TestUser", "12345@67890");
	AccountPage acc = new AccountPage(driver);
	acc.navigateTo(acc.account);
	acc.navigateTo(acc.settings);
	acc.navigateTo(acc.address);
	acc.navigateTo(acc.editShipping);
	}
	
	@Test(priority = 2)
	public void selectCountry() {
		shippingApage ship = new shippingApage(driver);
		ship.selectByIndex(41);
		assertEquals(ship.getSelectedCountry(), "Canada");
		ship.selectByValue("NL");
		assertEquals(ship.getSelectedProvince(), "Newfoundland and Labrador");
	
		
	}
	

}
