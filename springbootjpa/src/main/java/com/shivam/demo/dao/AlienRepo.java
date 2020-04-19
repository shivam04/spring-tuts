package com.shivam.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.shivam.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{ //for crud opearions
	
	List<Alien> findByTech(String tech);
	
	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findByTechSorted(String tech);
	
}