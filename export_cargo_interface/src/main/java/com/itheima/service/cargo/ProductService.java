package com.itheima.service.cargo;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.cargo.Product;
import com.itheima.domain.cargo.ProductExample;

import java.util.List;


public interface ProductService {



    void save(Product product);

    void update(Product product);

    void deleteById(String id);

    Product findById(String id);

    PageInfo findAll(Integer page, Integer pageSize);

    PageInfo findAll(ProductExample productExample, Integer page, Integer pageSize);
}
