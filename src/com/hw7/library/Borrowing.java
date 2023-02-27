package com.hw7.library;

import java.time.LocalDate;

public class Borrowing {
	public Borrowing(Book book, Subscriber subscriber, LocalDate actualDate) {
		this.book = book;
		this.subscriber = subscriber;
		this.actualDate = actualDate;
	}
	
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	private LocalDate actualDate;
	private Book book;
	private Subscriber subscriber;
	private LocalDate returnDate;
}
