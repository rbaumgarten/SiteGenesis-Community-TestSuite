/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.wishlist;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test add product to wishlist.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create new account</li>
 * <li>Search product 01</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Store product details and add to wishlist</li>
 * <li>Login</li>
 * <li>Validate nav and page</li>
 * <li>Add product to wishlist</li>
 * <li>Validate product basic details</li>
 * <li>Remove product </li>
 * <li>Validate empty</li>
 * <li>do it again for QV</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>Logout</li>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName
("tests.wishlist.TWishList_SendWishListToFriend")
public class TWishList_SendWishListToFriend extends AbstractScriptTestCase
{
}