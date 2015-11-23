/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.wishlist;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test adding a product to a wishlist.</p>
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
 * <li>log out</li>
 * </ul>
 */
@ScriptName
("tests.wishlist.TWishList_AddRemoveProduct")
public class TWishList_AddRemoveProduct extends AbstractScriptTestCase
{
}