package com.kalix.common.order.biz;

import com.kalix.common.order.api.biz.IOrderBeanService;
import com.kalix.common.order.api.dao.IOrderBeanDao;
import com.kalix.common.order.entities.OrderBean;
import com.kalix.framework.core.api.persistence.JsonStatus;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.framework.core.util.Assert;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class OrderBeanServiceImpl extends ShiroGenericBizServiceImpl<IOrderBeanDao, OrderBean> implements IOrderBeanService {
    @Override
    public void beforeSaveEntity(OrderBean entity, JsonStatus status) {
        String userName = shiroService.getCurrentUserRealName();
        Assert.notNull(userName, "用户名不能为空.");
        if (StringUtils.isNotEmpty(userName)) {
            entity.setPublishPeople(userName);
        }
        super.beforeSaveEntity(entity, status);
    }
}
