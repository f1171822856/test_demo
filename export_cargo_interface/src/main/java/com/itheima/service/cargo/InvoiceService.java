package com.itheima.service.cargo;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.cargo.Invoice;
import com.itheima.domain.cargo.InvoiceExample;
import com.itheima.domain.feedback.Feedback;

public interface InvoiceService {
    /**
     * 保存
     */
    void save(Invoice invoice);

    /**
     * 更新
     */
    void update(Invoice invoice);

    /**
     * 删除
     */
    void delete(String id);

    /**
     * 根据id查询
     */
    Invoice findById(String id);

    /**
     * 分页查询
     */
    PageInfo findAll(InvoiceExample example, int page, int size);


}
