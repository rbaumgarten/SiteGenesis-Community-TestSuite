/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.product;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Verifies the functionality of an variation product with a select box on quickview (QV) and product details pages (PDP)</p>
 * <h1 id="setup">Setup</h1>
 * <p>Open the site and remove cookies</p>
 * <h1 id="scope">Scope</h1>
 * <p>Validates the change of the product numbers and enabling of the add2cart button when changing the size, checks also if the availability changes</p>
 * <h2 id="qv">QV</h2>
 * <ul>
 * <li>open QV</li>
 * <li>change size, verify if price and product nuber are changed</li>
 * <li>try to select default option</li>
 * <li>change to pdp</li>
 * </ul>
 * <h2 id="pdp">PDP</h2>
 * <ul>
 * <li>change selected option validate if price and procuct nuber changes</li>
 * <li>try to select default option</li>
 * <li>search to get the variation master page</li>
 * <li>verify variation master on pdp</li>
 * </ul>
 */
@ScriptName
("tests.product.TProduct_Validate_VariationProductWithSelectBoxFunctionality")
public class TProduct_Validate_VariationProductWithSelectBoxFunctionality extends AbstractScriptTestCase
{
}