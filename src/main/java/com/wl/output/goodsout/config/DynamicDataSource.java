package com.wl.output.goodsout.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


public class DynamicDataSource extends AbstractRoutingDataSource {

    private static final String MASTER = "masterDataSource";
    /*
     * 代码中的determineCurrentLookupKey方法取得一个字符串，
     * 该字符串将与配置文件中的相应字符串进行匹配以定位数据源，配置文件，即applicationContext.xml文件中需要要如下代码：(non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#determineCurrentLookupKey()
     */
    @Override
    protected Object determineCurrentLookupKey() {

        String datasource = DynamicDataSourceContextHolder.getDataSourceType();
        if(null == datasource || MASTER==datasource || ""==datasource){
            return MASTER;
        }
        /*
         * DynamicDataSourceContextHolder代码中使用setDataSourceType
         * 设置当前的数据源，在路由类中使用getDataSourceType进行获取，
         *  交给AbstractRoutingDataSource进行注入使用。
         */
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}
