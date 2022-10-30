package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class Portfolio2Columns extends SeleniumWrappers{
	
public WebDriver driver;
	
	public Portfolio2Columns(WebDriver driver) {
		super(driver);
		
	}

	public By article = By.cssSelector("div[class*='isotope_item']:nth-of-type(1)");
	public By title = By.cssSelector("h4>a");

	public boolean hoverAssert(By art, String titlu, By path) {
		hoverElement(art);
		String ftitle = find(path).getText();
		assertEquals(ftitle, titlu);
		return true;
	}

	}