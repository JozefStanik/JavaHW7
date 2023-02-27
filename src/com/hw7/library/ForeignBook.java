package com.hw7.library;

public class ForeignBook extends Book{
	
private String languageOfBook;
	
	public ForeignBook(String nameOfBook, String authorOfBook, int numberOfPages, String languageOfBook) {
		super(nameOfBook, authorOfBook, numberOfPages);
		this.languageOfBook = languageOfBook;
	}
	
	public ForeignBook(String nameOfBook, String authorOfBook, int numberOfPages) {
		super("cav", authorOfBook, numberOfPages);
		this.languageOfBook = "English";
	}

}
