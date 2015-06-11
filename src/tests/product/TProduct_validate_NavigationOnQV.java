/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.product;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Verifies the product browsing via quickview (QV)</p>
 * <h1 id="setup">Setup</h1>
 * <p>Open the site and remove cookies</p>
 * <h1 id="scope">Scope</h1>
 * <p>Validate the funion of the next and prev button in the quickview header.</p>
 * <ul>
 * <li>open first product</li>
 * <li>browse to last product, while saving the product names of the seen products</li>
 * <li>browse back to first product and verify if the saved product names are seen again</li>
 * <li>close Quickview</li>
 * <li>reopen the last product and verify the product name again</li>
 * <li>close quickview again</li>
 * </ul>
 */
@ScriptName
("tests.product.TProduct_validate_NavigationOnQV")
public class TProduct_validate_NavigationOnQV extends AbstractScriptTestCase
{
}