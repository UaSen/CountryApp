package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Country;

public interface CountryRepo extends JpaRepository<Country, Integer>{
	
	/**
	 * created interface extending JpaRepository
	 * @param Country class, PrimaryKey type
	 */

}
