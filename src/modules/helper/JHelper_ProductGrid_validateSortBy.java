package modules.helper;

import java.util.List;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.xceptance.xlt.api.engine.scripting.WebDriverCustomModule;

public class JHelper_ProductGrid_validateSortBy implements WebDriverCustomModule
{

    @Override
    public void execute(final WebDriver webDriver, String... parameters)
    {
        Assert.assertEquals("Invalid number of parameters", 4, parameters.length);

        final String xpath = parameters[0].trim();
        final String sortOrder = parameters[1].trim();
        final String substringBeforeLowerBoundary = parameters[2].trim();
        final String substringBeforeUpperBoundary = parameters[3].trim();

        String priceText;
        double priceValueLast = 0;
        double priceValueNext = 0;
      
        System.out.println("substringBeforeLowerBoundary:" + substringBeforeLowerBoundary);
        System.out.println("substringBeforeUpperBoundary:" + substringBeforeUpperBoundary);
        System.out.print(sortOrder);
        List<WebElement> priceList = webDriver.findElements(By.xpath(xpath));
        
        for(WebElement resultItem  : priceList){
        	priceText = resultItem.getText();
        	System.out.println("priceText: " + priceText);
        	// price range handling
        	if(priceText.contains(substringBeforeUpperBoundary)){
        		// if sorting order is ascending
        		if (sortOrder.contains("asc")){        
        			// extract first part of the price range
            		priceText = priceText.substring(priceText.indexOf(substringBeforeLowerBoundary) + substringBeforeLowerBoundary.length(),
            				                        priceText.indexOf(substringBeforeUpperBoundary));            		
            	}        
        		// if sorting order is descending
        		if (sortOrder.contains("desc")){
        			// extract second part of the price range
        			priceText = priceText.substring(priceText.indexOf(substringBeforeUpperBoundary) + substringBeforeUpperBoundary.length());
        		}
        	}
        	// price handling
        	else {
        		// replace currency shown in front of the price
    			priceText = priceText.replace(substringBeforeLowerBoundary, "");
    		}
        	
        	System.out.println("priceText: " + priceText);
       	    // parse price text to type double 
        	priceValueNext = Double.parseDouble(priceText);
        	
        	// first price handling
        	if (priceValueLast == 0) {
        		// initialize last price value with the current price value
        		priceValueLast = priceValueNext;
        	}
        	
        	// compare last price with current price
        	if (sortOrder.contains("asc")){
        		Assert.assertTrue("Wrong sorting, expected " + priceValueNext + " >= " + priceValueLast, priceValueNext >= priceValueLast);
        	}       
        	if (sortOrder.contains("desc")){
        		Assert.assertTrue("Wrong sorting, expected " + priceValueNext + " <= " + priceValueLast, priceValueNext <= priceValueLast);
        	}
        }
    }
}    
