package com.itheima.stat.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.dao.stat.StatDao;
import com.itheima.stat.StatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@org.springframework.stereotype.Service
@Transactional
public class StatServiceImpl implements StatService {

    @Autowired
    private StatDao statDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Map> getFactoryData(String companyId) {
        return statDao.genFactoryData(companyId);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Map> getSellCharts(String companyId) {
        return statDao.sellCharts(companyId);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Map> getOnlineCharts(String companyId) {
         List<Map> list = statDao.onlineCharts(companyId);
        return list;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Map> getLogCharts(String companyId) {
        List<Map> mapList = statDao.getLogCharts(companyId);
        System.out.println("......................");
        System.out.println("......................");
        System.out.println("service层:"+mapList);
        System.out.println("......................");
        System.out.println("......................");
        return mapList;
    }

    @Override
    public List<Map> getpriceCharts() {
        return statDao.getpriceCharts();
    }
}
