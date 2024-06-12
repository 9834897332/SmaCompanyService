package com.kartik.service;

import java.util.List;

import com.kartik.entity.Company;

public interface ICompanyService {
 
	
	Long createCompany(Company cob);
	void updateCompany(Company cob);
	Company getOneCompany(Long id);
	List<Company> getAllCompanies();
}
