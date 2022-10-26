package Homework15;

import org.testng.annotations.Test;

import pages.PostFormats;
import utils.BaseTest;

public class DragNDrop extends BaseTest{
	
	@Test
	public void VolumeSlider() throws InterruptedException {
	navMenu.click(navMenu.blog);
	navMenu.click(navMenu.postFormats);
	PostFormats post = new PostFormats(driver);
	post.click(post.play);
	Thread.sleep(2000);
	post.dragAndDrop(post.progressInitial, 10, 0);
	post.dragAndDrop(post.volumeFinal, 50, 0);
	

	}
}
