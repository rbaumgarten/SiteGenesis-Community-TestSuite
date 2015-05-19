var gulp  = require('gulp')
var shell = require('gulp-shell')

gulp.task('default', ['all'], function(){
});

gulp.task('all', shell.task([
  'cd .. && ant basic'
]));

var name = process.env.name;

gulp.task('single', function (){
	if (!name || !name.length){ 
		console.log('You need to provide the name of a test script.');
	} else {
		return gulp.src('').pipe(shell(['cd .. && ant basic -Dtestname=' + name]));
	}
});
