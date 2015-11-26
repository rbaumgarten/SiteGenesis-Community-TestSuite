package modules.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.xceptance.xlt.api.engine.scripting.WebDriverCustomModule;

public class JHelper_closeStorefrontToolkit implements WebDriverCustomModule
{

    @Override
    public void execute(final WebDriver webDriver, final String... parameters)
    {   
    	try {
    		// find the storefront toolkit and switch to the iframe
    		final WebElement toolkit = webDriver.findElement(By.cssSelector("#__DW__SFToolkit"));    	
        	webDriver.switchTo().frame(toolkit);   		
        	
        	// find the close button and click it
        	final WebElement closeButton = webDriver.findElement(By.cssSelector("#dw-sf-control-close-button"));
            closeButton.click();
            
            // switch back from iframe to default content
            webDriver.switchTo().defaultContent();   		
            
    	} catch (Exception e) {
    		// catch exception if the toolkit is disabled and not present
    	    System.out.println("Caught Exception: " + e.getMessage());
    	}    	
    }
}
