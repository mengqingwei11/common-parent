/**
 * 公司新闻首页
 *
 * @author
 * @version 1.0.0
 */
Ext.define('kalix.common.order.Main', {
    extend: 'kalix.container.BaseContainer',
    requires: [
        'kalix.common.order.view.OrderGrid',
        'kalix.common.order.view.OrderSearchForm'
    ],
    items: [
        {
            title: '公司新闻查询',
            xtype: 'orderSearchForm'
        }, {
            xtype: 'orderGridPanel',
            id: 'orderGridPanel',
            title: '公司新闻列表'
        }
    ]
});
