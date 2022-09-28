package Homework11;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.NavMenuPage;
import pages.Shop;
import utils.BaseTest;

public class AssertShopElements extends BaseTest{

	@Test
	public void assertElem(){
		
	Shop shp = new Shop(driver);
	NavMenuPage navi = new NavMenuPage(driver);
	navi.navigateTo(navi.shopLink);
	navi.navigateTo(shp.anyBook);
	assertTrue(shp.validate(shp.h1title));
	assertTrue(shp.validate(shp.stars));
	assertTrue(shp.validate(shp.zoom));
	assertTrue(shp.validate(shp.price));
	assertTrue(shp.validate(shp.description));
	assertTrue(shp.validate(shp.amount));
	assertTrue(shp.validate(shp.addCart));
	assertTrue(shp.validate(shp.tags));
	
	}
}