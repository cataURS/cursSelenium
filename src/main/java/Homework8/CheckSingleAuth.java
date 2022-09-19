package Homework8;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.NavMenuPage;
import pages.SAPage;
import utils.BaseTest;

public class CheckSingleAuth extends BaseTest {

	@Test
	public void checkGraph() throws InterruptedException {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		SAPage sa = new SAPage(driver);
		navMenu.navigateTo(navMenu.singleAuthor);
		Thread.sleep(4000);
		assertEquals(sa.gettext(sa.Drama), "95%");
		assertEquals(sa.gettext(sa.Biography), "75%");
		assertEquals(sa.gettext(sa.Cookbooks), "82%");
			
		
	}

}
