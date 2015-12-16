package tests.others;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;

public class IETestRunner extends AbstractScriptTestCase {
	private WebDriver driver;

	protected IETestRunner()
	{ 
		System.setProperty("webdriver.ie.driver", "d:/Tools/IEDriverServer.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); 
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); 
		driver = new InternetExplorerDriver(capabilities);
		setWebDriver(driver);
	}

	@Override
	@After
	public void tearDown() {
		driver.quit();
	}
}
