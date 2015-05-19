var grunt = require('grunt');
require('load-grunt-tasks')(grunt);

grunt.initConfig({
	shell: {
		all:{
			command: 'cd .. && ant basic'
		},
		single: {
			command: function(name){
				return 'cd .. && ant basic -Dtestname=' + name;
			}
		}
	}
});

grunt.registerTask('all', function() {
	grunt.task.run('shell:all');
});

grunt.registerTask('single', function(name) {
	if (!name || name.length == 0) {
		grunt.warn('You need to provide the name of a test script.');
	} else {
		grunt.task.run('shell:single:'+name);
	}
});

grunt.registerTask('default', ['all']);