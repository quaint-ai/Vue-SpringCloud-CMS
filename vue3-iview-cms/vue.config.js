module.exports = {
    baseUrl: './',
    productionSourceMap: false,
    devServer: {
        proxy: {
            '/*':{
                target:'http://localhost',
                changeOrigin:true,
            }
        }
    }
}