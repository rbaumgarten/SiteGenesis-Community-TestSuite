var gulp  = require('gulp')
var xlt = require('node-xlt');
xlt.setOptions({pathToXLT: '../PATH_TO_XLT'});

gulp.task('javaversion', function() {
  xlt.javaVersion(function(err, res){});
});

gulp.task('checkPrerequisites', function() {
  xlt.checkPrerequisites( );
});

gulp.task('compile', function() {
  xlt.compileAllTestCases( );
});

gulp.task('runAll', function() {
  xlt.runAllTestCases( );
});

gulp.task('default', ['javaversion', 'checkPrerequisites', 'compile', 'runAll']);