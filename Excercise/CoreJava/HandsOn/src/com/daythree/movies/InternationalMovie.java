package com.daythree.movies;

public class InternationalMovie extends Movie {

	private String country;
	private String language;

	public InternationalMovie(String movieName, String producedBy, String directedBy, byte duration, int year,
			String category, String country, String language) {
		super(movieName, producedBy, directedBy, duration, year, category);
		this.country = country;
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
		
	}
	
	@Override
	public String showDetails() {
		return super.showDetails()+", Country="+country+", Language="+language;
	}
	


}
