# Readme

This is a functional test suite for Demandware SiteGenesis, the best practice ecommerce reference store implementation for and by Demandware.

Because test suites sometimes tend to become complex and hard to maintain, we realized it is time to build a clearly structured test suite with a well-defined set of tests.

The project idea is to collect experiences, consolidate knowledge and share ideas of testing practices. Although this test suite is based on testing the storefront of the demo shop __Demandware__ __SiteGenesis__ the underlying concepts and the communicated know-how are valid for building test suites of other web applications as well. Everybody is invited to use it, learn from it, improve it and adapt it to their needs.

Possible use cases are:

- Test suite to automate new store based on Demandware SiteGenesis
- Starting point for test development with fast learning curve
- Demonstration of test automation and test suite structuring
- Reusable best practices in other (existing) projects

This test suite has been built for and with __XLT__

## Test Suite Setup

The following prerequisites and installation steps are needed to run the test suite with __XLT Script Developer__ in Firefox or the __XLT Framework__ orchestrating different WebDrivers. For further help please refer to [XLT Online](https://www.xceptance.com/en/xlt/documentation.html).

### XLT Script Developer

#### Prerequisites

- XLT&reg; Script Developer 4.5.0 (or higher)
- Firefox 31.0 (or higher)
- A [Demandware](http://www.demandware.com/) SiteGenesis v15.1 or higher reference shop installation

#### Installation

- [Download XLT Script Developer](https://www.xceptance.com/en/xlt/download.html) and install Firefox add-on.
- Open `Tools > XLT Script Developer` in Firefox.
- Download and unzip this test suite in a directory of your choice.
- Import test suite by clicking the `folder` icon above the navigation panel.
- Set the `storefront_url` of the shop system under test in `XLT Script Developer > Manage Global Test Data`.
- Open a test case in the navigation panel and click the replay button in the toolbar.

### XLT Framework for WebDriver-based Execution

#### Prerequisites

- XLT&reg; Framework v4.5 (or higher)
- JDK 7 or higher
- Java IDE (e.g. Eclipse, IDEA, NetBeans)

#### Installation

- [Download the XLT Framework](https://www.xceptance.com/en/xlt/download.html) and unzip it into a directory of your choice.
- Import test suite as new Java project.
- Import XLT libraries.
- Run test as JUnit test (default configuration: Firefox WebDriver).
- Adapt WebDriver configurations in `project.properties` if needed.

### XLT Framework for Apache Ant based Execution

The following steps explain what needs to be done to execute the test suite via the command line using Apache Ant.

#### Prerequisites

- XLT&reg; Framework v4.5 (or higher)
- Apache Ant

#### Installation

- [Download the XLT Framework](https://www.xceptance.com/en/xlt/download.html) and unzip it into a directory of your choice.
- Configure ant build.properties by setting the base path of your local XLT installation as "xlt.home.dir" property (This can be done relative to your ant base directory).
- Make sure that your test suite is running in the script developer (e.g. configure "storefront_url" via Manage Global Test Data ).

#### Usage
- Navigate into the base directory of this test suite with your console.
- Start the test suite by calling "ant basic". This calls the basic target and will execute all java based test cases.
- Start a single test case by calling "ant basic -Dtestname=[TTestcaseName]"
- Start test cases with an other WebDriver than the one specified in your default.properties by calling "ant basic -Dwebdriver=[WebdriverName]" (Make sure that you have specified the pathToDriverServer for this WebDriver)
- You can also start a single test with an other WebDriver by combining these options.
- To run your Java test cases in a parallel way (one browser per core) just call "ant parallel". The Webdriver parameter also applies to this call. BTW: Make sure that your test cases are independent of each other when using this feature.

### XLT Framework for Grunt or Gulp based Execution

The following steps explain how you can execute the test suite using grunt or gulp. 

#### Prerequisites

- XLT&reg; Framework v4.5 (or higher)
- Node
- Grunt or Gulp

#### Installation
- [Download the XLT Framework](https://www.xceptance.com/en/xlt/download.html) and unzip it into a directory of your choice.
- Configure the "pathToXLT" in the gruntfile.js or in the gulpfile.js by setting the base path of your local XLT installation (This can be done relative to your base directory).
- Make sure that your test suite is running in the script developer (e.g. configure "storefront_url" via Manage Global Test Data ).
- Install the node dependencies by calling "npm install".

#### Usage Grunt
- Start the test suite by calling "**grunt**". This calls the default target and will compile and execute all test cases.
- Call all test cases with a specific WebDriver without changing the properties file: "**grunt all:[WebDriver]**"
- Call a single test case: "**grunt single:[tests.package.TTestcaseName]**"
- Call a single test case with a specific WebDriver: "**grunt single:[tests.package.TTestcaseName]:[WebDriver]**"
- e.g. "**grunt single:tests.account.TAccount_CreateAccount:chrome**"

#### Usage Gulp
- Start the test suite by calling "**gulp**". This calls the default target and will compile and execute all test cases.
- Call all test cases with a specific WebDriver without changing the properties file: "**webdriver=[WebDriver] gulp**"
- Call a single test case with gulp: "**name=[tests.package.TTestcaseName] gulp single**"
- Call a single test case with a specific WebDriver gulp: "**name=[tests.package.TTestcaseName] webdriver=[WebDriver] gulp single**"
- e.g. "**name=tests.account.TAccount_CreateAccount webdriver=chrome gulp**"

## Test Suite Structure

This section gives a small introduction to the test suite structure. Please visit the generated [ScriptDoc](http://xceptance.github.io/SiteGenesis-Community-TestSuite/scriptdoc/index.html) for extended information on test data, packages, test cases and modules. The provided [Guide](https://github.com/dataduke/xlt-testsuite-documentation/blob/gh-pages/GUIDE.md) delivers conventions for test suite namings, instructions for test suite development, examples of test suite commands and links to additional resources. All planned features are publicly tracked as [GitHub issues](https://github.com/Xceptance/SiteGenesis-Community-TestSuite/issues). Feel free to add feature requests!

### Branches

This test suite features several SiteGenesis version branches. The __master__ is always the latest available version. Older versions can be found under their respective tag name such as __v15.3.2__ or in the branch of the version such as __15.3.X__.

### General

We have already build a __foundation__ of over __200 modules__ structured in over __30 packages__. Our __test set__ consists of over __20 tests__ based on empirical knowledge from our daily business projects. The aim is to cover standard functions of the shop system. This means all tests have to cover a wide variety of different test pathes. The modules can be used as building bricks to enlarge the current test set quickly.

    .
    |-- config                             # XLT framework configuration
    |-- scripts
    |   |-- modules/global                 # scripts for global elements
    |   |   |-- headerfooternav            # scripts for header, footer, nav elements
    |   |   \-- minicart                   # scripts for minicart elements in header
    |   |-- modules/helper                 # scripts for auxiliary services
    |   |-- modules/pages                  # scripts for specific pages
    |   |   |-- account                    # scripts for account pages
    |   |   |-- cart                       # scripts for cart page
    |   |   |-- catalog                    # scripts for catalog pages
    |   |   |-- checkout                   # scripts for checkout pages
    |   |   |-- homepage                   # scripts for homepage
    |   |   |-- productdetailpage          # scripts for productdetailpages
    |   |   \-- search                     # scripts for search and search result pages
    |   \-- tests
    |       |-- account                    # tests for account area
    |       |-- cart                       # tests for cart area
    |       |-- catalog                    # tests for catalog area
    |       |-- checkout                   # tests for checkout area
    |       |-- homepage                   # tests for homepage area
    |       |-- minicart                   # tests for minicart area
    |       \-- search                     # tests for search area
    |-- src
    |   |-- tests                          # XLT java wrapper classes
	|       \-- others                     # other sample tests
    |-- build.properties                   # XLT ant build properties
    |-- build.xml                          # XLT ant build configuration
    |-- xlt-scriptdeveloper.properties     # XLT Script Developer settings
    \-- global_testdata.properties         # global testdata properties

Please note that there is a special folder src/others to collect java based test examples e.g. testing via RemoteWebDriver against [Sauce Labs](https://saucelabs.com/).
	
### Packages

__Packages__ form the main structure of the test suite (project tree). Each package may consist of other sub packages (layers) and contains test cases (named `tests.subpackage`), script modules (named `modules.subpackage`) or optional Java modules. The file system implements them as folders.

### Tests

A __Test Case__ or short __Test__ (named `T...`) simulates a shop visit of a customer. A test focuses on a specific process part of the shop visit which is tested in depth. This test focus is assigned to a determined shop area. Every shop area has its own package (folder) so that each test can be filed. A test is build up on script modules. Each test consists of test setup (ensuring preconditions), test scope (focusing on relevant test steps) and test teardown (cleaning up of browser data).

### Modules

A __Script Module__ or short __Module__ (named `M...`), contains actions, commands and comments. Most modules interact with elements of a specific webpage. Thus it makes sense to structured them by their according pages. Each module can be reused by different tests.

__Validation Modules__ (named `V...`): Validation of webpage elements and dynamic data is a very essential part of testing. Hence these special modules evaluate that a needed fit criterion is met (mostly via assertions).

__Flow Modules__ (named `F...`): Some modules mimic more sophisticated shopping behaviors by interacting with several pages in a flow. The achieved specific goal at the end of the process is of most importance (in contrast to the taken singular steps). Flows often reuse other modules and allow a compact test structure. Examples: Add a basic product to cart; Create a new customer; Add an address to a customer; Check order status in order history.

There are also several __global modules__ for interactions with elements in header, footer or nav (placed in `modules.global`) and some __helper modules__ for converting text, generating random values and other auxiliaries (placed in `modules.helper`).

### Test Data

__Test Data__ or short __Data__ can be placed on global, package, module or test layer. Test data defined at a lower layer overwrites test data defined at a higher level (anti hierarchical handling).

## Test Suite Metadata

- Name: Demandware SiteGenesis Community TestSuite
- Version: v15.1 or higher (matching SiteGenesis)
- Release: March 2015
- License: MIT License
- License URI: http://opensource.org/licenses/MIT
- Tags: xlt, testing, best practices, test automation, functional testing, regression test, selenium

## Test Suite Contributors

- Various people at Xceptance Software Technologies GmbH
- Demandware, Inc.
