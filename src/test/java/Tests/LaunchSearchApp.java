package Tests;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import testBase.DriverFactory;
import testBase.TestBase;
public class LaunchSearchApp extends TestBase {
	
	@Test
	
	public void googlePage() {
    	
		DriverFactory.getInstance().getDriver().get("https://www.google.com");
		Assert.assertEquals(12, 12);
		Reporter.log("Google Title :"+DriverFactory.getInstance().getDriver().getTitle(), true);
	}
}