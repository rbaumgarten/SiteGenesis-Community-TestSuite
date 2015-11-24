/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.wishlist;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test open shared private/public wishlist url.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create account for wishlist owner</li>
 * <li>Add product to owners wishlist</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Share and store wishlist url</li>
 * <li>Start new session and open wishlist url</li>
 * <li>Validate private wishlist is NOT shown</li>
 * <li>Make wishlist public</li>
 * <li>Start new session and open wishlist url</li>
 * <li>Validate public wishlist is shown</li>
 * </ul>
 */
@ScriptName
("tests.wishlist.TWishList_ShareWishListLink")
public class TWishList_ShareWishListLink extends AbstractScriptTestCase
{
}