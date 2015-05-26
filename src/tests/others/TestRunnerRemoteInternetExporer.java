/*
 * NOTE: Replace "YOUR_USERNAME" and "YOUR_ACCESS_KEY" with your SauceLabs account!   
 */
package tests.others;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;

public class TestRunnerRemoteInternetExporer extends AbstractScriptTestCase {
	WebDriver driver; 
	protected TestRunnerRemoteInternetExporer() {
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("version", "11.0");
		caps.setCapability("platform", Platform.WIN8_1);
		try {
			driver = new RemoteWebDriver(
			    new URL("http://YOUR_USERNAME:YOUR_ACCESS_KEY@ondemand.saucelabs.com:80/wd/hub"), caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}		
		setWebDriver(driver);
	}
		
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
