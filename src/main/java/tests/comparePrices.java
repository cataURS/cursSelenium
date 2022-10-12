package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ShopPage;
import utils.BaseTest;

public class comparePrices extends BaseTest {
	
	@Test
	public void compare() {
		ShopPage shopPage = navMenu.navigateToShop();
		shopPage.selectByValue("price");
		ShopPage shop = new ShopPage(driver);
		System.out.println(shop.firstBook);
		shop.validateMin();
	}
	
}
