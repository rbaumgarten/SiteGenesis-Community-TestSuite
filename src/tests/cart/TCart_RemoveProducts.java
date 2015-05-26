/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.cart;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test refresh products and calculate sums with update quantity and resort rows in cart. This test needs a full desktop view of the browser, otherwise the minicart won&#39;t display the total and the test will fail.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies.</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Add four products to the cart (1, 2, 3, 4)</li>
 * <li>Remove last item in cart (4)</li>
 * <li>Remove middle item (2)</li>
 * <li>Remove first item (1)</li>
 * <li>Remove the last item (3)</li>
 * <li>Validate quantity total of minitcart and the item position and content every time</li>
 * <li>Does not validate the cart totals right now, except when the cart is filled for the first time</li>
 * </ul>
 */
@ScriptName
("tests.cart.TCart_RemoveProducts")
public class TCart_RemoveProducts extends AbstractScriptTestCase
{
}