/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.catalog;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test select, deselect, clear and remove size refinement on catalog page.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Browse to category page</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Select size refinement by random position</li>
 * <li>Validate that refined size is selectable on random quickview</li>
 * <li><em>Deselect</em> size refinement</li>
 * </ul>
 * <ul>
 * <li>Select two size refinements by random position</li>
 * <li>Validate that refined sizes are selectable on random quickview</li>
 * <li><em>Clear</em> size refinement</li>
 * </ul>
 * <ul>
 * <li>Select size refinement by random position</li>
 * <li><em>Deselect</em> size refinement via breadcrumb</li>
 * </ul>
 */
@ScriptName
("tests.catalog.TCatalogRefinements_BySize")
public class TCatalogRefinements_BySize extends AbstractScriptTestCase
{
}