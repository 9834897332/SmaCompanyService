package com.kartik.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kartik.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
