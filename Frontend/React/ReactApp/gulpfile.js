let gulp = require('gulp');
let sass = require('gulp-sass');
const webpack = require('webpack');
const webpackConfig = require('./webpack.config');
const moment = require("moment");
const clear = require('cli-clear');

gulp.task('default',['webpack','style'], function () {
    // console.log("gulp command is working.");
});
gulp.task('style', () => {
    return gulp.src('./style/**/*.scss')
        .pipe(sass().on('error', sass.logError))
        .pipe(gulp.dest('./dist'))
});

gulp.task('webpack', function () {
    webpack(webpackConfig).watch({
        aggregateTimeout: 0,
        poll: 5000
    }, (err, stats) => {
        clear();
        console.log('[' + moment().format('LTS') + '] Webpack watching...');
        if (stats.hasErrors() || stats.hasWarnings()) {
            console.log(stats.toString('errors-only'));
            console.log('[' + moment().format('LTS') + '] Webpack build failed!');
        } else {
            console.log(stats.toString({
                children: false,
                assets: false,
                chunks: true,
                chunkModules: false,
                colors: true,
                errors: false,
                timings: true,
                reasons: false,
                source: false,
                modules: false
            }));
            console.log('[' + moment().format('LTS') + '] Webpack build complete successfully');
        }
    });
});