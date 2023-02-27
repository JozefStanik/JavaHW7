package com.hw7.library;

public class Book {
	
	private String nameOfBook;
	private String authorOfBook;
	private int numberOfPages;
	
	public Book(String nameOfBook, String authorOfBook, int numberOfPages) {
		this.nameOfBook = nameOfBook;
		this.authorOfBook = authorOfBook;
		this.numberOfPages = numberOfPages;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}
}
