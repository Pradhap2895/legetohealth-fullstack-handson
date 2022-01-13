package com.daythree.movies;

public class Movie {

	private String movieName;
	private String producedBy;
	private String directedBy;
	private byte duration;
	private int year;
	private String category;

	public static int moviesCount = 0;

	private String moviesId;

	public String getMoviesId() {
		return moviesId;
	}

	public Movie(String movieName, String producedBy) {
		this.movieName = movieName;
		this.producedBy = producedBy;
		moviesCount++;
		moviesId = movieName + "_" + moviesCount;
	}

	public Movie(String movieName, String producedBy, String directedBy, byte duration, int year, String category) {
		this(movieName, producedBy);
		this.directedBy = directedBy;
		this.duration = duration;
		this.year = year;
		this.category = category;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getProducedBy() {
		return producedBy;
	}

	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}

	public String getDirectedBy() {
		return directedBy;
	}

	public void setDirectedBy(String directedBy) {
		this.directedBy = directedBy;
	}

	public byte getDuration() {
		return duration;
	}

	public void setDuration(byte duration) {
		this.duration = duration;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String showDetails() {
		return " moviesId=" + moviesId + ", movieName=" + movieName + ", producedBy=" + producedBy + ", directedBy="
				+ directedBy + ", duration=" + duration + ", year=" + year + ", category=" + category;
	}

}
