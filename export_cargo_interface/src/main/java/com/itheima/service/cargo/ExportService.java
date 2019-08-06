package com.itheima.service.cargo;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.cargo.Export;
import com.itheima.domain.cargo.ExportExample;

/**
出口报运
 */
public interface ExportService {
	/**
	 * 保存
	 */
	void save(Export export);

	/**
	 * 更新
	 */
	void update(Export export);

	/**
	 * 删除
	 */
	void delete(String id);

	/**
	 * 根据id查询
	 */
	Export findById(String id);

	/**
	 * 分页查询
	 */
	PageInfo findAll(ExportExample example, int page, int size);

    void exportE(String exportId);

}
