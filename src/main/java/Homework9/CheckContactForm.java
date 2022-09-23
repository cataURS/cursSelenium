package Homework9;

import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import pages.ContactForm;
import pages.NavMenuPage;
import utils.BaseTest;

public class CheckContactForm extends BaseTest{
		
	@BeforeTest	
	public void navigate() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.contactLink);
	}	

	@Test
	public void sendAllFields() {
		ContactForm cont = new ContactForm(driver);
		cont.sendForm("cata","test@mail.com","something","mess");
		assertEquals(cont.validate(), true);
	}
	
	@Test
	public void invalidName() {
		ContactForm cont = new ContactForm(driver);
		cont.sendForm("","test@mail.com","something","mess");
		assertEquals(cont.validate(), false);
	}
	
	@Test
	public void invalidEmail() {
		ContactForm cont = new ContactForm(driver);
		cont.sendForm("cata","","something","mess");
		assertEquals(cont.validate(), false);
	}
	
	@Test
	public void invalidSubject() {
		ContactForm cont = new ContactForm(driver);
		cont.sendForm("cata","test@mail.com","","mess");
		assertEquals(cont.validate(), false);
	}
	
	@Test
	public void invalidMessage() {
		ContactForm cont = new ContactForm(driver);
		cont.sendForm("cata","test@mail.com","something","");
		assertEquals(cont.validate(), false);
	}
	
	
}
