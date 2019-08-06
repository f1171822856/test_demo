package com.itheima.service.cargo;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.cargo.Contract;
import com.itheima.domain.cargo.ContractExample;
import com.itheima.domain.vo.ContractProductVo;

import java.util.List;

public interface ContractService {

	//根据id查询
    Contract findById(String id);

    //保存
    void save(Contract contract);

    //更新
    void update(Contract contract);

    //删除
    void delete(String contractId);

    //分页查询
	public PageInfo findAll(ContractExample example, int page, int size);

    List<ContractProductVo> printExcel(String inputDate);

    void updateState(String id);
}
