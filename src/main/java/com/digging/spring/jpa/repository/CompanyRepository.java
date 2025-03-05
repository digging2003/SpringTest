package com.digging.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digging.spring.jpa.domain.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>  {

}
