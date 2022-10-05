package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NavMenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
	
	public LoginTest(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@Test
	public void loginTest() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);

		navMenu.navigateTo(navMenu.loginLink);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp("TestUser", "12345@67890");
		//var1
		assertTrue(loginPage.loginSucessMessageIsDisplayed());
		//var 2
		assertTrue(loginPage.loginMessageIsDisplayed(loginPage.loginSuccessMessage));
		//loginPage.logoutFromApp();
		
	}
	
	@Test(priority =1)
	public void invalidLoginTest() {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp("TestCeva", "12345@67890");
		assertTrue(loginPage.loginErrorMessageIsDisplayed());

	}

}