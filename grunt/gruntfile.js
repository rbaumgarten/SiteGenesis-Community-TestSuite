var grunt = require('grunt');
require('load-grunt-tasks')(grunt);

grunt.initConfig({
    shell: {
		callAnt:{
		 	command: 'ant -buildfile ./../build.xml'
		 }
    }
});
 
grunt.registerTask('default', ['shell']);