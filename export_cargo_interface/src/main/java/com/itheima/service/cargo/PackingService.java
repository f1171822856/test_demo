package com.itheima.service.cargo;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.cargo.Packing;
import com.itheima.domain.cargo.PackingExample;

public interface PackingService {
    PageInfo findAll(PackingExample example, int page, int size);

    void save(Packing packingList);

    Packing findById(String id);

    void update(Packing packingList);

    void deleteById(String id);

}
