package Homework16;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Portfolio2Columns;
import utils.BaseTest;

public class Hover extends BaseTest{
	
	@DataProvider
	public Object[][] Articles(){
		
		Object[][] data = new Object[15][3];
		
		data[0][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(1)");
		data[0][1] = "15 Amazing Things About Reading in the Fall";
		data[0][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(1) h4>a");
		
		data[1][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(2)");
		data[1][1] = "10 Book Recommendations For Family Members";
		data[1][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(2) h4>a");
		
		data[2][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(3)");
		data[2][1] = "The Best business books – Financial Times";
		data[2][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(3) h4>a");
		
		data[3][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(4)");
		data[3][1] = "The Best Poetry Books of All Time";
		data[3][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(4) h4>a");
		
		data[4][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(5)");
		data[4][1] = "Five the Best Audiobooks";
		data[4][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(5) h4>a");
		
		data[5][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(6)");
		data[5][1] = "Book reviews: Find the best new books";
		data[5][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(6) h4>a");
		
		data[6][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(7)");
		data[6][1] = "How end-of-year book lists prove we lack diversity";
		data[6][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(7) h4>a");
				
		data[7][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(8)");
		data[7][1] = "We need to talk about all women writers";
		data[7][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(8) h4>a");
				
		data[8][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(9)");
		data[8][1] = "The hottest books to warm you up this winter";
		data[8][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(9) h4>a");
			
		data[9][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(10)");
		data[9][1] = "Why I won’t stop buying books";
		data[9][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(10) h4>a");
				
		data[10][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(11)");
		data[10][1] = "Celebrity Picks:Favorite Reads of 2015";
		data[10][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(11) h4>a");

		data[11][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(12)");
		data[11][1] = "Weekend Reading";
		data[11][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(12) h4>a");
						
		data[12][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(13)");
		data[12][1] = "Coffee Table Books";
		data[12][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(13) h4>a");
				
		data[13][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(14)");
		data[13][1] = "Turn the Page: Your Next Rock ‘N’ Roll Book Club";
		data[13][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(14) h4>a");
				
		data[14][0] = By.cssSelector("div[class*='isotope_item']:nth-of-type(15)");
		data[14][1] =  "The Book Report: Episode 3";
		data[14][2] = By.cssSelector("div[class*='isotope_item']:nth-of-type(15) h4>a");
		
		return data;

	}
	@Test(priority =1)
	public void getToPortfolio() throws InterruptedException {
		navMenu.hoverElement(navMenu.blog);
		navMenu.hoverElement(navMenu.portfolio);
		navMenu.click(navMenu.portfolio2);
		Thread.sleep(2000);
	}
	
	@Test(priority =2, dataProvider = "Articles")
	public void ValidatePort(By article, String title, By tpath) {
		Portfolio2Columns p2c = new Portfolio2Columns(driver);
		p2c.hoverAssert(article, title, tpath);
	}
}
