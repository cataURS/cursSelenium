package Homework9;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ContactForm;
import pages.NavMenuPage;
import utils.BaseTest;

public class CheckContactForm extends BaseTest{

	@Test(priority =4)
	public void sendAllFields() throws InterruptedException{
		ContactForm cont = new ContactForm(driver);
		driver.navigate().refresh();
		cont.sendForm("cata","test@mail.com","something","mess");
		Thread.sleep(1000);
		assertTrue(cont.validate(cont.Response));

	}
	
	@Test(priority =1)
	public void invalidName() {
		ContactForm cont = new ContactForm(driver);
		NavMenuPage nav = new NavMenuPage(driver);
		nav.navigateTo(nav.contactLink);
		cont.sendForm("","test@mail.com","something","mess");
		assertTrue(cont.validate(cont.TipError));
	}
	
	@Test(priority =2)
	public void invalidEmail() {
		ContactForm cont = new ContactForm(driver);
		driver.navigate().refresh();
		cont.sendForm("cata","","something","mess");
		assertTrue(cont.validate(cont.TipError));
	}
	
	
	@Test(priority =3)
	public void invalidMessage() {
		driver.navigate().refresh();
		ContactForm cont = new ContactForm(driver);
		cont.sendForm("cata","test@mail.com","something","");
		assertTrue(cont.validate(cont.TipError));
	}
	
	
}
