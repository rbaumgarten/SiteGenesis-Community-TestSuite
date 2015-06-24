var grunt = require('grunt');
var xlt = require('node-xlt');
xlt.setOptions({pathToXLT: '../PATH_TO_XLT'});

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
  xlt.checkPrerequisites( );
});

grunt.registerTask('compile', function() {
  xlt.compileAllTestCases( );
});

grunt.registerTask('runAll', function() {
  xlt.runAllTestCases( );
});

grunt.registerTask('run', ['javaversion', 'checkPrerequisites', 'compile']);

grunt.registerTask('single', ['run'] function(name){
    xlt.runSingleTestCase( name );
});

grunt.registerTask('default', ['run', 'runAll']);