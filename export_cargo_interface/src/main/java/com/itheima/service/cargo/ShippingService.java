package com.itheima.service.cargo;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.cargo.ShippingOrder;
import com.itheima.domain.cargo.ShippingOrderExample;

public interface ShippingService {
    /**
     * 分页查询
     * @param shippingOrderExample
     * @param page
     * @param pageSize
     * @return
     */
    PageInfo findAll(ShippingOrderExample shippingOrderExample, int page, int pageSize);

    /**
     * 根据feedback.id进行查询单条反馈记录
     * @param id
     * @return
     */
    ShippingOrder findById(String id);

    void save(ShippingOrder shippingOrder,String id);

    void update(ShippingOrder shippingOrder);

    void delete(String id);
}
