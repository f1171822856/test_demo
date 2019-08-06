package com.itheima.service.system;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.system.Company;
import com.itheima.domain.vo.PageBean;

public interface CompanyService {
    PageInfo<Company> findAllCompanies(int pageNum, int pageSize);

    boolean addCompany(Company company);

    boolean updateCompany(Company company);

    boolean deleteCompany(String id);

    Company findCompanyById(String id);

    PageBean<Company> findAllCompanies2(int pageNum, int pageSize);
}
