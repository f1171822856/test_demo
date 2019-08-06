package com.itheima.service.cargo;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.cargo.Finance;
import com.itheima.domain.cargo.FinanceExample;

public interface FinanceService {
    PageInfo findAll(FinanceExample example, Integer pageNum, Integer pageSize);

    Finance findById(String id);

    void delete(String id);

    void add(Finance finance);

    void update(Finance finance);
}
