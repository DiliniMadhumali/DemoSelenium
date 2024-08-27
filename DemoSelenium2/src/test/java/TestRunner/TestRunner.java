package TestRunner;

import org.testng.annotations.*;

import Utility.WebDriverHelper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@tagD", features= {"src/test/resources/Features"}, glue= {"StepDefinition"}, plugin= {"pretty","html:target/htmlreport.html"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	WebDriverHelper driver = new WebDriverHelper();
	
	@AfterMethod
	public void driverclose() throws InterruptedException {
		Thread.sleep(5000);
		driver.closeDriver();
	}
	

}
