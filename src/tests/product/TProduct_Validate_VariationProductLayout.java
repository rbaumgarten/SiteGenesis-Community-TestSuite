/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.product;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Verifies the structure of quickview (QV) and product details pages (PDP) for variation products</p>
 * <h1 id="setup">Setup</h1>
 * <p>Open the site and remove cookies</p>
 * <h1 id="scope">Scope</h1>
 * <p>Validate displaying product data either via quick view or via product detail page.</p>
 * <ul>
 * <li>validate structure of the QV</li>
 * <li>go from QV to PDP</li>
 * <li>validate stucture of PDP</li>
 * <li>check if product name, price, and product number are the same on both </li>
 * <li>search for product name and validate PDP again</li>
 * </ul>
 */
@ScriptName
("tests.product.TProduct_Validate_VariationProductLayout")
public class TProduct_Validate_VariationProductLayout extends AbstractScriptTestCase
{
}