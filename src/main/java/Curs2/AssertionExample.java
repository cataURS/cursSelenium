package Curs2;

import org.testng.annotations.Test;

public class AssertionExample {
	
	String actualTitle = "test";
	String expectedlTitle = "masina";
	
	@Test
	public void checkTitle() {
		
		if(actualTitle.equals(expectedlTitle)) {
			System.out.println("test pased");
	} else {
		System.out.println("test failed");
	}
}
}
