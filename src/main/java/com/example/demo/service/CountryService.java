package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepo;

@Service
public class CountryService {
	
	@Autowired
	private final CountryRepo countryRepo;

	public CountryService(CountryRepo countryRepo) {
		super();
		this.countryRepo = countryRepo;
	}

	public Country addCountry(Country country) {
		return countryRepo.save(country);
	}
	
	public List<Country> getAllCuntries(){
		return countryRepo.findAll();
	}
	
	public Country updateCountry(Country country) {	
		return countryRepo.save(country);	
	}
		
	public void deleteCountry(int id) {	
		countryRepo.deleteById(id);
	}
}
