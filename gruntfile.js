var grunt = require('grunt');

var xlt = require('node-xlt');
xlt.setOptions({
                baseDir: './',
                testSrcDir: 'src/',
                testClassesDir: 'classes/',
                testCasesJava: '**/T*.java',
                testCasesClass: '**/T*.class',
                pathToXLT: '../..'
            });

grunt.initConfig({
});

grunt.registerTask('runAll', function() {
  xlt.runAllTestCases( );
});

grunt.registerTask('compile', function() {
  xlt.compileAllTestCases( );
});

grunt.registerTask('javaversion', function() {
  var done = this.async();
  xlt.javaVersion(function(err, res){
    console.log("Vers= "+ res);
    done(true);
  });
});



grunt.registerTask('default', ['javaversion', 'compile', 'runAll']);