let path = require("path");
let cleanWebPackPlugin=require('clean-webpack-plugin');
let HtmlWebpackPlugin = require('html-webpack-plugin');
let CopyWebpackPlugin = require('copy-webpack-plugin');

let pathsToClean=[
    'dist/*.js',
    'dist/*.map',
    'dist/*.html',
];

let cleanOptions={
    verbose:false,
    dry:false
}


module.exports = {

    mode: "development",
    entry: "./src/index.tsx",
    output: {
        filename: "[chunkhash].bundle.js",
        chunkFilename: '[chunkhash].bundle.js',
        path: path.resolve(__dirname, 'dist')
    },
    optimization: {
        splitChunks: {
            chunks: 'all'
        }
    },
    devtool: "source-map",
    devServer: {
        contentBase: path.join(__dirname, "dist"),
        compress: true,
        port: 3000
    },
    resolve: {
        extensions: [".ts", ".tsx", ".js", ".jsx", ".json"]
    },
    module: {
        rules: [{
                test: /\.tsx?$/,
                loader: 'awesome-typescript-loader'
            },
            {
                enforce: 'pre',
                test: /\.js$/,
                loader: "source-map-loader"
            }
        ]
    },
    plugins:[
        new cleanWebPackPlugin(pathsToClean,cleanOptions),
        new HtmlWebpackPlugin({
            title: 'React App',
            template: path.resolve(__dirname, 'index.html')
        }),
        new CopyWebpackPlugin([
            './node_modules/react/umd/react.development.js',
            './node_modules/react-dom/umd/react-dom.development.js'
        ], ['./dist/react.development.js',
            './dist/react-dom.development.js'
        ], {
            force: true
        })
    ],
    externals: {
        "react": "React",
        "react-dom": "ReactDOM"
    }
}