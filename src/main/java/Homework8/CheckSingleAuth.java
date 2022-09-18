package Homework8;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.NavMenuPage;
import pages.SAPage;
import utils.BaseTest;

public class CheckSingleAuth extends BaseTest {

	@Test
	public void checkGraph() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		SAPage sa = new SAPage(driver);
		navMenu.navigateTo(By singleAuthor);
		//de ce nu recunoaste singleAuthor ca locator? sau ce nu ii convine?
		
		assertEquals(sa.gettext(By Drama), "95%");
		
		
		
	}

}
