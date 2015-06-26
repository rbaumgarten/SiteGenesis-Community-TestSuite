/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.cart;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test refresh products and calculate sums with update quantity and resort rows in cart. This test needs a full desktop view of the browser, otherwise the minicart won&#39;t display the total and the test will fail.</p>
 * <h1 id="setup-and-preparation">Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies.</li>
 * </ul>
 * <h1 id="scope">Scope</h1>
 * <h2 id="product-01-change-quantity-via-update-cart">Product 01 - Change quantity via update cart</h2>
 * <ul>
 * <li>Add product 01 to cart (quantity 1).</li>
 * <li>Validate product and subtotal.</li>
 * <li>Increase quantity to random value via update cart function.</li>
 * <li>Calculate formatted total product price based on updated quantity.</li>
 * <li>Validate product price and subtotal.</li>
 * </ul>
 * <h2 id="product-02-change-quantity-via-edit-dialog">Product 02 - Change quantity via edit dialog</h2>
 * <ul>
 * <li>Add product 02 to cart (quantity 2).</li>
 * <li>Calculate formatted total product price.</li>
 * <li>Calculate subtotal and number of items for both products.</li>
 * <li>Validate both products and subtotal.</li>
 * <li>Increase product 02 quantity to random value via edit details dialog.</li>
 * <li>Calculate new subtotal and number of items for both products.</li>
 * <li>Validate calculated values in mini cart header.</li>
 * <li>Validate both products and subtotal on cart page.</li>
 * </ul>
 */
@ScriptName
("tests.cart.TCart_UpdateQuantities")
public class TCart_UpdateQuantities extends AbstractScriptTestCase
{
}