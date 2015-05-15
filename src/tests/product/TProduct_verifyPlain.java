/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.product;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Verifies the structure of quickview (QV) and product details pages (PDP) for standard products</p>
 * <h1 id="setup">Setup</h1>
 * <p>Open the site and remove cookies</p>
 * <h1 id="scope">Scope</h1>
 * <p>Verify both ways of displaying product details.</p>
 * <ul>
 * <li>verify structure of the QV</li>
 * <li>go from QV to PDP</li>
 * <li>verify stucture of PDP</li>
 * <li>check if product name, price, and product number are the same on both </li>
 * <li>search for product name and verify PDP again</li>
 * </ul>
 */
@ScriptName
("tests.product.TProduct_verifyPlain")
public class TProduct_verifyPlain extends AbstractScriptTestCase
{
}