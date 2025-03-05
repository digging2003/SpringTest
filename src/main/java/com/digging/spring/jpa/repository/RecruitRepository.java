package com.digging.spring.jpa.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.digging.spring.jpa.domain.Recruit;

public interface RecruitRepository extends JpaRepository<Recruit, Integer> {
	// info3
    List<Recruit> findByPositionAndType(String position, String type);
	
	// info4
	List<Recruit> findByTypeOrSalaryGreaterThanEqual(String type, int salary);
	
	// info5
	List<Recruit> findTop3ByTypeOrderBySalaryDesc(String type);
	
	// info6
	List<Recruit> findByRegionAndSalaryBetween(String region, int salary1, int salary2);
	
	// info7
	List<Recruit> findByTypeAndSalaryGreaterThanEqualAndDeadlineGreaterThanOrderBySalaryDesc(String type, int salary, LocalDateTime deadline);
	
	
}
