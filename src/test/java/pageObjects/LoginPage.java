package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//*[@id=\"userForm\"]/div[1]/h5")
	WebElement loginPageHeader;
	
	public String getLoginPageHeader() {
		try {
			String header = loginPageHeader.getText();
			return header;
		}catch (Exception e) {
			return e.getMessage();
		}
		
	}

}
