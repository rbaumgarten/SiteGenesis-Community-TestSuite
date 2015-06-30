var gulp  = require('gulp')
var xlt = require('node-xlt');

var xltOptions = {pathToXLT: '../PATH_TO_XLT'};
var webdriver = process.env.webdriver;
if (!webdriver || webdriver.length == 0) { 
    xltOptions.xltWebDriver = null;
} else {
    xltOptions.xltWebDriver = webdriver;
}
xlt.setOptions(xltOptions);


gulp.task('javaversion', function() {
    xlt.javaVersion(function(err, res){});
});

gulp.task('checkPrerequisites', function() {
    xlt.deleteTestCaseDirectory();
    xlt.checkPrerequisites()
});

gulp.task('compile', function() {
    xlt.compileAllTestCases();
});

gulp.task('run', ['javaversion', 'checkPrerequisites', 'compile']);

gulp.task('all',['run'], function() {
    xlt.runAllTestCases( );
});

gulp.task('single',['run'], function (){
    var name = process.env.name;
    if (!name || name.length == 0) { 
        grunt.warn('You need to provide the name of a test script.'); 
    } else { 
        xlt.runSingleTestCase(name);
    }
});

gulp.task('default', ['all']);