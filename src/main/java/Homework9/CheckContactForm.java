package Homework9;

import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import pages.ContactForm;
import pages.NavMenuPage;
import utils.BaseTest;

public class CheckContactForm extends BaseTest{
		
		NavMenuPage navMenu = new NavMenuPage(driver);
		ContactForm cont = new ContactForm();
		
	@BeforeTest	
	public void navigate() {
		navMenu.navigateTo(navMenu.contactLink);
	}	

	@Test
	public void sendAllFields() {
		cont.sendForm("cata","test@mail.com","something","mess");
		assertEquals(cont.validate(), true);
	}
	
	@Test
	public void invalidName() {
		cont.sendForm("","test@mail.com","something","mess");
		assertEquals(cont.validate(), false);
	}
	
	@Test
	public void invalidEmail() {
		cont.sendForm("cata","","something","mess");
		assertEquals(cont.validate(), false);
	}
	
	@Test
	public void invalidSubject() {
		cont.sendForm("cata","test@mail.com","","mess");
		assertEquals(cont.validate(), false);
	}
	
	@Test
	public void invalidMessage() {
		cont.sendForm("cata","test@mail.com","something","");
		assertEquals(cont.validate(), false);
	}
	
	
}
