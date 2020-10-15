package Tests;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import testBase.DriverFactory;
import testBase.TestBase;	
public class LaunchSocialApp extends TestBase  {
	
    @Test
    public void LaunchFacebook() {    	
    	DriverFactory.getInstance().getDriver().get("https://www.facebook.com/help");


		Reporter.log("Facebook Title :"+DriverFactory.getInstance().getDriver().getTitle(), true);
		Assert.assertEquals(12, 13);
    }
    @Test
    public void LaunchLinkedIn() {    	
    	// This will initialize all element locator of the class and return the class as an Object
//    	LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
//    	loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
    	
    	DriverFactory.getInstance().getDriver().get("https://www.linkedin.com");
		Reporter.log("LinkedIn Title :"+DriverFactory.getInstance().getDriver().getTitle(), true);
    }
}