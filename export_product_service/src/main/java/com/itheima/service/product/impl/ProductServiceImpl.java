package com.itheima.service.product.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.itheima.dao.cargo.ProductDao;
import com.itheima.domain.cargo.Product;
import com.itheima.domain.cargo.ProductExample;
import com.itheima.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public PageInfo findAll(ProductExample example, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Product> productList = productDao.selectByExample(example);
        return new PageInfo(productList);
    }

    @Override
    public void save(Product product) {
        productDao.insert(product);
    }

    @Override
    public void update(Product product) {
        productDao.updateByPrimaryKeySelective(product);
    }

    @Override
    public void deleteById(String productId) {
        productDao.deleteByPrimaryKey(productId);
    }

    @Override
    public Product findById(String productId) {
        return productDao.selectByPrimaryKey(productId);
    }
}
