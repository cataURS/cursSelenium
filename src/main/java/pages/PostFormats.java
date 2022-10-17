package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class PostFormats extends SeleniumWrappers{
	
public WebDriver driver;
	
	public PostFormats(WebDriver driver) {
		super(driver);
		
	}

	public By play = By.cssSelector("button[title='Play']");
	public By progressInitial = By.cssSelector("span[style='left: 0%;']");
	public By progressFinal = By.cssSelector("span[style='left: 100%;']");
	

	}