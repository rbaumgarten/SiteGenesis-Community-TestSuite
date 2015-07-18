/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.wishlist;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Send to wishlist to a friend. Does not validate the correctness of the sent email, only the success message is checked.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>create sender and receiver email</li>
 * <li>create sender account password</li>
 * <li>start session</li>
 * <li><p>create a new account but do not log out</p>
 * </li>
 * <li><p>search product</p>
 * </li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>open send wishlist to friend dialog</li>
 * <li>cancel dialog</li>
 * <li>open send wishlist to friend dialog again</li>
 * <li>fill out form, preview mail</li>
 * <li>send form data</li>
 * <li>close dialog</li>
 * <li>repeat but do not use preview, send immediately</li>
 * <li>logou</li>
 * </ul>
 */
@ScriptName
("tests.wishlist.TWishList_SendWishListToFriend")
public class TWishList_SendWishListToFriend extends AbstractScriptTestCase
{
}