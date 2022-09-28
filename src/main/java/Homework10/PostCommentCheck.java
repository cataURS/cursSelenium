package Homework10;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.BlogPage;
import pages.NavMenuPage;
import utils.BaseTest;

public class PostCommentCheck extends BaseTest{

	@Test
	public void postComm(){
		
	BlogPage blog = new BlogPage(driver);
	NavMenuPage navi = new NavMenuPage(driver);
	navi.navigateTo(navi.blog);
	navi.navigateTo(navi.blogClassic);
	blog.postComment("catalin", "mail@cloud.org", "I hate this article! + second comm");
	assertTrue(blog.validate(blog.Response));
	}
	
}
