package com.kalix.common.order.dao;

import com.kalix.common.order.api.dao.IOrderBeanDao;
import com.kalix.common.order.entities.OrderBean;
import com.kalix.framework.core.impl.dao.GenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
//@Transactional
public class OrderBeanDaoImpl extends GenericDao<OrderBean, Long> implements IOrderBeanDao {
    @Override
    @PersistenceContext(unitName = "order-cm")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
