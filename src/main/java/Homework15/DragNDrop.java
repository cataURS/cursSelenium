package Homework15;

import pages.NavMenuPage;
import pages.PostFormats;
import utils.BaseTest;

public class DragNDrop extends BaseTest{
	
	public void VolumeSlider() {
	NavMenuPage nav =  new NavMenuPage(driver);
	nav.navigateTo(nav.blog);
	nav.navigateTo(nav.postFormats);
	PostFormats post = new PostFormats(driver);
	click(post.play);

	}
}
