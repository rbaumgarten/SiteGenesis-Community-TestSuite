/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.product;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Verifies the structure of the QV and the PDP for a plain product</p>
 * <h1 id="setup">Setup</h1>
 * <p>open a clean site with deleted cookies</p>
 * <h1 id="scope">Scope</h1>
 * <p>verify both methods of showing products</p>
 * <ul>
 * <li>first verify structure of the QV</li>
 * <li>go from QV to PDP</li>
 * <li>verify stucture of PDP</li>
 * <li>check if product name procuct price and product number are the same on pdp as on qv</li>
 * <li>search for product name and verify pdp again</li>
 * </ul>
 */
@ScriptName
("tests.product.TProductPlainQVandPDP")
public class TProductPlainQVandPDP extends AbstractScriptTestCase
{
}