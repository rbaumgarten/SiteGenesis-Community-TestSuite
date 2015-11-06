/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.catalog;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>(JAVA)-Test sort by price.  </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Search for products</li>
 * <li>Select items per page randomly</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Sort by price low to high</li>
 * <li>Validate sorting order </li>
 * <li>Sort by price high to low</li>
 * <li>Validate sorting order </li>
 * </ul>
 * <p>Notes:</p>
 * <ul>
 * <li>Validating sorting order is implemented as java module which is not executed in script developer. </li>
 * <li>There is a data set configured for multiple data driven executions via JUnit.</li>
 * </ul>
 */
@ScriptName
("tests.catalog.TCatalogProductListing_SortByPrice")
public class TCatalogProductListing_SortByPrice extends AbstractScriptTestCase
{
}