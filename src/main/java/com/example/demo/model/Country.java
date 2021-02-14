package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country implements Serializable {
	
	/**
	 * implements Serializable class
	 * easy to transform different types of streams
	 **/
	 
	
	//declare private variables
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private int id;
	@Column(nullable = false)
	private String countryName;
	@Column(nullable = false)
	private String continent;
	@Column(nullable = false)
	private String capital;
	@Column(nullable = false)
	private String currency;
	@Column(nullable = false)
	private boolean island;
	@Column(nullable = false)
	private String imageUrl;
	
	//default constructor
	public Country() {
		
	}
	
	//parameterize constructor
	public Country(int id, String countryName, String continent, String capital, String currency, boolean island,
			String imageUrl) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.continent = continent;
		this.capital = capital;
		this.currency = currency;
		this.island = island;
		this.imageUrl = imageUrl;
	}
	
	//getter to get id
	public int getId() {
		return id;
	}
	
	//setter to set id
	public void setId(int id) {
		this.id = id;
	}
	
	//getter to get countryName
	public String getCountryName() {
		return countryName;
	}
	
	//setter to set countryName
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	//getter to get continent
	public String getContinent() {
		return continent;
	}
	
	//setter to set continent
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	//getter to get capital
	public String getCapital() {
		return capital;
	}
	
	//setter to set capital
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	//getter to get currency
	public String getCurrency() {
		return currency;
	}
	
	//setter to set currency
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	//getter to get island
	public boolean isIsland() {
		return island;
	}
	
	//setter to set island
	public void setIsland(boolean island) {
		this.island = island;
	}
	
	//getter to get imageUrl
	public String getImageUrl() {
		return imageUrl;
	}
	
	//setter to set imageUrl
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	//to string method to easy to convert to strings
	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName + ", continent=" + continent + ", capital="
				+ capital + ", currency=" + currency + ", island=" + island + ", imageUrl=" + imageUrl + "]";
	}
	

}
