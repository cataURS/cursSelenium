package Homework14;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.NavMenuPage;
import utils.BaseTest;

public class HomeBooksValidation extends BaseTest{
	
	@DataProvider
	public Object[][] Books(){
		
		Object[][] data = new Object[6][2];
		
		HomePage home = new HomePage(driver);
		
		data[0][0] = home.book1;
		data[0][1] = "https://keybooks.ro/shop/the-forest/";
		
		data[1][0] = home.book2;
		data[1][1] = "https://keybooks.ro/shop/the-son/";
		
		data[2][0] = home.book3;
		data[2][1] = "https://keybooks.ro/shop/life-in-the-garden/";
		
		data[3][0] = home.book4;
		data[3][1] = "https://keybooks.ro/shop/the-long-road-to-the-deep-silence/";
		
		data[4][0] = home.book5;
		data[4][1] = "https://keybooks.ro/shop/its-a-really-strange-story/";
		
		data[5][0] = home.book6;
		data[5][1] = "https://keybooks.ro/shop/storm/";
		
		return data;

	}
	//cred ca puteam trece chiar in provider css selector si sa renunt la locatori
	//dar parca e contrar a ceea ce am invatat pana acum :))
	
	@Test(dataProvider = "Books")
	public void bookNavigate(By book, String address) {
		HomePage home = new HomePage(driver);
		home.navigateValidate(book, address);
		NavMenuPage nav = new NavMenuPage(driver);
		nav.navigateTo(nav.homeLink);
	}
}
