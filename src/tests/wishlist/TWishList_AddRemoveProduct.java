/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.wishlist;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test add and remove product in wishlist.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create new account</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <h2 id="product-detail-page-">Product Detail Page:</h2>
 * <ul>
 * <li>Search product</li>
 * <li>Open product detail page randomly</li>
 * <li>Enter quantity</li>
 * <li>Store product details and add to wishlist</li>
 * <li>Login</li>
 * <li>Validate wishlist</li>
 * <li>Remove product </li>
 * <li>Validate empty wishlist</li>
 * </ul>
 * <h2 id="quickview-">Quickview:</h2>
 * <ul>
 * <li>Search product</li>
 * <li>Open quickview randomly</li>
 * <li>Store product details and add to wishlist</li>
 * <li>Validate wishlist</li>
 * <li>Remove product </li>
 * <li>Validate empty wishlist</li>
 * <li>Logout</li>
 * </ul>
 */
@ScriptName
("tests.wishlist.TWishList_AddRemoveProduct")
public class TWishList_AddRemoveProduct extends AbstractScriptTestCase
{
}