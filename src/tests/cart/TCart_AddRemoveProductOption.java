/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.cart;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test add and remove product option in cart.</p>
 * <h1 id="setup-and-preparation">Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Add option product with configured quantity and no selected option to cart </li>
 * <li>Go to cart</li>
 * </ul>
 * <h1 id="scope">Scope</h1>
 * <ul>
 * <li>Add product option</li>
 * <li>Validate calculated option price (product quantity &#42; option price)</li>
 * <li>Validate calculated subtotal (product price total + option price total) </li>
 * <li>Remove option and validate it</li>
 * </ul>
 * <p>Note: Different options are handled as data driven test configured in a dataset file. Please execute the generated wrapper class as JUnit test for testing all options.</p>
 */
@ScriptName
("tests.cart.TCart_AddRemoveProductOption")
public class TCart_AddRemoveProductOption extends AbstractScriptTestCase
{
}