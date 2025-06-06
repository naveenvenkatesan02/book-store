package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClasss;

public class TC001_LoginPageTest extends BaseClasss{
	
	@Test
	public void verify_loginPage() {
		
		logger.info("*******Starting the TestCase********");
		try {
		HomePage hp = new HomePage(driver);
		hp.clickLoginBtn();
		
		LoginPage lp = new LoginPage(driver);
		String headerName = lp.getLoginPageHeader();
		
		Assert.assertEquals(headerName, "Login in Book Store");
		} catch (Exception e) {
			logger.error("Test Failed..." + e);
		}
		logger.info("*******TestCase Ending********");
	}

}
