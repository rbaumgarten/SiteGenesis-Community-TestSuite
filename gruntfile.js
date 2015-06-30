var grunt = require('grunt');
var xlt = require('node-xlt');

var xltOptions = {pathToXLT: '../PATH_TO_XLT'};
xlt.setOptions(xltOptions);

function setWebdiver(webdriver) {
    if (!webdriver || webdriver.length == 0 || webdriver == "undefined") { 
        xltOptions.xltWebDriver = null;
    } else {
        xltOptions.xltWebDriver = webdriver;
    }
    xlt.setOptions(xltOptions);
};

grunt.initConfig({
});

grunt.registerTask('javaversion', function() {
    var done = this.async();
    xlt.javaVersion(function(err, res){
        console.log("Vers= "+ res);
        done(true);
    });
});

grunt.registerTask('checkPrerequisites', function() {
    xlt.checkPrerequisites();
});

grunt.registerTask('compile', function() {
    xlt.deleteTestCaseDirectory();
    xlt.compileAllTestCases();
});

grunt.registerTask('run', ['javaversion', 'checkPrerequisites', 'compile']);

grunt.registerTask('runall', function(webdriver) {
    setWebdiver(webdriver);
    xlt.runAllTestCases( );
});

grunt.registerTask('all', function(webdriver) {
    grunt.task.run(['run', 'runall:'+webdriver]);
});

grunt.registerTask('runsingle', function(name, webdriver){
    setWebdiver(webdriver);
    if (!name || name.length == 0 || name == "undefined") { 
        grunt.warn('You need to provide the name of a test script.'); 
    } else { 
        xlt.runSingleTestCase(name);
    }
});

grunt.registerTask('single', function(name, webdriver) {
    grunt.task.run(['run', 'runsingle:'+name+':'+webdriver]);
});

grunt.registerTask('default', ['all']);