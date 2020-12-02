package com.cg.onlinepizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinepizza.model.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Integer>{
	
		
}
