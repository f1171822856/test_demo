package com.itheima.service.system;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.system.Dept;

import java.util.List;

public interface DeptService {

    boolean deleteDept(String id);

    boolean updateDept(Dept dept);

    boolean addDept(Dept dept);

    Dept findDeptById(String id, String companyId);

    PageInfo<Dept> findAllDepts(Integer pageNum, Integer pageSize, String companyId, String searchOpt);

    List<Dept> findParents(String companyId, String deptId);

    boolean delete(String id);

    PageInfo<Dept> searchByDeptName(Integer pageNum, Integer pageSize, String companyId, String deptName);

    List<Dept> findChildren(String parentId);
}
