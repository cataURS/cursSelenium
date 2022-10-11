package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ShopPage;
import utils.BaseTest;

public class comparePrices extends BaseTest {
	
	@Test(dependsOnMethods = { "DropdownTest.selectByValueTest" })
	public void compare() {
		LoginPage log = new LoginPage(driver);
		log.loginInApp(null, null);
		ShopPage shop = new ShopPage(driver);
		shop.validateMin();
	}
	
}
