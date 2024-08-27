package Test;

import org.testng.annotations.*;
import PageObjects.Dashboard;
import PageObjects.LoginPage;
import Utility.WebDriverHelper;
import dataProviders.ConfigFileReader;
import junit.framework.Assert;

public class LoginTest {
	
	WebDriverHelper driver = new WebDriverHelper();
	ConfigFileReader configFileReader= new ConfigFileReader();
	
	@BeforeTest
	public void setup() {
		
		System.out.println("Before test executed");
		
		driver.webdriverInitilizer();
		
		driver.getURL(configFileReader.getApplicationUrl());
		
		driver.implicitwait();
	}
	
	@Test
	public void loginTestWithInvalidCredential() throws Exception {
	
		LoginPage pg = new LoginPage();
		
		//enter username
		pg.setUserName("Admin");
		
		//enter password
		pg.setPassword("1234");
		
		//click on login btn
		pg.clickLoginBtn();
		
		
		
		String message_expected = "Invalid credentials";
		
		String message_actual = pg.getInvalidText();
	//	Assert.assertTrue(message_actual.contains(message_expected));
		Assert.assertEquals(message_expected, message_actual);
		
	//	driver.takeSnapShot();
			
	}
	
	@Test
	public void loginTestWithValidCredential() throws Exception {
	
		LoginPage pg = new LoginPage();
		
		Dashboard dashboard = new Dashboard();
		
		//enter username
		pg.setUserName("Admin");
		
		//enter password
		pg.setPassword("admin123");
		
		//click on login btn
		pg.clickLoginBtn();
		
		
		String pageTitle = dashboard.getPageTitle();
	/*	if(pageTitle.equals("OrangeHRM")) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Login failed!");
		} */
		
		
		Assert.assertEquals("OrangeHRM", pageTitle);
		
	//	driver.takeSnapShot();
		
	}
	
}

