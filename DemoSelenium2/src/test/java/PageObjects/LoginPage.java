package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.WebDriverHelper;

public class LoginPage {
	
//	WebDriverHelper driver = new WebDriverHelper();
	
	//find web elements of login page
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement InvalidMessage;
	
	public LoginPage() {
		
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	
	}
	
	//Methods for operations
	
	public void setUserName(String name) {
		username.sendKeys(name);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		loginbtn.submit();
	}
		
	public String getInvalidText() {
		return (InvalidMessage.getText());
	}
	
}
