/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.product;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Verifies the functionality of an variation product on quickview (QV) and product details pages (PDP)</p>
 * <h1 id="setup">Setup</h1>
 * <p>Open the site and remove cookies</p>
 * <h1 id="scope">Scope</h1>
 * <p>Validates the change of the product numbers and enabling of the add2cart button when changing color and size, checks also if the availability changes</p>
 * <ul>
 * <li>open QV</li>
 * <li>change color, verify that something can be selected</li>
 * <li>select something from the select box, verify that the add2cart button becomes enabled</li>
 * </ul>
 */
@ScriptName
("tests.product.TProduct_Validate_VariationProductFunctionality")
public class TProduct_Validate_VariationProductFunctionality extends AbstractScriptTestCase
{
}