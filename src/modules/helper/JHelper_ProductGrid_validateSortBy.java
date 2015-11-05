package modules.helper;

import java.util.List;
import junit.framework.Assert;

import org.openqa.selenium.By;
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

        final String sortOrderAsc  = "asc";
        final String sortOrderDesc = "desc";
        
        String priceText;
        double priceValuePrev = 0;
        double priceValue = 0;
      
        // Check given sort order
        System.out.println("check sort order: " + sortOrder);
        Assert.assertTrue("Wrong sorting order, expected '" + sortOrderAsc + "' or '" + sortOrderDesc + "'", 
        		         (sortOrder.equals(sortOrderAsc) || sortOrder.equals(sortOrderDesc)));

        List<WebElement> priceList = webDriver.findElements(By.xpath(xpath));
        
        // loop through price list based on given xpath
        for(WebElement resultItem  : priceList){
        	priceText = resultItem.getText();
        	System.out.println("price item: " + priceText);
        	
        	// extract price from price range or single price text        	
        	// price range handling
        	if(priceText.contains(substringBeforeUpperBoundary)){
        		// if sorting order is ascending
        		if (sortOrder.contains(sortOrderAsc)){        
        			// extract first part of the price range
            		priceText = priceText.substring(priceText.indexOf(substringBeforeLowerBoundary) + substringBeforeLowerBoundary.length(),
            				                        priceText.indexOf(substringBeforeUpperBoundary));            		
            	}        
        		// if sorting order is descending
        		if (sortOrder.contains(sortOrderDesc)){
        			// extract second part of the price range
        			priceText = priceText.substring(priceText.indexOf(substringBeforeUpperBoundary) + substringBeforeUpperBoundary.length());
        		}
        	}
        	// single price handling
        	else {
        		// replace currency shown in front of the price
    			priceText = priceText.replace(substringBeforeLowerBoundary, "");
    		}
        	
        	// parse price text to type double
        	System.out.println("price substring: " + priceText);
        	priceValue = Double.parseDouble(priceText);
        	
        	// first price handling
        	if (priceValuePrev == 0) {
        		// initialize previous price value with the current price value
        		priceValuePrev = priceValue;
        	}
        	
        	// compare previous price with current price
        	System.out.println("Compare price " + priceValue + " with previous price " + priceValuePrev);
        	if (sortOrder.contains(sortOrderAsc)){
        		Assert.assertTrue("Wrong sorting, expected " + priceValue + " >= " + priceValuePrev, priceValue >= priceValuePrev);
        	}       
        	if (sortOrder.contains(sortOrderDesc)){
        		Assert.assertTrue("Wrong sorting, expected " + priceValue + " <= " + priceValuePrev, priceValue <= priceValuePrev);
        	}
        	
        	// set previous price for next iteration
        	priceValuePrev = priceValue;
        }
    }
}    
