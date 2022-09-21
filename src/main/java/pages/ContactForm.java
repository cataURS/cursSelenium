package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactForm {
	
public WebDriver driver;
	
	public ContactForm() {
		this.driver = driver;
		
	}

	public By Name = By.cssSelector("input[name='your-name']");
	public By Email = By.cssSelector("input[name='your-email']");
	public By Subject = By.cssSelector("input[name='your-s']");
	public By Message = By.cssSelector("textarea[name='your-message']");
	public By Send = By.cssSelector("input[value='Send Message']");
	public By Response = By.cssSelector("div[class='wpcf7-response-output']");
	public By TipError = By.cssSelector(".wpcf7-not-valid-tip");

	
	public void sendForm(String nume, String email, String subj, String mess) {
		
		driver.findElement(Name).sendKeys(nume);
		driver.findElement(Email).sendKeys(email);
		driver.findElement(Subject).sendKeys(subj);
		driver.findElement(Message).sendKeys(mess);
		driver.findElement(Send).click();
	}
	
	public boolean validate() {
		boolean confirm = driver.findElement(Response).isDisplayed();
		boolean fieldErr = driver.findElement(TipError).isDisplayed();
		
		if(confirm==true && fieldErr==true) {
			return false;
		}else {
			return true;
		}
		
	}
}

