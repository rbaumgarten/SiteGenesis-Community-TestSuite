/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.wishlist;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test search wishlist by name and email.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create accounts for wishlist owner and searcher</li>
 * <li>Add two products to owners wishlist</li>
 * <li>Logout</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Verify wishlist is not searchable by default</li>
 * <li>Make wishlist public and one item private</li>
 * <li>Search wishlist by firstname and lastname</li>
 * <li>Search wishlist by email</li>
 * </ul>
 * <p>Notes:</p>
 * <ul>
 * <li>Test navigates to the wishlist via account menu, secondary navigation and header user menu.</li>
 * <li>Test is not splitted into more than one case for now, because setup is expensive.</li>
 * </ul>
 */
@ScriptName
("tests.wishlist.TWishList_SearchWishList")
public class TWishList_SearchWishList extends AbstractScriptTestCase
{
}