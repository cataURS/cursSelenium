package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NavMenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginTest() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		LoginPage logpage = new LoginPage(driver);
		logpage.loginapp("TestUser", "12345@67890");
		assertTrue(logpage.loginSuccessMessage());
		logpage.logout();
		
	}

}