/**
 * 公司新闻查询表单
 * @author
 * @version 1.0.0
 */
Ext.define('kalix.common.order.view.OrderSearchForm', {
    extend: 'kalix.view.components.common.BaseSearchForm',
    alias: 'widget.orderSearchForm',
    xtype: 'orderSearchForm',
    storeId: 'orderStore',
    items: [
        {
            xtype: 'textfield',
            fieldLabel: '标题',
            labelAlign: 'right',
            labelWidth: 60,
            width: 200,
            name: '%title%'
        }]
});
