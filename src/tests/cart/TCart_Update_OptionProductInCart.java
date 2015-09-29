/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.cart;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test adds an option product with selected option changes the option several times and deselects all options. </p>
 * <h1 id="setup-and-preparation">Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies.</li>
 * <li>put an option product with selecte option into the cart </li>
 * <li>goto cart overview</li>
 * </ul>
 * <h1 id="scope">Scope</h1>
 * <h2 id="first-option">first option</h2>
 * <ul>
 * <li>validate if option is shown in cart overview</li>
 * <li>validate if subtotal is calculate correct.</li>
 * </ul>
 * <h2 id="second-option">second option</h2>
 * <ul>
 * <li>select a new option via edit details</li>
 * <li>validate if displayed option price will change</li>
 * <li>calculate subtotal new and validate if correct displayed</li>
 * </ul>
 * <h2 id="third-option">third option</h2>
 * <ul>
 * <li>select a new option via edit details</li>
 * <li>validate if displayed option price will change</li>
 * <li>calculate subtotal new and validate if correct displayed</li>
 * </ul>
 * <h2 id="default-option">default option</h2>
 * <ul>
 * <li>select the default option via edit details</li>
 * <li>validate if no option price is displayed</li>
 * <li>validate if subtotal is only the product price</li>
 * </ul>
 */
@ScriptName
("tests.cart.TCart_Update_OptionProductInCart")
public class TCart_Update_OptionProductInCart extends AbstractScriptTestCase
{
}