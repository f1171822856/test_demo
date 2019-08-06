package com.itheima.service.cargo;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.cargo.ExportProduct;
import com.itheima.domain.cargo.ExportProductExample;

public interface ExportProductService {

    void save(ExportProduct export);

    void update(ExportProduct export);

    void delete(String id);

    ExportProduct findById(String id);

    PageInfo findAll(ExportProductExample example, int page, int size);
}
