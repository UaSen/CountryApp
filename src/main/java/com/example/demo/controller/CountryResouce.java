package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Country;
import com.example.demo.service.CountryService;

@RestController
@RequestMapping("/rest/v2/")
public class CountryResouce {
	
	private final CountryService countryService;

	public CountryResouce(CountryService countryService) {
		super();
		this.countryService = countryService;
	}

	@GetMapping("all")
	public ResponseEntity<List<Country>> getAllCountries(){
		
		List<Country> countries = countryService.getAllCuntries();
		return new ResponseEntity<>(countries,HttpStatus.OK);
		
	}
	
	@PostMapping("add")
	public ResponseEntity<Country> addCountry(@RequestBody Country country){

		Country newCountry = countryService.addCountry(country);
		return new ResponseEntity<>(newCountry,HttpStatus.OK);
	}
	
	@PutMapping("update")
	public ResponseEntity<Country> updateCountry(@RequestBody Country country){
		
		Country updateCountry = countryService.updateCountry(country);
		return new ResponseEntity<>(updateCountry,HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteCountry(@PathVariable int id){
		
		countryService.deleteCountry(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
