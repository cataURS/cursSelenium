package tests;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.NavMenuPage;
import pages.Shop;
import utils.BaseTest;

public class DropdownTest extends BaseTest{
	
	@Test(priority =1)
	public void dropdownByValue() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.shopLink);
		Shop shp = new Shop(driver);
		shp.selectByValue("price");
		assertEquals(shp.getSelectedOption(), "Sort by price: low to high");
	}

}
