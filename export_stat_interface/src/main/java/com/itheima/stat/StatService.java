package com.itheima.stat;

import java.util.List;
import java.util.Map;

public interface StatService {

    List<Map> getFactoryData(String companyId);

    List<Map> getSellCharts(String companyId);

    List<Map> getOnlineCharts(String companyId);

    List<Map> getLogCharts(String companyId);

    List<Map> getpriceCharts();
}
