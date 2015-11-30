/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.wishlist;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test remove and resorting rows in wishlist.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create new account</li>
 * <li>Add four products to wishlist (1, 2, 3, 4)</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Remove last item in cart (4)</li>
 * <li>Remove middle item (2)</li>
 * <li>Remove first item (1)</li>
 * <li>Remove the last item (3)</li>
 * </ul>
 */
@ScriptName
("tests.wishlist.TWishList_RemoveProducts")
public class TWishList_RemoveProducts extends AbstractScriptTestCase
{
}