package com.daythree.movies;

public class TestMovies {

	public static void main(String[] args) {
		Movie m = new Movie("Gilli", "Karthi");
		System.out.println(m.showDetails());
		System.out.println("---------------------------");

		SpecialMovie sm = new SpecialMovie("Spiderman", "Tom", "Dolby", "3D");
		System.out.println(sm.showDetails());
		System.out.println("---------------------------");

		InternationalMovie im = new InternationalMovie("WonderWomen", "Harry", "Mark", (byte) 2, 1999, "Adventure",
				"US", "English");
		System.out.println(im.showDetails());

	}

}
