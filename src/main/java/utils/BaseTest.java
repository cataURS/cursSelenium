package utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.NavMenuPage;

public class BaseTest {

	public WebDriver driver;
	public JavascriptExecutor jse;
	public NavMenuPage navMenu;
	
	//@Parameters({"url"})
	@BeforeClass(alwaysRun = true)
	public void setup() {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get(url);
		driver.get("http://keybooks.ro");
		//driver.get("http://keybooks.ro");
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		//comentariu pentru conflict
		jse = (JavascriptExecutor) driver;
		navMenu = new NavMenuPage(driver);
		}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.quit();		

	}
	

}