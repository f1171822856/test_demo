package com.itheima.service.product;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.cargo.Product;
import com.itheima.domain.cargo.ProductExample;


public interface ProductService {

    PageInfo findAll(ProductExample example, int pageNum, int pageSize);

    void save(Product product);

    void update(Product product);

    void deleteById(String id);

    Product findById(String id);
}
