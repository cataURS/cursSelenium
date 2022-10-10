package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NavMenuPage;
import utils.BaseTest;

public class DataProviderExample extends BaseTest{
	
	@DataProvider
	public Object[][] loginTestData(){
		
		Object[][] data = new Object[4][3];
		
		data[0][0] = "TestUser";
		data[0][1] = "12345@67890";
		data[0][2] = true;
		
		data[1][0] = "UserGresit";
		data[1][1] = "parolagresita";
		data[1][2] = false;
		
		data[2][0] = "UserGresit";
		data[2][1] = "parolagresita";
		data[2][2] = true;
		
		data[3][0] = "UserGresit2";
		data[3][1] = "parolagresita2";
		data[3][2] = false;
		
		return data;
	}
	
	@Test(dataProvider = "loginTestData")
	public void LoginTest(String Username, String password, boolean success) {
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp(Username, password);
		
		if(success) {
			login.logoutFromApp();
		}else if(!success) {
			
		}
		
	}

}
