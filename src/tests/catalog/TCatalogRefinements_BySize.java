/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.catalog;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test select, remove and clear color refinement on catalog page.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Browse to category</li>
 * <li>store number of size refinements</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Select, validate and remove size randomly by position</li>
 * <li>Select three sizes by position</li>
 * <li>Remove three sizes clear</li>
 * <li>Validate empty size list</li>
 * <li>Validate empty refinement list in breadcrumbs</li>
 * <li>Select one Size randomly</li>
 * <li>Remove one size by breadcrumb</li>
 * </ul>
 */
@ScriptName
("tests.catalog.TCatalogRefinements_BySize")
public class TCatalogRefinements_BySize extends AbstractScriptTestCase
{
}