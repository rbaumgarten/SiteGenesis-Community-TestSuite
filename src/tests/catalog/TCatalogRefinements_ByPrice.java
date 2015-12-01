/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.catalog;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test select, deselect, clear and remove price refinement on catalog page.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Navigate to category page</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Select price refinement by random position</li>
 * <li>Validate shown products fit into selected price range</li>
 * <li><em>Deselect</em> price refinement </li>
 * </ul>
 * <ul>
 * <li>Change items per page by random position</li>
 * <li>Select price refinement by random position</li>
 * <li>Validate shown products fit into selected price range</li>
 * <li><em>Clear</em> price refinement</li>
 * </ul>
 * <ul>
 * <li>Change items per page by random position</li>
 * <li>Select price refinement by random position</li>
 * <li>Validate shown products fit into selected price range</li>
 * <li><em>Remove</em> price refinement via breadcrumb</li>
 * </ul>
 */
@ScriptName
("tests.catalog.TCatalogRefinements_ByPrice")
public class TCatalogRefinements_ByPrice extends AbstractScriptTestCase
{
}