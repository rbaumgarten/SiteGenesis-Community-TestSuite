/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.promotion;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Verifies the functionality of an buy5for50 promotion.</p>
 * <h1 id="setup">Setup</h1>
 * <p>Open the site and remove cookies
 * Put four promotion product in cart
 * Validate that no promotion is shown</p>
 * <h1 id="scope">Scope</h1>
 * <p>Validate correct funtionality of the promotion</p>
 * <ul>
 * <li>change quanitiy to five</li>
 * <li>validate that promotion is shown correct</li>
 * <li>change quanitiy to six</li>
 * <li>validate that promotion is shown correct </li>
 * <li>change quanitiy to ten</li>
 * <li>validate that promotion is shown correct</li>
 * <li>change quanitiy back to 4</li>
 * <li>validate that no promotion is shown</li>
 * </ul>
 */
@ScriptName
("tests.promotion.TPromotion_buy5for50")
public class TPromotion_buy5for50 extends AbstractScriptTestCase
{
}