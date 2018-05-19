/**
 * 公司新闻数据仓库
 *
 * @author
 * @version 1.0.0
 */
Ext.define('kalix.common.order.store.OrderStore', {
    extend: 'kalix.store.BaseStore',
    model: 'kalix.common.order.model.OrderModel',
    alias: 'store.orderStore',
    xtype: 'orderStore',
    storeId: 'orderStore',
    proxyUrl: CONFIG.restRoot + '/camel/rest/orders'
});