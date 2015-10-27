/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.product;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Verifies variant dropdown selection updates product price and number on quickview and product detail page.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Search leads to search result page</li>
 * <li>Open quickview</li>
 * <li>Validate preconditions</li>
 * </ul>
 * <h1 id="scope">Scope</h1>
 * <h2 id="quickview">Quickview</h2>
 * <ul>
 * <li>Select first variation from dropdown</li>
 * <li>Verify that price and product number are changed</li>
 * <li>Deselect variation from dropdown</li>
 * <li>Verify that price and product number are NOT changed</li>
 * <li>Select last variation from dropdown</li>
 * <li>Verify that price and product number are changed</li>
 * </ul>
 * <h2 id="product-details-page">Product details page</h2>
 * <ul>
 * <li>Open pdp from quickview</li>
 * <li>Verify that dropdown value is preselected with same value</li>
 * <li>Select variation from dropdown</li>
 * <li>Verify that price and product number are changed</li>
 * <li>Deselect variation from dropdown</li>
 * <li>Verify that price and product number are NOT changed</li>
 * </ul>
 */
@ScriptName
("tests.product.TProduct_Validate_VariationProductDropdownOnlyFunctionality")
public class TProduct_Validate_VariationProductDropdownOnlyFunctionality extends AbstractScriptTestCase
{
}