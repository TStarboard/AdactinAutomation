package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AdactinHomePageObjects;

public class AdactinHomePageTest {
		
	
	static WebDriver driver = null;

	@BeforeTest
	public void setUpTest(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public static void adactinHomeTest() {
				
		AdactinHomePageObjects homePageObj = new AdactinHomePageObjects(driver);
		
		driver.get("http://www.adactin.com/HotelAppBuild2/");

		homePageObj.setTextInUsername("automate001");
		
		homePageObj.setTextInPassword("password1");
		
		homePageObj.clickLoginButton();
		
		homePageObj.clickLogoutButton();
		
		homePageObj.clickLoginAgainButton();
						
		
	}
	
	@AfterTest
	public void tearDownTest(){
		
		//close browser
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}

	
}
