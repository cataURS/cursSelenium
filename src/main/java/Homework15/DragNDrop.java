package Homework15;

import pages.PostFormats;
import utils.BaseTest;

public class DragNDrop extends BaseTest{
	
	public void VolumeSlider() {
	navMenu.click(navMenu.blog);
	navMenu.click(navMenu.postFormats);
	PostFormats post = new PostFormats(driver);
	post.click(post.play);
	post.dragAndDrop(post.progressInitial, 200, 0);
	post.dragAndDrop(post.volumeFinal, -50, 0);
	

	}
}
