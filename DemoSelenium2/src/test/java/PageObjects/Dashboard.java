package PageObjects;

import org.openqa.selenium.support.PageFactory;

import Utility.WebDriverHelper;

public class Dashboard {
	
	WebDriverHelper driver = new WebDriverHelper();
	
	public Dashboard() {
		
		PageFactory.initElements(WebDriverHelper.getDriver(), this);
	}
	
	public String getPageTitle() {
		return(WebDriverHelper.getDriver().getTitle());
	}
}
