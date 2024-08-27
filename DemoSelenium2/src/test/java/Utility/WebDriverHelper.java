package Utility;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.function.Function;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import com.google.common.io.Files;

public class WebDriverHelper {
	
	static WebDriver driver;
	
	public WebDriver webdriverInitilizer() {
		
		System.setProperty("Webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public void getURL(String URL) {
		driver.get(URL);
	}
	public void closeDriver() {
		driver.close();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		WebDriverHelper.driver = driver;
	}
	
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}


	 /**
		 * @description: this method use to switch web driver to newly open web tab
		 * 
		 */
	
	 public void switchTab()
	 {
		 String oldTab = driver.getWindowHandle();
		 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		 newTab.remove(oldTab);
		 driver.switchTo().window(newTab.get(0));
	 }
	 
	 /**
		 * @description: this method use to wait till expected element is visible.
		 * 
		 */
	 
	 public void waitPageLoad(WebElement x)
	 {
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		 wait.until(ExpectedConditions.elementToBeClickable(x));
		 
		 
		
	 }
	 
	 /**
		 * @description: this method use to wait till  every component in the web page is loaded.
		 * 
		 */
	 
	 public void waitForPageLoad() {

		    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(new Function<WebDriver, Boolean>() {
		        public Boolean apply(WebDriver driver) {
		            return String
		                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
		                .equals("complete");
		        }
		    });
	 }
	 
	 public void takeSnapShot() throws Exception{
		 
		File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(SrcFile, new File("C:\\Users\\CYBORG 15\\Documents\\SS\\Test.png"));
		}

	
}

