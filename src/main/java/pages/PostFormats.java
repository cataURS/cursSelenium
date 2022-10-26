package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class PostFormats extends SeleniumWrappers{
	
public WebDriver driver;
	
	public PostFormats(WebDriver driver) {
		super(driver);
		
	}

	public By play = By.cssSelector("div[class*='mejs-play']");
	public By progressInitial = By.cssSelector("span[class*='mejs-time-hovered']");
	public By volumeFinal = By.cssSelector("a[aria-label='Volume Slider']");

	}