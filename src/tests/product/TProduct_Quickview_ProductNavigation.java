/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.product;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Verifies product navigation on the quickview</p>
 * <h1 id="setup">Setup</h1>
 * <p>Open the site and remove cookies</p>
 * <h1 id="scope">Scope</h1>
 * <p>Validate the previous and next functionality of the quickview</p>
 * <ul>
 * <li>open first product</li>
 * <li>browse to last product, while saving the product names of the seen products</li>
 * <li>browse back to first product and verify if the saved product names are seen again</li>
 * <li>close quickview</li>
 * <li>reopen the last product and verify the product name</li>
 * <li>close quickview again</li>
 * </ul>
 */
@ScriptName
("tests.product.TProduct_Quickview_ProductNavigation")
public class TProduct_Quickview_ProductNavigation extends AbstractScriptTestCase
{
}