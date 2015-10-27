/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.catalog;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test validate the Sort By Price Rule</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>search for a product set</li>
 * <li>show all results on one page</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Sort By Price - low to high</li>
 * <li>validate that the first price is smaller than the second one</li>
 * <li>validate that the penultimate price is smaller than the last one</li>
 * <li><p>validate that the second price is smaller than the penultimate</p>
 * </li>
 * <li><p>Sort By Price - High To Low</p>
 * </li>
 * <li>validate that Highest Price is now the first one</li>
 * <li><p>validate that smalles price is now the last one</p>
 * </li>
 * <li><p>Sort By Price - Low To High</p>
 * </li>
 * <li>validat that highest price is the last one and lowest is the first one </li>
 * </ul>
 */
@ScriptName
("tests.catalog.TCatalogProductListing_SortByPrice")
public class TCatalogProductListing_SortByPrice extends AbstractScriptTestCase
{
}